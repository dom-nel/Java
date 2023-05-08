import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

/**
   A button Demo
*/

public class ButtonDemo extends Application
{
   public static void main(String args)
   {
      //launch the application
      launch(args);
   }
   
   @Override 
   public void start(Stage primaryStage)
   {
      //Create a label control
      Label myLabel = new Label("click the button to see a message");
      
      //Create a Button control 
      Button myButton = new Button("Click Me");
      
      //Put the label and button in a VBox with 10 pixels of spacing
      VBox vbox = new VBox(10, myLabel, myButton);
      
      //Create a Scene with the VBox as its root node 
      Scene scene = new Scene(vbox, 300, 100);
      
      //Set the scene's alignment to center
      vbox.setAlignment(Pos.CENTER);
      
      //Add the Scene to the Stage
      primaryStage.setScene(scene);
      
      //Set the stage title
      primaryStage.setTitle("Button Demo");
      
      //Show the window
      primaryStage.show();
   }
}