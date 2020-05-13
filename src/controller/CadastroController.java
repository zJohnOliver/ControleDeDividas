/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Cliente;
import view.Palco;


public class CadastroController implements Initializable {
    @FXML
    private TextField cNome;

    @FXML
    private TextField cTelefone;

    @FXML
    private Button bVoltar;

    @FXML
    private TextField cEndereço;

    @FXML
    private AnchorPane voltar;

    @FXML
    private TextField cCPF;

    @FXML
    private TextField cDivida;

    @FXML
    private Button bCadastrar;

    @FXML
    void voltar(ActionEvent event) {
        Palco.home();
    }

    @FXML
    void cadastrar(ActionEvent event) {
        salvar();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    private void salvar(){
        Cliente cliente = new Cliente();
        ClienteDAO dao = new ClienteDAO();
        cliente.setCpf(cCPF.getText());
        cliente.setNome(cNome.getText());
        cliente.setEndereço(cEndereço.getText());
        cliente.setTelefone(cTelefone.getText());
        cliente.setDivida(Double.parseDouble(cDivida.getText()));
        
        
       dao.salvar(cliente);
        limpar();
        ListarClienteController lc = new ListarClienteController();
        lc.iniciartabela();
        lc.listarCliente();
    }
    
    private void limpar() {
        cCPF.setText("");
        cNome.setText("");
        cTelefone.setText("");
        cEndereço.setText("");
        cDivida.setText("");
}
}
