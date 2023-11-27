/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoperfumaria.daos;

import com.mycompany.projetoperfumaria.models.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giancarlomarques
 */
public class ProdutoDAO {

    static String urlDB = "jdbc:mysql://localhost:3306/perfumaria";
    static String login = "root";
    static String senha = "Gon@5514";

    public static boolean salvarProduto(Produto produto) {

        boolean salvo = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            // 1 - idenfiicar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2 - abrir conexão com BD
            conexao = DriverManager.getConnection(urlDB, login, senha);
            System.out.println("Conectado");
            // 3 - preparara o comando SQL
            comandoSQL = conexao.prepareStatement("INSERT INTO produto "
                    + "(nomeProduto, qtdProduto, precoProduto, categoria) "
                    + "VALUES (?, ?, ?, ?)", +PreparedStatement.RETURN_GENERATED_KEYS);

            comandoSQL.setString(1, produto.getNomeProduto());
            comandoSQL.setInt(2, produto.getQtdProduto());
            comandoSQL.setDouble(3, produto.getPrecoProduto());
            comandoSQL.setString(4, produto.getCategoriaProduto());
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                rs = comandoSQL.getGeneratedKeys();
                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                        produto.setId(idGerado);
                    }
                }
                salvo = true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return salvo;
    }

    public static ArrayList<Produto> listarProdutos() {
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs;
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(urlDB, login, senha);
            System.out.println("Conectado");
            comandoSQL = conexao.prepareStatement("SELECT * FROM produto");
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int idProduto = rs.getInt("idProduto");
                    String nomeProduto = rs.getString("nomeProduto");
                    int qtdProduto = rs.getInt("qtdProduto");
                    long precoProduto = rs.getLong("precoProduto");
                    String categoria = rs.getString("categoria");
                    Produto produto = new Produto(idProduto, nomeProduto, precoProduto, qtdProduto, categoria);
                    listaProdutos.add(produto);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return listaProdutos;
    }

    public static boolean atualizarProduto(Produto produto) {

        boolean atualizado = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(urlDB, login, senha);
            System.out.println("Conectado");
            comandoSQL = conexao.prepareStatement("UPDATE produto set precoProduto=?, qtdProduto=? WHERE idProduto=?");

            comandoSQL.setDouble(1, produto.getPrecoProduto());
            comandoSQL.setInt(2, produto.getQtdProduto());
            comandoSQL.setInt(3, produto.getId());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {

                atualizado = true;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return atualizado;
    }

    public static boolean excluirProduto(int id) {

        boolean atualizado = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(urlDB, login, senha);
            System.out.println("Conectado");
            comandoSQL = conexao.prepareStatement(
                    "DELETE FROM produto WHERE idProduto = ?");

            comandoSQL.setInt(1, id);

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {

                atualizado = true;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return atualizado;
    }
    
 public static ArrayList<Produto> listagemProdutos(){
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        ArrayList<Produto> listadeProdutos = new ArrayList<Produto>();
        
        try {
         conexao = DriverManager.getConnection(urlDB, login, senha);
                    comandoSQL = conexao.prepareStatement(
                    "DELETE FROM produto WHERE idProduto = ?");{
        while (rs.next()) {
        Produto produto = new Produto();
        produto.setId(rs.getInt("id"));
        produto.setNomeProduto(rs.getString("nome"));
        listadeProdutos.add(produto);
    }
        }
         
     } catch (Exception e) {
         
     }
        return null;
 } 
 
     public void decrementarQuantidadeDisponivel(int produtoId, int quantidade) {
        try (Connection conexao = DriverManager.getConnection(urlDB, login, senha);) {
            String sql = "UPDATE produtos SET qtdProduto = qtdProduto - ? WHERE idProduto = ?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setInt(1, produtoId);
                preparedStatement.setInt(2, quantidade);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Trate a exceção de maneira adequada
        }
    }
     
    
        
     }


 

    
   

