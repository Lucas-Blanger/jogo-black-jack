/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo21;

import java.util.ArrayList;

public class BancaBlackJack extends Jogador implements Banca {

    private MacoCartas cartas;
    private ArrayList jogadores = new ArrayList();
    private int indice_jogador;

    public BancaBlackJack(String nome, mao mao, MacoCartas cartas) {
        super(nome, mao);
        this.cartas = cartas;
    }

    @Override
    protected boolean continuar() {
        if (getMao().total() <= 16) {
            return true;
        }
        return false;
    }

    @Override
    public void continuar(Jogador jogador) {
        jogador.adicionarCartas(cartas.distribuirCartaAberta());
    }

    @Override
    public void passarJogada() { //passTurn
        if (indice_jogador != jogadores.size()) {
            Jogador jogador = (Jogador) jogadores.get(indice_jogador);
            indice_jogador++;
            jogador.jogar(this);
        } else {
            this.jogar(this);
        }
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
//sobrepões para que a banca mostre suas cartas antes que comece a jogar

    public void jogar(Banca banca) {
        exporCartas();
        super.jogar(banca);
    }

    public void exporCartas() {
        getMao().mostrar();
        notificarOuvintes();
    }

    public void novoJogo() {
//distribui as cartas e diz ao primeiro jogador começar
        distribuir();
        passarJogada();
    }

    public void distribuir() {
        cartas.embaralhar();
//reconfigura cada jogador e distribui uma carta aberta para cada um e para si mesma
        Jogador[] jogador = new Jogador[jogadores.size()];
        jogadores.toArray(jogador);
        for (int i = 0; i < jogador.length; i++) {
            jogador[i].iniciar();
            jogador[i].adicionarCartas(cartas.distribuirCartaAberta());
        }
        this.adicionarCartas(cartas.distribuirCartaAberta());
//distribui mais uma carta aberta para cada jogador e uma fechada para si mesma
        for (int i = 0; i < jogador.length; i++) {
            jogador[i].adicionarCartas(cartas.distribuirCartaAberta());
        }
        this.adicionarCartas(cartas.distribuirCartaFechada());
    }

    protected void parar(Banca banca) {

    }
}
