/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Boletos;

/**
 *
 * @author Jhonatan Sousa
 */
public class BoletoDAO {
    Connection con = null;
    //Método construtor
    public BoletoDAO(){
        con = Conexao.abrirConexao();
    }    
    
    public void salvarBoleto(Boletos boletos){
        try {
            
            //mudar o banco
            String sql = "INSERT INTO contas(cnpj, vencimento, empresa, valor) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, boletos.getCnpj());
            ps.setString(2, boletos.getEmpresa());
            ps.setString(3, boletos.getdVencimento());
            ps.setDouble(4, boletos.getvPagar());
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            }
           
        } catch (Exception e) {
        }
    }
}
