/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculemos;

/**
 *
 * @author Sandra
 */
public class Valor {

    private int valor1;
    private int valor2;
    private int respuesta;

    public Valor() {
    }

    public void sumar(int num1, int num2) {
        this.valor1 = num1;
        this.valor2 = num2;
         respuesta = valor1 + valor2;
    }
    
     public void restar(int num1, int num2) {
        this.valor1 = num1;
        this.valor2 = num2;
         respuesta = valor1 - valor2;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

}
