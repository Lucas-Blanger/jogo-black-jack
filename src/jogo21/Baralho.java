/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo21;

import java.util.Iterator;

/**
 *
 * @author 04088452011
 */
public class Baralho {

    private carta[] baralho;
    private int indice;

    public Baralho() {
        construirCartas();
    }

    private void construirCartas() {
        baralho = new carta[52];
        Iterator naipes = naipe.NAIPES.iterator();
        int contador = 0;
        while (naipes.hasNext()) {
            naipe naipe = (naipe) naipes.next();
            Iterator numeros = numero.NUMEROS.iterator();
            while (numeros.hasNext()) {
                numero numero = (numero) numeros.next();
                baralho[contador] = new carta(numero, naipe);
                contador++;
            }
        }
    }

    public void imprimirBaralho() {
        for (int i = 0; i < baralho.length; i++) {
            carta carta = (carta) baralho[i];
            System.out.println(carta.toString());
        }
    }

    public void adicionaraoMaco(MacoCartas maco) {
        maco.adicionarCartas(baralho);
    }
}
