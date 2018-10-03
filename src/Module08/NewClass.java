package Module08;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author Nicolai Gram
 */
public class NewClass {
    
    

    public static void main(String[] args) {
        Window window = new Window("Title");
        Content content = new Content();
        window.init(content);
    }
}

class Content extends JPanel {

    public Content() {
        this.setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.red);
        g.fillRect(0, 0, 50, 50);
    }
    
    
}

class Window extends JFrame {

    public Window(String title) throws HeadlessException {
        super(title);
    }
    
    public void init(Content content) {
        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
