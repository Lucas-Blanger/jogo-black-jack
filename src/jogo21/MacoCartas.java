/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author 04088452011
 */
public class MacoCartas {

    private ArrayList maco = new ArrayList();
    private int indice;
    private Random rand = new Random();

    public void adicionarCartas(carta[] cartas) {
        for (int i = 0; i < cartas.length; i++) {
            maco.add(cartas[i]);
        }
    }

    public void embaralhar() {
        ocultarCartas();
        trocarCartas();
        trocarCartas();
        trocarCartas();
        trocarCartas();
    }

    public void ocultarCartas() {
        indice = 0;
        Iterator i = maco.iterator();
        while (i.hasNext()) {
            carta carta = (carta) i.next();
            carta.setVirada_para_cima(false);
        }
    }

    private void trocarCartas() {
        int numero_cartas = maco.size();
        for (int i = 0; i < numero_cartas; i++) {
            int indice = rand.nextInt(numero_cartas);
            carta carta_i = (carta) maco.get(i);
            carta carta_indice = (carta) maco.get(indice);
            maco.set(i, carta_indice);
            maco.set(indice, carta_i);
        }
    }

    public carta distribuirCartaAberta() {
        carta carta = distribuir();
        if (carta != null) {
            carta.setVirada_para_cima(true);
        }
        return carta;
    }

    public carta distribuirCartaFechada() {
        carta carta = distribuir();
        if (carta != null) {
            carta.setVirada_para_cima(false);
        }
        return carta;
    }

    private carta distribuir() {
        if (indice != maco.size()) {
            carta carta = (carta) maco.get(indice);
            indice++;
            return carta;
        }
        return null;
    }
}
