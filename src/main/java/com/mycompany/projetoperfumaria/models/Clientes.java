/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoperfumaria.models;

import java.util.ArrayList;

/**
 *
 * @author tigor
 */
public class Clientes {
    //Produto(1, "Lancôme",QUANTIDADE, 20.00);
    ArrayList<Cliente> clientes;
    public Clientes(){
        this.clientes = new ArrayList<Cliente>();
    }
    
    public void salvarCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println("cliente salvo");
    }
     
   public void mostrarClientes(){
       for (Cliente cliente : clientes) {
           System.out.println("models.Clientes.mostrarClientes()");
       }
   }
    
   
}
