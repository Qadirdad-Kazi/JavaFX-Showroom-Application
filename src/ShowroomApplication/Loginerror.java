package ShowroomApplication;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Loginerror extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Stage stage = new Stage();
		stage.setResizable(false);
		Group root = new Group();
		Scene scene = new Scene(root,300,200,Color.BISQUE);
		
		Text errortext = new Text("Userame or Password Is Wrong \n \n Check If You Are Not a Robot");
		errortext.setY(30);
		errortext.setFill(Color.DARKRED);
		errortext.setFont(Font.font(20));
		
		Text ortext = new Text("OR");
		ortext.setY(55);
		ortext.setX(120);
		ortext.setFont(Font.font(20));
		
		Button cancelbutton = new Button("Cancel");
		cancelbutton.setLayoutY(100);
		cancelbutton.setLayoutX(120);
		cancelbutton.setOnAction(e->{
			stage.close();
		});
		
		
		root.getChildren().addAll(errortext , ortext , cancelbutton);
		
		stage.setScene(scene);
		stage.show();
		
		
	}

}
