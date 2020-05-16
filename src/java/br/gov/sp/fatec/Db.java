/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sp.fatec;

import java.util.ArrayList;
/**
 *
 * @author NOEMI
 */
public class Db {
    private static ArrayList<Cliente> clientes;
    public static ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    private static ArrayList<Fornecedor> fornecedores;
    public static ArrayList<Fornecedor> getFornecedores(){
        return fornecedores;
    }
    
    
}
