package Module10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Nicolai Gram
 */
public class Test extends Application {

    int x;
    int y;
    int h;
    int w;
    GraphicsContext gc;
    Canvas canvas;

    public static void main(String[] args) {
        launch(args);
    }

    public Test() {
        x = 50;
        y = 0;
        h = 50;
        w = 50;
    }

    public void updateY() {
        y += 1;
        gc.setFill(Color.rgb(200, 75, 75));
        gc.fillRect(x, y, w, h);
    }

    public void startAnimation() throws InterruptedException {
        while (true) {
            Thread.sleep(1000 / 30);
            updateY();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("Test");
        canvas = new Canvas(250, 250);
        gc = canvas.getGraphicsContext2D();

        StackPane layout = new StackPane();
        layout.getChildren().add(canvas);

        Scene scene = new Scene(layout, 300, 300);

        window.setScene(scene);
        window.show();

        updateY();

    }

}
