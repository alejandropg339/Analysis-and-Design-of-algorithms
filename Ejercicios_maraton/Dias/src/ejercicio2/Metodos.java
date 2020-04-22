/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Metodos {
    private int dias;

    public Metodos(int dias) {
        this.dias = dias;
    }
    
    public int CalcularAnios(){
        return dias/365;
    }
    public int CalcularMeses(){
        return (dias%365)/30;
    }
    
    public int CalcularDias(){
        return(dias%365)%30;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
