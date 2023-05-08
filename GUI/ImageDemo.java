import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
   An Image Demo
*/
public class ImageDemo extends Application
{
   public static void main(String[] args)
   {
      //Launch the application
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      //Create an Image Object 
      Image image = new Image("http:https://www.wowamazing.com/wp-content/uploads/2015/10/IMG_2731.jpg");
      
      //Create an ImageView object 
      ImageView imageView = new ImageView(image);
      
      //Put the ImageView in an HBox
      HBox hbox = new HBox(imageView);
      
      //Create a Scene witht the HBox as its root node 
      Scene scene = new Scene(hbox);
      
      //Add the scene to the stage 
      primaryStage.setScene(scene);
      
      //Set the stage title
      primaryStage.setTitle("Hot Air Balloon");
      
      //Show the window
      primaryStage.show();
   }
}


