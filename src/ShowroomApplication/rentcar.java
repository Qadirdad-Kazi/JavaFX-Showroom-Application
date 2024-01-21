package ShowroomApplication;



import ShowroomApplicationData.RentAcar1;
import ShowroomApplicationData.RentAcar2;
import ShowroomApplicationData.RentAcar3;
import ShowroomApplicationData.RentAcar4;
import ShowroomApplicationData.RentAcar5;
import ShowroomApplicationData.RentAcar6;
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

public class rentcar extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setResizable(false);
		Group root = new Group();
		Scene scene = new Scene (root , 1140 , 1080 , Color.BISQUE);
		
		Text t1 = new Text("RENT A CAR");
		t1.setFont(Font.font(50));
		t1.setFill(Color.YELLOW);
		t1.setUnderline(true);
		t1.setLayoutY(180);
		t1.setLayoutX(425);
		
		
		//car1
		Image image1 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/rentCarImages/car1.jpg");
		ImageView img1 = new ImageView(image1);
		img1.setLayoutX(100);
		img1.setLayoutY(300);
		Button b1 = new Button("Details");
		b1.setLayoutX(230);
		b1.setLayoutY(450);
		b1.setTextFill(Color.BLACK);
		
		//car2
		Image image2 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/rentCarImages/car%202.jpg");
		ImageView img2 = new ImageView(image2);
		img2.setLayoutX(420);
		img2.setLayoutY(300);
		Button b2 = new Button("Details");
		b2.setLayoutX(550);
		b2.setLayoutY(460);
		b2.setTextFill(Color.BLACK);
		
		//car3
		Image image3 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/rentCarImages/car%203.jpg");
		ImageView img3 = new ImageView(image3);
		img3.setLayoutX(100);
		img3.setLayoutY(530);
		Button b3 = new Button("Details");
		b3.setLayoutX(230);
		b3.setLayoutY(660);
		b3.setTextFill(Color.BLACK);
		
		
				
		//car4
		Image image4 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/rentCarImages/car%205.jpg");
		ImageView img4 = new ImageView(image4);
		img4.setLayoutX(420);
		img4.setLayoutY(530);
		Button b4 = new Button("Details");
		b4.setLayoutX(550);
		b4.setLayoutY(720);
		b4.setTextFill(Color.BLACK);
		
		//car5
		Image image5 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/rentCarImages/car%204.jpg");
		ImageView img5 = new ImageView(image5);
		img5.setLayoutX(750);
		img5.setLayoutY(300);
		Button b5 = new Button("Details");
		b5.setLayoutX(875);
		b5.setLayoutY(440);
		b5.setTextFill(Color.BLACK);
		
		//car6
		Image image6 = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/rentCarImages/car%206.jpg");
		ImageView img6 = new ImageView(image6);
		img6.setLayoutX(750);
		img6.setLayoutY(530);
		Button b6 = new Button("Details");
		b6.setLayoutX(875);
		b6.setLayoutY(680);
		b6.setTextFill(Color.BLACK);
		
		//Titlebackground image
		Image bi = new Image("file:///Users/qadirdad_kazi/Desktop/Programming/Java/Eclips/Application/oopproject1/src/rentCarImages/BACKGROUND%20IMAGE.png");
		ImageView backg = new ImageView(bi);
		backg.setFitWidth(1920);
		//ackg.setX(500);
		//backg.setY(100);
		backg.setFitHeight(850);
		backg.setFitWidth(1300);
		
		b1.setOnAction(e->{
			RentAcar1 newscreen=new RentAcar1();
			try {
				newscreen.start(stage);
			} catch (Exception e1) {
				
			}
		});
		
		b2.setOnAction(e->{
			RentAcar2 newscreen=new RentAcar2();
		try {
		newscreen.start(stage);
		} catch (Exception e2) {
				
			}
		});

		b3.setOnAction(e->{
			RentAcar3 newscreen=new RentAcar3();
		try {
		newscreen.start(stage);
		} catch (Exception e3) {
				
			}		
		});

		b4.setOnAction(e->{
			RentAcar4 newscreen=new RentAcar4();
			try {
				newscreen.start(stage);
			} catch (Exception e4) {
				
			}
		});

		b5.setOnAction(e->{
			RentAcar5 newscreen=new RentAcar5();
			try {
				newscreen.start(stage);
			} catch (Exception e5) {
				
			}
		});
		
		b6.setOnAction(e->{
			RentAcar6 newscreen=new RentAcar6();
			try {
				newscreen.start(stage);
			} catch (Exception e6) {
				
			}
		});
		
		
		
		stage.setTitle("Rent a car page");
		//root.setBackground(bGround);
		
		
		root.getChildren().add(backg);
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

