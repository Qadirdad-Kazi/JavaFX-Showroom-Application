package Buy;

import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Buy extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Stage stage = new Stage();
		stage.setResizable(false);
		Group root = new Group();
		Scene scene = new Scene(root,400,400,Color.CORNSILK);
		
		Text t1 = new Text("Your Name");
		t1.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		t1.setX(13);
		t1.setY(50);
		TextField tf1 = new TextField();
		tf1.setPromptText("");
		tf1.setLayoutX(220);
		tf1.setLayoutY(30);
		
		Text t2 = new Text("Last Name");
		t2.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		t2.setX(13);
		t2.setY(80);
		TextField tf2 = new TextField();
		tf2.setPromptText("");
		tf2.setLayoutX(220);
		tf2.setLayoutY(60);
		
		Text t3 = new Text("Contect Number");
		t3.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		t3.setX(13);
		t3.setY(110);
		TextField tf3 = new TextField();
		tf3.setPromptText("");
		tf3.setLayoutX(220);
		tf3.setLayoutY(90);
		
		Text t4 = new Text("Id Number");
		t4.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		t4.setX(13);
		t4.setY(140);
		TextField tf4 = new TextField();
		tf4.setPromptText("");
		tf4.setLayoutX(220);
		tf4.setLayoutY(120);
		
		Text t5 = new Text("Bank Name");
		t5.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		t5.setX(13);
		t5.setY(170);
		TextField tf5 = new TextField();
		tf5.setPromptText("");
		tf5.setLayoutX(220);
		tf5.setLayoutY(150);
		
		
		Text t6 = new Text("Account Number");
		t6.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		t6.setX(13);
		t6.setY(200);
		PasswordField tf6 = new PasswordField();
		tf6.setPromptText("");
		tf6.setLayoutX(220);
		tf6.setLayoutY(180);
		
		Text t7 = new Text("");
		t7.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		t7.setX(13);
		t7.setY(0);
		TextField tf7 = new TextField();
		tf7.setPromptText("");
		tf7.setLayoutX(0);
		tf7.setLayoutY(0);
		
		Button submit = new Button("SUBMIT");
		submit.setLayoutX(180);
		submit.setLayoutY(240);
		
		
		Button cancel = new Button("CANCEL");
		cancel.setLayoutX(180);
		cancel.setLayoutY(280);
		cancel.setOnAction(e->{
			stage.close();
		});
		
		final Text ft = new Text();
		ft.setX(20);
		ft.setY(350);
		ft.setFont(Font.font("Verdana",FontWeight.BOLD,30));
		

		
		Image img = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/Buy/Final%20page.jpg");
		ImageView bimg = new ImageView(img);
		bimg.setFitWidth(400);
		bimg.setFitHeight(400);
		
		submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				try {
					FileWriter fw1 = new FileWriter("Pmnt.txt",true);
					fw1.write(tf1.getText() + "\n" + tf2.getText() + "\n" + tf3.getText() + "\n" + tf4.getText() + "\n" + 
					tf5.getText() + "\n" + tf6.getText() + "\n" + tf7.getText());
					
					fw1.close();
					
					 ft.setFill(javafx.scene.paint.Color.BLACK);
	                    ft.setText("PAYMENT successful!");
				}
				catch (IOException ex) {
                    ex.printStackTrace();
					
				}
				}	
		});
		
			
		
		
		
		root.getChildren().addAll(bimg,t1,t2,t3,t4,t5,t6,t7,tf1,tf2,tf3,tf4,tf5,tf6,submit,cancel,ft);
		

		stage.setScene(scene);
		stage.show();

	}

}
