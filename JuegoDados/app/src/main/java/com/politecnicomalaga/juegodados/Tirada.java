/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.juegodados;

/**
 *
 * @author mint
 */
public class Tirada {

    private Dado dado1;
    private Dado dado2;

    public Tirada() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
    }

    public String getTirada() {
        return "Dado 1: " + dado1.getValor() + "\nDado 2: " + dado2.getValor();
    }

    public int getDado1() {
        return dado1.getValor();
    }

    public int getDado2() {
        return dado2.getValor();
    }

    public int getSuma() {
        return dado1.getValor() + dado2.getValor();
    }

    public int haySeis() {
        int cont = 0;
        if (dado1.getValor() == 6) {
            cont++;
        }
        if (dado2.getValor() == 6) {
            cont++;
        }
        return cont;
    }

    public int haGanado(Tirada otraTirada) {
        int ganador = 0; //-1 si gana tirada1, 0 si empate, 1 si gana tirada2
        if (this.haySeis() > otraTirada.haySeis()) {
            ganador = -1;
        } else if (this.haySeis() < otraTirada.haySeis()) {
            ganador = 1;
        } else if (this.haySeis() == otraTirada.haySeis()) {
            if (this.getSuma() > otraTirada.getSuma()) {
                ganador = -1;
            } else if (this.getSuma() < otraTirada.getSuma()) {
                ganador = 1;
            } else {
                ganador = 0;
            }
        }
        return ganador;
    }

    public void tirarDeNuevo() {
        dado1.tirarDado();
        dado2.tirarDado();
    }
}
