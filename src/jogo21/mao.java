package jogo21;

import java.util.ArrayList;
import java.util.Iterator;

public class mao {

    private ArrayList cartas = new ArrayList();
    private static final int BLACKJACK = 21;

    public void adicionarCarta(carta carta) {
        cartas.add(carta);
    }

    public boolean estourou() {
        if (total() > BLACKJACK) {
            return true;
        }
        return false;
    }

    public int total() {
        int total = 0;
        Iterator i = cartas.iterator();
        while (i.hasNext()) {
            carta carta = (carta) i.next();
            total += carta.getNumero().getValor();
        }
        return total;
    }

    public void esvaziar() {
        cartas.clear();
    }

    public void virar() {
        Iterator i = cartas.iterator();
        while (i.hasNext()) {
            carta carta = (carta) i.next();
            carta.setVirada_para_cima(true);
        }
    }

    public String mostrar() {
        Iterator i = cartas.iterator();
        String string = "";
        while (i.hasNext()) {
            carta carta = (carta) i.next();
            string = string + " " + carta.toString();
        }
        return string;
    }
}
