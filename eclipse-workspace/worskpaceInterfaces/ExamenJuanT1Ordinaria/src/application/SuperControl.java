package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SuperControl {
	
	@FXML
	AnchorPane rootPane;
	
	@FXML
	ImageView imagenPerfil;

	
	/**
	 * Realiza un FadeTransition de la imagen del perfil,
	 * al inicializarse la ventana.
	 */
	@FXML
	public void initialize() {
		FadeTransition fadeTransit = new FadeTransition(Duration.seconds(5), imagenPerfil);
		fadeTransit.setFromValue(0);
		fadeTransit.setToValue(1);
		fadeTransit.play();
	}
	public void abrirVentana() {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Second.fxml"));
			AnchorPane segundoPanel;
			segundoPanel = (AnchorPane) loader.load();
			Stage nuevoStage = new Stage();
	
			nuevoStage.setScene(new Scene(segundoPanel));
			
			//Stage thisStage = (Stage) rootPane.getScene().getWindow();
    	    //thisStage.close();
			
			nuevoStage.show();
			System.out.println("Carga de la segunda ventana sin problemas");
			
		} catch (IOException e) {
			System.out.println("Problema al cargar la segunda ventana/Stage");
			e.printStackTrace();
		}		
	}
	
	
	/*public void cerrarVentana() {
		System.exit(0);
	}
	*/
	
}	