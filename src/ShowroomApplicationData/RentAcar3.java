package ShowroomApplicationData;


import java.io.FileWriter;
import java.io.IOException;

import Buy.Buy;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RentAcar3 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root,300,300,Color.ANTIQUEWHITE);
		
		Text car1 = new Text("Car Name :		HONDA CIVIC"
				+ "\n Car Model : 		   	 2020"
				+ "\n Year of Manifacture :	 2020"
				+ " \n Varient : 				  ef  i"
				+ "\n Color : 					White"
				+ "\n HPower : 				60"
				+ "\n Engine Capacity : 	    1660cc"
				+ "\n  Avrage : 				12km"
				+ "\n  Price Per Hour : 		7000Rs");
				
		car1.setY(20);
		car1.setFont(Font.font(20));
		car1.setFill(Color.WHITE);

		
		Button b1 = new Button("Buy");
		b1.setLayoutY(260);
		b1.setLayoutX(170);
		
		
		Button Cancel = new Button("Cancel");
		Cancel.setLayoutY(260);
		Cancel.setLayoutX(220);
		Cancel.setOnAction(e->{
			stage.close();
		});
		
		Image img = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/ShowroomApplicationData/Unknown.jpg");
		ImageView imgb = new ImageView(img);
		imgb.setFitWidth(300);
		imgb.setFitHeight(300);
		
		b1.setOnAction(e->{
			Buy newscreen=new Buy();
			try {
				newscreen.start(stage);
				try {
					FileWriter fw1 = new FileWriter("Pmnt.txt",true);
					fw1.write(car1.getText());
					
					fw1.close();
				}
				catch (IOException ex) {
                    ex.printStackTrace();
					
				}
			} catch (Exception e1) {
				
			}
		});
		
		root.getChildren().add(imgb);
		root.getChildren().add(car1);
		root.getChildren().add(b1);

		
	
		root.getChildren().add(Cancel);
	
		
		
		
		
		

		
		stage.setTitle("Rent Car3 Details");
		stage.setScene(scene);
		stage.show();
	}

}