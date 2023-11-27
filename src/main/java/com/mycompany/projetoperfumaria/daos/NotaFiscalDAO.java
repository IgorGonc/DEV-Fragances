/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoperfumaria.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.mycompany.projetoperfumaria.models.NotaFiscal;
import java.util.*;

/**
 * Classe que interage com o banco de dados
 * @author igor.goncalves
 */
public class NotaFiscalDAO {
    
    static String urlDB = "jdbc:mysql://localhost:3306/perfumaria";
    static String login = "root";
    static String senha = "Gon@5514";
    
    
    public static boolean salvar (NotaFiscal obj) throws SQLException{
    boolean retorno = false;
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(urlDB, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO NotaFiscal (numeroNota, valorNota, idProduto, nomeProduto, emailCliente) VALUES (?,?,?, ?, ?)");
            
            comandoSQL.setInt(1, obj.getNumeroNota());
            comandoSQL.setDouble(2, obj.getValorNota());
            comandoSQL.setInt(3, obj.getIdProduto());
            comandoSQL.setString(4, obj.getNomeProduto());
            comandoSQL.setString(5, obj.getEmailCliente());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas > 0 ){
            retorno = true;
            }
            
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("erro:" + e);
        }
        return retorno;
    }
    
    public static ArrayList<NotaFiscal> listar() throws SQLException{
        
        ArrayList<NotaFiscal> retorno  = new ArrayList<>();
        ResultSet rs = null;

        
      try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(urlDB, login, senha);
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM notafiscal");
            rs = comandoSQL.executeQuery();
            
            
             if (rs!= null){
                while(rs.next()){
                NotaFiscal item = new NotaFiscal();
                item.setIdNota(rs.getInt("idNota"));
                item.setNumeroNota(rs.getInt("numeroNota"));
                item.setValorNota(rs.getDouble("valorNota"));
                item.setIdProduto(rs.getInt("idProduto"));
                item.setNomeProduto(rs.getString("nomeProduto"));
                item.setEmailCliente(rs.getString("emailCliente"));
                item.setDataVenda(rs.getDate("data_venda"));
                
                retorno.add(item);
            }
        
            }
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("erro:" + e);
        }finally{
          if(rs!= null){
              try{rs.close();} 
              catch (Exception ex){}
              
          }
      }
      
      return retorno;
    
    }
    
    public static boolean excluir (int IdNota){
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(urlDB, login, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM NotaFiscal WHERE IdNota = ?");
            
            comandoSQL.setInt(1, IdNota);
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if (linhasAfetadas >= 0){ retorno = true;}
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }
    
}



