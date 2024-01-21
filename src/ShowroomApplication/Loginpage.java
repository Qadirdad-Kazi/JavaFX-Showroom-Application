package ShowroomApplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Loginpage extends Application implements EventHandler<ActionEvent> {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Stage stage = new Stage();
		stage.setResizable(false);
		Group root = new Group();
		Scene scene = new Scene(root, 400, 400, Color.CORNSILK);

		stage.setTitle("Login");

		Text pagetitle = new Text("Please Login First");
		pagetitle.setLayoutY(60);
		pagetitle.setLayoutX(70);
		pagetitle.setFont(Font.font(40));
		pagetitle.setFill(Color.WHITE);

		TextField userfield = new TextField();
		userfield.setLayoutY(100);
		userfield.setLayoutX(130);
		userfield.setPromptText("UserName");
		userfield.setFocusTraversable(true);

		PasswordField passfield = new PasswordField();
		passfield.setLayoutY(140);
		passfield.setLayoutX(130);
		passfield.setPromptText("Password");
		passfield.setFocusTraversable(true);

		Button b1 = new Button("Login");
		b1.setLayoutY(200);
		b1.setLayoutX(180);
		b1.setOnAction(this);

		CheckBox c1 = new CheckBox("I Am Not Robot");
		c1.setLayoutX(145);
		c1.setLayoutY(250);
		c1.setTextFill(Color.WHITE);

		Image bi = new Image(
				"file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/loginPageImage/loginback.jpg");
		ImageView backg = new ImageView(bi);

		root.getChildren().add(backg);
		root.getChildren().add(c1);
		root.getChildren().add(b1);
		root.getChildren().add(passfield);
		root.getChildren().add(userfield);
		root.getChildren().add(pagetitle);
		stage.setScene(scene);
		stage.show();

		// error message
		final Label flabel = new Label();
		flabel.setLayoutY(300);
		flabel.setLayoutX(110);
		flabel.setTextFill(Color.RED);
		flabel.setFont(Font.font(20));
		root.getChildren().add(flabel);

		// Giving action to login button for new screen
		b1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				if (userfield.getText().equals("qadirdad") && (passfield.getText().equals("kazi")) & c1.isSelected()) {
					flabel.setText("LOGIN Sucessfull");
					display1 newscreen = new display1();
					try {
						newscreen.start(stage);
					} catch (Exception e) {

					}
				}

				else if (userfield.getText().equals("khayam")
						&& (passfield.getText().equals("57327")) & c1.isSelected()) {
					flabel.setText("LOGIN Sucessfull");
					display1 newscreen = new display1();
					try {
						newscreen.start(stage);
					} catch (Exception e) {

					}
				} else if (userfield.getText().equals("osama")
						&& (passfield.getText().equals("rehman")) & c1.isSelected()) {
					flabel.setText("LOGIN Sucessfull");
					display1 newscreen = new display1();
					try {
						newscreen.start(stage);
					} catch (Exception e) {

					}
				} else if (userfield.getText().equals("rizwan")
						&& (passfield.getText().equals("ali")) & c1.isSelected()) {
					flabel.setText("LOGIN Sucessfull");
					display1 newscreen = new display1();
					try {
						newscreen.start(stage);
					} catch (Exception e) {

					}

				} else {
					Loginerror newscreen = new Loginerror();
					try {
						newscreen.start(stage);
					} catch (Exception e) {

					}
				}

			}

		});
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

	}
}
