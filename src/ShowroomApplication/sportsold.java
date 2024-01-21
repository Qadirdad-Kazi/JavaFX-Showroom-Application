package ShowroomApplication;



import ShowroomApplicationData.OldSportsCar1;
import ShowroomApplicationData.OldSportsCar2;
import ShowroomApplicationData.OldSportsCar3;
import ShowroomApplicationData.OldSportsCar4;
import ShowroomApplicationData.OldSportsCar5;
import ShowroomApplicationData.OldSportsCar6;
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

public class sportsold extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setResizable(false);
		Group root = new Group();
		Scene scene = new Scene (root , 1920 , 1080 , Color.BISQUE);
		
		Text t1 = new Text("Welcome to Clasic cars page");
		t1.setFont(Font.font(50));
		t1.setFill(Color.ALICEBLUE);
		t1.setUnderline(true);
		t1.setLayoutY(180);
		t1.setLayoutX(320);
		
		
		//car1
		Image image1 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/sportsOldImages/sportsold1.jpg");
		ImageView img1 = new ImageView(image1);
		img1.setLayoutX(100);
		img1.setLayoutY(300);
		Button b1 = new Button("Details");
		b1.setLayoutX(230);
		b1.setLayoutY(470);
		b1.setTextFill(Color.BLACK);
		
		//car2
		Image image2 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/sportsOldImages/sportsold2.jpg");
		ImageView img2 = new ImageView(image2);
		img2.setLayoutX(420);
		img2.setLayoutY(300);
		Button b2 = new Button("<");
		b2.setLayoutX(550);
		b2.setLayoutY(470);
		b2.setTextFill(Color.BLACK);
		
		//car3
		Image image3 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/sportsOldImages/sportsold3.jpg");
		ImageView img3 = new ImageView(image3);
		img3.setLayoutX(100);
		img3.setLayoutY(530);
		img3.setFitWidth(280);
		Button b3 = new Button("Details");
		b3.setLayoutX(230);
		b3.setLayoutY(700);
		b3.setTextFill(Color.BLACK);
		
		
				
		//car4
		Image image4 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/sportsOldImages/sportsold4.jpg");
		ImageView img4 = new ImageView(image4);
		img4.setLayoutX(420);
		img4.setLayoutY(530);
		Button b4 = new Button("Details");
		b4.setLayoutX(550);
		b4.setLayoutY(700);
		b4.setTextFill(Color.BLACK);
		
		//car5
		Image image5 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/sportsOldImages/sportsold5.jpg");
		ImageView img5 = new ImageView(image5);
		img5.setLayoutX(750);
		img5.setLayoutY(300);
		Button b5 = new Button("Details");
		b5.setLayoutX(875);
		b5.setLayoutY(470);
		b5.setTextFill(Color.BLACK);
		
		//car6
		Image image6 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/sportsOldImages/sportsold6.jpg");
		ImageView img6 = new ImageView(image6);
		img6.setLayoutX(750);
		img6.setLayoutY(530);
		img6.setFitWidth(280);
		Button b6 = new Button("Details");
		b6.setLayoutX(875);
		b6.setLayoutY(700);
		b6.setTextFill(Color.BLACK);
		
		//Titlebackground image
		Image bi = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/sportsOldImages/back.jpg");
		ImageView backg = new ImageView(bi);
		backg.setFitWidth(1920);
		
		
		Image bi2 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/sportsOldImages/backold.jpg");
		ImageView titleimg2 = new ImageView(bi2);
		titleimg2.setFitHeight(850);
		titleimg2.setFitWidth(500);
		titleimg2.setLayoutX(1050);
		
		
		
		
		b1.setOnAction(e->{
			OldSportsCar1 newscreen=new OldSportsCar1();
			try {
				newscreen.start(stage);
			} catch (Exception e1) {
				
			}
		});
		
		b2.setOnAction(e->{
			OldSportsCar2 newscreen=new OldSportsCar2();
		try {
		newscreen.start(stage);
		} catch (Exception e2) {
				
			}
		});

		b3.setOnAction(e->{
			OldSportsCar3 newscreen=new OldSportsCar3();
		try {
		newscreen.start(stage);
		} catch (Exception e3) {
				
			}		
		});

		b4.setOnAction(e->{
			OldSportsCar4 newscreen=new OldSportsCar4();
			try {
				newscreen.start(stage);
			} catch (Exception e4) {
				
			}
		});

		b5.setOnAction(e->{
			OldSportsCar5 newscreen=new OldSportsCar5();
			try {
				newscreen.start(stage);
			} catch (Exception e5) {
				
			}
		});
		
		b6.setOnAction(e->{
			OldSportsCar6 newscreen=new OldSportsCar6();
			try {
				newscreen.start(stage);
			} catch (Exception e6) {
				
			}
		});
		
		stage.setTitle("Old Sports Cars");
		//root.setBackground(bGround);
		
		
		root.getChildren().add(																																			backg);
		root.getChildren().add(titleimg2);
//		root.getChildren().add(titleimg1);
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



