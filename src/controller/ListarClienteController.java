/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Cliente;
import view.Palco;

/**
 * FXML Controller class
 *
 * @author Jhonatan Sousa
 */
public class ListarClienteController implements Initializable {

      @FXML
    private Button bAlterar;

    @FXML
    private TableView<Cliente> tvTabela;

    @FXML
    private TableColumn<Cliente, String> cNome;

    @FXML
    private Button bVoltar;

    @FXML
    private TableColumn<Cliente, String> cCPF;

    @FXML
    private TableColumn<Cliente, Double> cDivida;

    @FXML
    private Button bExcluir;

    @FXML
    private Button bEditar;

    @FXML
    void Voltar(ActionEvent event) {
        Palco.home();
    }

    @FXML
    void Excluir(ActionEvent event) {

    }

    @FXML
    void AlterarD(ActionEvent event) {

    }

    @FXML
    void Editar(ActionEvent event) {

    }
    
    ClienteDAO dao = new ClienteDAO();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
            iniciartabela();
        } catch (SQLException e) {
        }
        
      
    }    
    public void iniciartabela()throws SQLException{                    
            cCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
            cNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
            cDivida.setCellValueFactory(new PropertyValueFactory<>("divida"));
            
            tvTabela.setItems(listarCliente());    
        
        
        
   
    }
    public ObservableList<Cliente> listarCliente() throws SQLException{
             List<Cliente> lista = dao.Listar();             
             return FXCollections.observableArrayList(lista);
            
        }
}
