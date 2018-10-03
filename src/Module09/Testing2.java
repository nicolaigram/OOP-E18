package Module09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nicolai Gram
 */
public class Testing2 extends Application {
    
    Button btn;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TESTER!");
        
        btn = new Button("Click me!");
        
        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        
        Scene scene = new Scene(layout, 600, 300);
        primaryStage.setScene(scene);
        
        
        primaryStage.show();
    }
    

}
