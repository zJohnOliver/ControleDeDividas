/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jhonatan Sousa
 */
public class Palco extends Application {
    private static Stage palco;
    
    private static Scene home;
    private static Scene cadastroCliente;
    private static Scene cadastroBoleto;
    private static Scene listarClientes;
    
    @Override
    public void start(Stage stage) throws IOException{
        palco = stage;
        
        
        Parent root = FXMLLoader.load(getClass().getResource("HomeFXML.fxml"));
        home = new Scene(root);
        
        root = FXMLLoader.load(getClass().getResource("cadastro.fxml"));
        cadastroCliente = new Scene(root);
        
        root = FXMLLoader.load(getClass().getResource("cadastroBoleto.fxml"));
        cadastroBoleto = new Scene(root);
        
        root = FXMLLoader.load(getClass().getResource("listarCliente.fxml"));
        listarClientes = new Scene(root);
       
        stage.setTitle("Sistema de Dívidas");
        stage.setScene(home);
        stage.setResizable(true);
        stage.show();
    }
    
    public static void home(){
        palco.setScene(home);
    }
    
    public static void cadastro(){
        palco.setScene(cadastroCliente);
    }
    
    public static void cadastroBoleto(){
        palco.setScene(cadastroBoleto);
    }
    
    public static void dividasReceber(){
        palco.setScene(listarClientes);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
