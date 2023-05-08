import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
   GridPane Demo
*/
public class GridPaneImages extends Application
{
   public static void main(String[] args)
   {
      //Launch the application
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      //Create some label controls
      Image moonImage = new Image("file:moon.png");
      Image shipImage = new Image("file:ship.png");
      Image sunsetImage = new Image("file:sunset.png");
      Image flowerImage = new Image("file:flower.png");
      
      //Create the ImageView components
      ImageView moonIView = new ImageView(moonImage);
      ImageView shipIView = new ImageView(shipImage);
      ImageView sunsetIView = new ImageView(sunsetImage);
      ImageView flowerIView = new ImageView(flowerImage);
      
      //Resize the moon image, preserving its aspect ratio
      moonIView.setFitWidth(200);
      moonIView.setPreserveRatio(true);
      
      //Resize the ship image, preserving its aspect ratio
      shipIView.setFitWidth(200);
      shipIView.setPreserveRatio(true);
      
      //Resize the sunset image, preserving its aspect ratio
      sunsetIView.setFitWidth(200);
      sunsetIView.setPreserveRatio(true);
      
      //Resize the flower image, preserving its aspect ratio
      flowerIView.setFitWidth(200);
      flowerIView.setPreserveRatio(true);


      
      //Create a GridPane
      GridPane gridpane = new GridPane();
      
      //Add the Labels to the GridPane
      gridpane.add(moonIView, 0, 0); //column 0, row 0
      gridpane.add(shipIView, 1, 0); //column 1, row 0
      gridpane.add(sunsetIView, 0, 1); //column 0 row 1
      gridpane.add(flowerIView, 1, 1); //column 1, row 1
      
      //Set the gap sizes
      gridpane.setVgap(10);
      gridpane.setHgap(10);
      
      //Set the GridPanes padding
      gridpane.setPadding(new Insets(30));
      
      //Create a Scene with the GridPane as its root node 
      //The scene is 200 pixels wide by 100 pixel high
      Scene scene = new Scene(gridpane, 200, 100);
      
      //Add the Scene to the Stage
      primaryStage.setScene(scene);
      
      //Show the window
      primaryStage.show();
      
   }
}