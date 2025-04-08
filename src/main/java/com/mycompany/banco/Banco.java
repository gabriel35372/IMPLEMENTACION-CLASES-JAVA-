/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author joseg
 */
public class Banco {

    public static void main(String[] args) {
        Usuario usuario=new Usuario("GABRIEL MARTINEZ: ", 100000);
        CajeroAutomatico cajero=new CajeroAutomatico();
        cajero.consultarSaldo(usuario);
        cajero.depostitar(usuario,500);
        cajero.retirar(usuario,300);
        cajero.retirar(usuario,10);
        cajero.consultarSaldo(usuario);
        
    }
}