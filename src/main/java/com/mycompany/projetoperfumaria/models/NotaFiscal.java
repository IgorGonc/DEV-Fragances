/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoperfumaria.models;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author igor.goncalves
 */
public class NotaFiscal {
    private int idNota;
    private int numeroNota;
    private double valorNota;
    private int idProduto;
    private String nomeProduto;
    private String emailCliente;
    private Date dataVenda;

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public NotaFiscal (){
    }

    public NotaFiscal(int numeroNota, double valorNota, int idProduto, String nomeProduto, String emailCliente) {
        this.numeroNota = numeroNota;
        this.valorNota = valorNota;
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.emailCliente = emailCliente;
    }

    public NotaFiscal(int numeroNota, double valorNota) {
        this.numeroNota = numeroNota;
        this.valorNota = valorNota;
    }

    public NotaFiscal(int idNota, int numeroNota, double valorNota) {
        this.idNota = idNota;
        this.numeroNota = numeroNota;
        this.valorNota = valorNota;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }

  
    
}
