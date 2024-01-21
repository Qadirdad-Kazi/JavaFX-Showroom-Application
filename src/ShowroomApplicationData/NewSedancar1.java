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

public class NewSedancar1 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setResizable(false);
		Group root = new Group();
		Scene scene = new Scene(root,300,300,Color.ANTIQUEWHITE);
		
		Text car1 = new Text("Car Name :			Honda City"
				+ "\n Car Model : 		   	 2021"
				+ "\n Year of Manifacture :	 2020"
				+ " \n Varient : 				ZX CVT"
				+ "\n Color : 					Black"
				+ "\n HPower : 				174"
				+ "\n Engine Capacity : 	    1498cc"
				+ "\n  Avrage : 				18.4km"
				+ "\n  Price : 				3769000Rs");
				
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
		
		
		
		root.getChildren().add(imgb);
		root.getChildren().add(car1);
		root.getChildren().add(b1);

		
	
		root.getChildren().add(Cancel);
	
		
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
		
		


		
		stage.setTitle("Sedan Car New 1 Details");
		stage.setScene(scene);
		stage.show();
	}

}