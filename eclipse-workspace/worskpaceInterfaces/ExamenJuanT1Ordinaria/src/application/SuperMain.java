package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import application.SuperControl;





public class SuperMain extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/First.fxml"));
				
		AnchorPane panelInicial = (AnchorPane) loader.load();
		
		Scene scene = new Scene(panelInicial);
		

		Font.loadFont(getClass().getResourceAsStream("../view/assets/PoiretOne-Regular.ttf"), 20);

	
	
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
