import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;  
/**
   A simple JavaFX GUI application
*/

public class MyFirstGUI extends Application
{
   public static void main (String[] args)
   {
      //Launch the application
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      //Set the stage title.
      primaryStage.setTitle("My first GUI Application");
      
      //Show the Window
      primaryStage.show();
      
      
   }
}