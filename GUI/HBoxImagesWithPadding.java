import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
   This program demonstrates padding and spacing
*/
public class HBoxImagesWithPadding extends Application
{
   public static void main(String[] args)
   {
      //Launch the application
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      //Create the Image Objects
      Image moonImage = new Image("file:Moon.png");
      Image shipImage = new Image("file:ship.png");
      Image sunsetImage = new Image("file:Sunset.png");
      
      //Create the ImageView objects
      ImageView moonIView = new ImageView(moonImage);
      ImageView shipIView = new ImageView(shipImage);
      ImageView sunsetIView = new ImageView(sunsetImage);
      
      //Resize the moon image, preserving its aspect ratio
      moonIView.setFitWidth(200);
      moonIView.setPreserveRatio(true);
      
      //Resize the ship image, preserving its aspect ratio
      shipIView.setFitWidth(200);
      shipIView.setPreserveRatio(true);
      
      //Resize the sunset image, preserving its aspect ratio
      sunsetIView.setFitWidth(200);
      sunsetIView.setPreserveRatio(true);
      
      //Put the ImageViews in a Hbox
      HBox hbox = new HBox(10,moonIView,shipIView,sunsetIView);
      
      //Put 30 pixels of padding around the HBox.
      hbox.setPadding(new Insets(30));
      
      //Create a Scene with the HBox as its root node
      Scene scene = new Scene(hbox);
      
      // Add the Scene to the Stage
      primaryStage.setScene(scene);
      
      //Set the stage title
      primaryStage.setTitle("Images");
      
      //Show the window
      primaryStage.show();
   }
}