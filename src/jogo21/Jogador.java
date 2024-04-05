/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo21;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 04088452011
 */
public abstract class Jogador {

    private mao mao;
    private String nome;
    private ArrayList ouvintes = new ArrayList();

    public Jogador(String nome, mao mao) {
        this.nome = nome;
        this.mao = mao;
    }

    public void adicionarCartas(carta carta) {
        this.mao.adicionarCarta(carta);
        notificarOuvintes();
    }

    protected void notificarOuvintes() {
        Iterator i = ouvintes.iterator();
        while (i.hasNext()) {
            OuvinteDoJogador oj = (OuvinteDoJogador) i.next();
            oj.mudouMao(this);
        }
    }

    public void jogar(Banca banca) {
//como antes, joga até que o jogador estoure ou pare
        while (!estourou() && continuar()) { //continuar() está no livro como hit()
            banca.continuar(this);
        }
    }

    public void iniciar() {
        mao.esvaziar();
    }

    public boolean estourou() {
        return mao.estourou();
    }

    public void adicionarOuvinte(OuvinteDoJogador oj) {
        ouvintes.add(oj);
    }

    public String toString() {
        return (nome + " : " + mao.mostrar());
    }

    protected mao getMao() {
        return mao;
    }


    protected void parar(Banca banca) {
        banca.passarJogada();
    }

    protected abstract boolean continuar();
}
