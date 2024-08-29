import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application 

    {@Override
    public void start(Stage ms) 

        {try 
            {Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene ms2 = new Scene(root);
            
            ms.setScene(ms2);
            ms.setResizable(false);
            ms.initStyle(StageStyle.UNDECORATED);
            ms.show();} 
            
        catch(Exception e) {e.printStackTrace();}}

    public static void main(String[] args) 
        {launch(args);}}