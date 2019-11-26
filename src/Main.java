

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	Stage window;
	HBox mainLayout;
	
	VBox center =new VBox(100);
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		
		
		mainLayout=new HBox(40);
		sideMenu();
		topMenu();
		bloggs();
		Scene scene=new Scene(mainLayout,800,600);
		scene.getStylesheets().add("main.css");
		//window.setMinWidth(600);
		//window.setMinHeight(300);
		window.setScene(scene);
		window.show();
	}
	boolean hej;
	public void topMenu() {
		
		
		
		
		Button exploreBlogg = new Button("Explore Bloggs");
		exploreBlogg.setOnAction(e -> {
			
			hej=true;
			Label test= new Label("Hej");
				center.getChildren().add(test);
			
		});
		
		
		Button yourBlogg = new Button("Your Blogg");
		exploreBlogg.setOnAction(e -> {
			hej=false;
			Label test1= new Label("blah");
				center.getChildren().add(test1);
			
			
		});
		
		
		
		
		
		HBox leftTop = new HBox(20);
		leftTop.getChildren().addAll(exploreBlogg, yourBlogg);
		leftTop.setMargin(leftTop, new Insets(20,0,0,75));
		leftTop.setMinSize(200, 50);
		leftTop.setPrefSize(2000, 50);
		leftTop.getStyleClass().add("leftTop");
		
		
		Button search = new Button("Search");
		
		TextField searchPost = new TextField();
		
		HBox rightTop = new HBox();
		rightTop.getChildren().addAll(search, searchPost);
		rightTop.setMargin(rightTop, new Insets(20));
		rightTop.setMinSize(250, 50);
		rightTop.getStyleClass().add("rightTop");
		
		HBox topMenu = new HBox(20);
		topMenu.getChildren().addAll(leftTop, rightTop);
		
		
		
		
		center.getChildren().addAll(topMenu);
		
		mainLayout.getChildren().add(center);
		
	

	    
	
	}
	
	
	public void sideMenu() {
		
		Label username=new Label("Niles ahmad");
		Label likes=new Label("Likes: 217");
		Button setings=new Button("Setings");
		
		VBox sideMenu=new VBox(100);
		sideMenu.setPrefHeight(1000);
		
		sideMenu.setMinWidth(sideMenu.USE_PREF_SIZE);
		
		
		VBox upper=new VBox(20);
		upper.getChildren().addAll(username,likes);
		upper.setPadding(new Insets(120, 20, 20, 20));
		
		
		VBox middle=new VBox(20);
		middle.setPadding(new Insets(0, 20, 0, 20));
		middle.setPrefHeight(sideMenu.getPrefHeight());
		middle.getChildren().addAll(setings);
		
		
		VBox lower=new VBox(20);
		
		
		Button login=new Button("Logout");
		login.setMinWidth(128);
		login.setMinHeight(40);
		
		
		lower.getChildren().add(login);
		
		
		
		
		sideMenu.getChildren().addAll(upper,middle,lower);
		
		
		
		
		
		sideMenu.getStyleClass().add("sideMenu");
		
		
		upper.getStyleClass().add("upper");
		username.getStyleClass().add("upper");
		likes.getStyleClass().add("upper");
		
		
		
		middle.getStyleClass().add("middle");
		setings.getStyleClass().add("sideButton");
		
		
		
		login.getStyleClass().add("sideButton");
		lower.getStyleClass().add("loginButton");
		
		
		mainLayout.getChildren().add(sideMenu);
		
	}
	
	public void bloggs(){
		Label bloggsName = new Label("Give me kisses");
		bloggsName.getStyleClass().add("leftBloggText");
		

		Label username= new Label("by: Blah");
		username.getStyleClass().add("leftBloggText");
		
		Label posts= new Label("Posts: 3");
		posts.getStyleClass().add("leftBloggText");
		
		VBox leftBlogg= new VBox();
		leftBlogg.getChildren().addAll(bloggsName, username, posts);
		leftBlogg.setPrefSize(2000, 100);
		leftBlogg.getStyleClass().add("leftBlogg");
		leftBlogg.setOnMouseClicked( ( e ) ->
        {
       	 
       	 System.out.println("Left up");
        } );
		
		
		
		Label bloggsName2 = new Label("Give me kisses");
		bloggsName2.getStyleClass().add("rightBloggText");
		
		Label username2= new Label("by: Blah");
		username2.getStyleClass().add("rightBloggText");
		
		Label posts2= new Label("Posts: 6");
		posts2.getStyleClass().add("rightBloggText");

		
		VBox rightBlogg= new VBox();
		rightBlogg.getChildren().addAll(bloggsName2, username2, posts2);
		rightBlogg.setPrefSize(2000, 100);
		rightBlogg.getStyleClass().add("rightBlogg");
		
		
		HBox bloggar = new HBox();
		bloggar.getChildren().addAll(leftBlogg, rightBlogg);
		
		//test
		Label bloggsNameT = new Label("Give me kisses");
		bloggsNameT.getStyleClass().add("leftBloggText");
		

		Label usernameT= new Label("by: Blah");
		usernameT.getStyleClass().add("leftBloggText");
		
		Label postsT= new Label("Posts: 3");
		postsT.getStyleClass().add("leftBloggText");
		
		VBox leftBloggT= new VBox();
		leftBloggT.getChildren().addAll(bloggsNameT, usernameT, postsT);
		leftBloggT.setPrefSize(2000, 100);
		leftBloggT.getStyleClass().add("leftBlogg");
		
		
		
		Label bloggsName2T = new Label("Give me kisses");
		bloggsName2T.getStyleClass().add("rightBloggText");
		
		Label username2T= new Label("by: Blah");
		username2T.getStyleClass().add("rightBloggText");
		
		Label posts2T= new Label("Posts: 6");
		posts2T.getStyleClass().add("rightBloggText");

		
		VBox rightBloggT= new VBox();
		rightBloggT.getChildren().addAll(bloggsName2T, username2T, posts2T);
		rightBloggT.setPrefSize(2000, 100);
		rightBloggT.getStyleClass().add("rightBlogg");
		
		
		HBox bloggarT = new HBox();
		bloggarT.getChildren().addAll(leftBloggT, rightBloggT);
		
		VBox scrollPaneBox= new VBox();
		scrollPaneBox.getChildren().addAll(bloggar, bloggarT);
		
		ScrollPane scrollPane= new ScrollPane();
		scrollPane.setContent(scrollPaneBox);
		scrollPane.setPannable(true);
		scrollPane.setPrefSize(bloggar.getWidth(), 1000);
		//scrollPane.setFitToWidth(true);

		scrollPane.fitToWidthProperty().set(true);
		
		
		scrollPane.setOnDragDetected(e -> {
			scrollPane.setCursor(Cursor.DEFAULT);
		});
		scrollPane.setStyle("-fx-background-color:transparent;");
		
		
		Button refresh = new Button("Refresh");
		
		HBox refreshField = new HBox();
		refreshField.getChildren().addAll(refresh);
		refreshField.getStyleClass().add("refreshField");
		
		center.getChildren().addAll(scrollPane, refreshField );
		
		
	}

}
