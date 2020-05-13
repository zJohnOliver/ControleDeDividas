/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import view.Palco;

/**
 * FXML Controller class
 *
 * @author Jhonatan Sousa
 */
public class HomeFXMLController implements Initializable {
    
    



      @FXML
    private MenuItem cadastrarC;

    @FXML
    private MenuItem cadastrarB;

    @FXML
    private Menu Cadastrar;

    @FXML
    private Menu Sobre;

    @FXML
    private MenuBar Menub;

    @FXML
    void cadastrar(ActionEvent event) {

    }

    @FXML
    void cb(ActionEvent event) {
        Palco.cadastroBoleto();
    }

    @FXML
    void cc(ActionEvent event) {
        Palco.cadastro();
    }

    @FXML
    void s(ActionEvent event) {

    }
    @FXML
    void dReceber(ActionEvent event) {
        Palco.dividasReceber();
    }

    @FXML
    void cPagar(ActionEvent event) {

    }

   

    

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         

    }

  
        // TODO
    
}
