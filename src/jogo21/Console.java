/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo21;

/**
 *
 * @author 04088452011
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console implements OuvinteDoJogador {
//console singleton

    public final static Console INSTANCE = new Console();
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String lerEntrada(String entrada_default) {
        String resposta;
        try {
            return in.readLine();
        } catch (IOException ioe) {
            return entrada_default;
        }
    }

    public void mudouMao(Jogador jogador) {
        imprimirMensagem(jogador.toString());
    }
//private para impedir instanciação

    private Console() {
    }
}
