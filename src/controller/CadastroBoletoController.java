/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BoletoDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Boletos;
import view.Palco;


public class CadastroBoletoController implements Initializable {
    @FXML
    private TextField cEmpresa;

    @FXML
    private Button buVoltar;

    @FXML
    private TextField cCNPJ;

    @FXML
    private TextField cDataVencimento;

    @FXML
    private Button buCadastrar;

    @FXML
    private TextField cValorPagar;

    @FXML
    void cadastrar(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {
        Palco.home();
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
    private void salvar(){
        Boletos boleto = new Boletos();
        BoletoDAO dao = new BoletoDAO();
        boleto.setCnpj(cCNPJ.getText());
        boleto.setEmpresa(cEmpresa.getText());
        boleto.setdVencimento(cDataVencimento.getText());
        boleto.setvPagar(Double.parseDouble(cValorPagar.getText()));
        
        dao.salvarBoleto(boleto);
        limpar();
    }
    private void limpar() {
        cDataVencimento.setText("");
        cCNPJ.setText("");
        cEmpresa.setText("");
        cValorPagar.setText("");
}
}
