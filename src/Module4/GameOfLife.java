package Module4;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class GameOfLife extends JPanel {

    int[][] buffer;
    int[][] bufferTemp;
    int gameWidth;
    int gameHeight;
    int blockSize;

    public static void main(String[] args) {
        JFrame window = new JFrame("GoL");
        GameOfLife gol = new GameOfLife();
        window.setContentPane(gol);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        gol.startGame();
    }

    public GameOfLife() {

        buffer = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        bufferTemp = new int[buffer.length][buffer[0].length];

        blockSize = 20;
        gameWidth = blockSize * buffer[0].length;
        gameHeight = blockSize * buffer.length;

        this.setPreferredSize(new Dimension(gameWidth, gameHeight));

    }

    public void startGame() {
        while (true) {
            printFrame(); // Console
            repaint(); // GUI
            sleep();
            updateBufferTemp();
            saveTempBuffer();

        }
    }

    private void sleep() {
        try {
            Thread.sleep(250);
        } catch (Exception e) {
            System.out.println("Error in sleeping thread");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.WHITE);
        g.drawRect(0, 0, gameWidth, gameHeight);
        g.setColor(Color.BLACK);
        for (int row = 0; row < buffer.length; row++) {
            for (int col = 0; col < buffer[row].length; col++) {
                if (buffer[row][col] == 1) {
                    g.fillRect(col * blockSize, row * blockSize, blockSize, blockSize);
                }
            }
        }
    }

    private void updateBufferTemp() {
        for (int row = 0; row < buffer.length; row++) {
            for (int col = 0; col < buffer[row].length; col++) {
                int neighbours = countNeighbours(row, col, buffer);
                int cellValue = buffer[row][col];

                if (cellValue == 1 && (neighbours < 2 || neighbours > 3)) {
                    bufferTemp[row][col] = 0; // Dies
                } else if (cellValue == 1 && (neighbours > 1 && neighbours < 4)) {
                    bufferTemp[row][col] = 1; // Cell lives
                } else if (cellValue == 0 && neighbours == 3) {
                    bufferTemp[row][col] = 1; // Cell reborn
                }

            }
        }
    }

    private int countNeighbours(int row, int col, int[][] src) {
        int neighbourCount = 0;
        for (int y = row - 1; y <= row + 1; y++) {
            for (int x = col - 1; x <= col + 1; x++) {

                if (y < 0 || y > src.length - 1 || x < 0 || x > src[y].length - 1 || (y == row && x == col)) { // Check if outside of area, and check if counting self
                    continue;
                } else if (src[y][x] == 1) { // Check if alive
                    neighbourCount++;
                }
            }
        }
        return neighbourCount;
    }

    private void saveTempBuffer() {
        for (int row = 0; row < buffer.length; row++) {
            for (int col = 0; col < buffer[row].length; col++) {
                buffer[row][col] = bufferTemp[row][col];
            }
        }
    }

    private void printFrame() {
        for (int row = 0; row < buffer.length; row++) {
            for (int col = 0; col < buffer[row].length; col++) {
                System.out.format("%s", buffer[row][col] > 0 ? "x" : " ");
            }
            System.out.println("");
        }
        System.out.println("-------- NEW FRAME --------");
    }
}
