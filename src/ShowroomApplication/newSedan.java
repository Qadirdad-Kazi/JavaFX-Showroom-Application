package ShowroomApplication;


import ShowroomApplicationData.NewSedancar1;
import ShowroomApplicationData.NewSedancar2;
import ShowroomApplicationData.NewSedancar3;
import ShowroomApplicationData.NewSedancar4;
import ShowroomApplicationData.NewSedancar5;
import ShowroomApplicationData.NewSedancar6;
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

public class newSedan extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setResizable(false);
		Group root = new Group();
		Scene scene = new Scene (root , 1920 , 1080 , Color.BISQUE);
		
		Text t1 = new Text("Welcome to Latest Sedan page");
		t1.setFont(Font.font(50));
		t1.setFill(Color.ALICEBLUE);
		t1.setUnderline(true);
		t1.setLayoutY(160);
		t1.setLayoutX(300);
		
		
		//car1
		Image image1 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/newSedancar/SedanNew1.jpeg");
		ImageView img1 = new ImageView(image1);
		img1.setLayoutX(100);
		img1.setLayoutY(300);
		Button b1 = new Button("Details");
		b1.setLayoutX(230);
		b1.setLayoutY(470);
		b1.setTextFill(Color.BLACK);
		
		//car2
		Image image2 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/newSedancar/SedanNew2.jpeg");
		ImageView img2 = new ImageView(image2);
		img2.setLayoutX(420);
		img2.setLayoutY(300);
		Button b2 = new Button("Details");
		b2.setLayoutX(550);
		b2.setLayoutY(470);
		b2.setTextFill(Color.BLACK);
		
		//car3
		Image image3 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/newSedancar/SedanNew4.jpeg");
		ImageView img3 = new ImageView(image3);
		img3.setLayoutX(100);
		img3.setLayoutY(530);
		Button b3 = new Button("Details");
		b3.setLayoutX(230);
		b3.setLayoutY(700);
		b3.setTextFill(Color.BLACK);
		
		
				
		//car4
		Image image4 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/newSedancar/SedanNew5.jpeg");
		ImageView img4 = new ImageView(image4);
		img4.setLayoutX(420);
		img4.setLayoutY(530);
		Button b4 = new Button("Details");
		b4.setLayoutX(550);
		b4.setLayoutY(700);
		b4.setTextFill(Color.BLACK);
		
		//car5
		Image image5 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/newSedancar/sedannew6.jpg");
		ImageView img5 = new ImageView(image5);
		img5.setLayoutX(750);
		img5.setLayoutY(300);
		Button b5 = new Button("Details");
		b5.setLayoutX(875);
		b5.setLayoutY(470);
		b5.setTextFill(Color.BLACK);
		
		//car6
		Image image6 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/newSedancar/newsedan7.jpg");
		ImageView img6 = new ImageView(image6);
		img6.setLayoutX(750);
		img6.setLayoutY(530);
		Button b6 = new Button("Details");
		b6.setLayoutX(875);
		b6.setLayoutY(700);
		b6.setTextFill(Color.BLACK);
		
		//Titlebackground image
		Image bi = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/oldSedancar/osman-rana-9rRBct37OAI-unsplash.jpg");
		ImageView backg = new ImageView(bi);
		backg.setFitWidth(1080);
		backg.setFitHeight(900);
		
		
		Image bi2 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/newSedancar/jake-pierrelee-CJHtw3W56b8-unsplash.jpg");
		ImageView titleimg2 = new ImageView(bi2);
		titleimg2.setFitHeight(900);
		titleimg2.setFitWidth(500);
		titleimg2.setLayoutX(1000);
		
		
		b1.setOnAction(e->{
			NewSedancar1 newscreen=new NewSedancar1();
			try {
				newscreen.start(stage);
			} catch (Exception e1) {
				
			}
		});
		
		b2.setOnAction(e->{
			NewSedancar2 newscreen=new NewSedancar2();
			try {
				newscreen.start(stage);
			} catch (Exception e1) {
				
			}
		});
		
		
		b3.setOnAction(e->{
			NewSedancar3 newscreen=new NewSedancar3();
			try {
				newscreen.start(stage);
			} catch (Exception e1) {
				
			}
		});
		
		
		b4.setOnAction(e->{
			NewSedancar4 newscreen=new NewSedancar4();
			try {
				newscreen.start(stage);
			} catch (Exception e1) {
				
			}
		});
		
		b5.setOnAction(e->{
			NewSedancar5 newscreen=new NewSedancar5();
			try {
				newscreen.start(stage);
			} catch (Exception e1) {
				
			}
		});
		
		
		b6.setOnAction(e->{
			NewSedancar6 newscreen=new NewSedancar6();
			try {
				newscreen.start(stage);
			} catch (Exception e1) {
				
			}
		});
		
		
		
		
		stage.setTitle("New Sedan Cars");
		
		
		
		root.getChildren().add(																																			backg);
		root.getChildren().add(titleimg2);
		root.getChildren().add(img1);
		root.getChildren().add(img2);
		root.getChildren().add(img3);
		root.getChildren().add(img4);
		root.getChildren().add(img5);
		root.getChildren().add(img6);
		root.getChildren().add(t1);
		root.getChildren().add(b1);
		root.getChildren().add(b2);
		root.getChildren().add(b3);
		root.getChildren().add(b4);
		root.getChildren().add(b5);
		root.getChildren().add(b6);
		
		stage.setScene(scene);
		stage.show();
	}

}



