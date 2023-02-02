/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.juegodados;

import java.util.Random;

/**
 *
 * @author mint
 */
public class Dado {

    private int valor;

    public Dado() {
        Random r = new Random();
        this.valor = r.nextInt(6) + 1;
    }

    public int tirarDado() {
        Random r = new Random();
        this.valor = r.nextInt(6) + 1;
        return this.valor;
    }

    public int getValor() {
        return valor;
    }

}
