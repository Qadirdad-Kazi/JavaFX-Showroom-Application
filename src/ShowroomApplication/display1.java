package ShowroomApplication;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class display1 extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		//Choice box for buy 
		ComboBox <String> choice1 = new ComboBox<>();
		
	//	ObservableList<String> list1 = choice1.getItems();
		
		choice1.getItems().addAll("Old Model","New Model");
		
		choice1.setPrefSize(115, 40);
	
		choice1.setLayoutX(215);
		choice1.setLayoutY(0);
		choice1.setValue("Sedan Cars");
		
		
		
		//Choice box for rent 
		ComboBox <String> choice2 = new ComboBox<>();
		
		ObservableList<String> list2 = choice2.getItems();
		
		list2.addAll("Rent a Car");
		choice2.setPrefSize(115, 40);
		
		choice2.setLayoutX(420);
		choice2.setLayoutY(0);
		choice2.setValue("Rent");
		
		//Choice Box for Sports car
		ComboBox <String> choice3 = new ComboBox<>();
		
		ObservableList<String> list3 = choice3.getItems();
		
		list3.addAll("Old Model","New Model");
		choice3.setPrefSize(115, 40);
		
		choice3.setLayoutX(630);
		choice3.setLayoutY(0);
		choice3.setValue("Sport Cars");
		
		
		
		//Display Text
		Text ht = new Text();
		ht.setText("Wolf Automobils Showroom");
		ht.setFont(Font.font(40));
		ht.setLineSpacing(1);
		ht.setY(100);
		ht.setX(250);
		ht.setFill(Color.WHITE);
		ht.setUnderline(true);
		
		//Setting Reflection
		Reflection reflection = new Reflection();
	    reflection.setFraction(0.8);
	      //Setting the effect to the text
	    ht.setEffect(reflection);
		
		
		//Hbox for choice Box
		HBox h1 = new HBox(10 ,ht);
		
	   
		
		
		Image image = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/mainDisplayPageImage/display1.jpg");
		ImageView img = new ImageView(image);
		img.setFitHeight(500);
		img.setFitWidth(900);
		
		
		
		Stage stage = new Stage ();
		stage.setTitle("Welcome to main page");
		stage.setResizable(false);
		
		
		Group v = new Group(img,choice1,choice2,choice3);
		
		
		v.getChildren().addAll(h1,ht);
		
		Scene scene = new Scene(v , 900, 500 , Color.DARKGRAY);
		
		
		
		
		
		stage.setScene(scene);
		stage.show();
	
		
		
		//Event handling choice box
		choice1.setOnAction(e->{
			String selectedvalue1 = choice1.getValue();
			if(selectedvalue1.equals("New Model")) {

				newSedan newscreen2 = new newSedan();
				try {
					newscreen2.start(stage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			else if(selectedvalue1.equals("Old Model")){

				oldSedan newscreen2 = new oldSedan();
				try {
					newscreen2.start(stage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		
		
		
		choice2.setOnAction(e->{
			String selectedvalue2 = choice2.getValue();
			if(selectedvalue2.equals("Rent a Car")) {
				rentcar newscreen2 = new rentcar();
				try {
					newscreen2.start(stage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		
		
		choice3.setOnAction(e->{
			String selectedvalue3 = choice3.getValue();
			if(selectedvalue3.equals("New Model")) {
				sportsnew newscreen3 = new sportsnew();
				try {
					newscreen3.start(stage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else if(selectedvalue3.equals("Old Model")) {
				sportsold newscreen3 = new sportsold();
				try {
					newscreen3.start(stage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		
		
	
		}}
	




