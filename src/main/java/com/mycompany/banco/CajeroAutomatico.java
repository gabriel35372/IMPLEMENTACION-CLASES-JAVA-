/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author joseg
 */
public class CajeroAutomatico {
    public void consultarSaldo(Usuario usuario){
        System.out.println("Saldo actual de: "+usuario.getNombre()+"$"+usuario.getCuenta().getSaldo());
    }
    
    public void depostitar(Usuario usuario, double cantidad){
        usuario.getCuenta().depositar(cantidad);
    }
    
    public void retirar(Usuario usuario, double cantidad){
        usuario.getCuenta().retirar(cantidad);
    }
}
