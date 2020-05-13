package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;

public class ClienteDAO {
    
    Connection con = null;
    //Método construtor
    public ClienteDAO(){
        con = Conexao.abrirConexao();
    }    
    
    public void salvar(Cliente cliente){
        try {
            String sql = "INSERT INTO cliente(cpf, nome, endereço, telefone, divida) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getTelefone());
            ps.setString(4, cliente.getEndereço());
            ps.setDouble(5, cliente.getDivida());
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            }
           
        } catch (Exception e) {
        }
    }
    public  List<Cliente> Listar(){
        List<Cliente> lista = new ArrayList<>();        
        try {
            String sql = "SELECT * FROM cliente";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
             
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setDivida(Double.parseDouble(rs.getString("divida")));
                
                lista.add(cliente);                              
            }            
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu Erro!");
            return null;
        }   
    }
    
    
 }