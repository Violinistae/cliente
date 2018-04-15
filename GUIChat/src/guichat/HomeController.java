/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichat;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Wero
 */
public class HomeController implements Initializable, IContentSetter {

    // Controlador para mostrar contenido
    ScreenController screen;
    
    // Controles implementados en Interfaz
    @FXML private Button closeWindowBtn, minimizeWindowBtn;
    @FXML private TextArea txtMessage;
    
    /**
     * Método para poder cerrar la pestaña
     * @param e ?
     */
    @FXML
    public void handleCloseWindow(ActionEvent e){
        Stage stage = (Stage) closeWindowBtn.getScene().getWindow();
        stage.close();
    }
    
    /**
     * Método para minimizar la pestaña
     * @param e 
     */
    @FXML
    public void handleMinimizeWindow(ActionEvent e){
        Stage stage = (Stage) minimizeWindowBtn.getScene().getWindow();
        stage.setIconified(true);
    }
    
    /**
     * Método para cerrar sesión del Usuario
     * @param e 
     */
    @FXML
    public void signOut(ActionEvent e){
        screen.setScreen(GUIChat.screenLogin);
    }
    
    @FXML
    public void sendMessage(ActionEvent e){
        System.out.println(txtMessage.getText());
        txtMessage.setText("");
    }
    
    /**
     * Método para inicializar los componentes de la Interfaz
     * @param url ?
     * @param rb ?
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * Método para obtener que pantalla es la que se encuentra en ejecución
     * @param screenPage
     */
    @Override
    public void setContentToScreen(ScreenController screenPage) {
        this.screen = screenPage;
    }
    
}
