import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;  
/**
   A simple JavaFX GUI application
*/

public class HelloWorld extends Application
{
   public static void main (String[] args)
   {
      //Launch the application
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      //Create a Label control
      Label messageLabel = new Label("Hello World");
      
      //Put the label in an HBox
      HBox hbox = new HBox(messageLabel);
      
      //Create a Scene with the HBox as its root node
      Scene scene = new Scene(hbox, 300, 100);//width and height
      
      //Add the scene to the Stage
      primaryStage.setScene(scene);
      
      //Set the stage title
      primaryStage.setTitle("My First Scene");
      
      //Show the window
      primaryStage.show();
   }
}