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
public class JogadorHumano extends Jogador {

    private final static String CONTINUAR = "C"; //HIT
    private final static String PARAR = "P"; //STAND
    private final static String MENSAGEM = "[C]ontinuar ou [P]arar";
    private final static String DEFAULT = "inválido";

    public JogadorHumano(String nome, mao mao) {
        super(nome, mao);
    }

    protected boolean continuar() {
        while (true) {
            Console.INSTANCE.imprimirMensagem(MENSAGEM);
            String resposta = Console.INSTANCE.lerEntrada(DEFAULT);
            if (resposta.equalsIgnoreCase(CONTINUAR)) {
                return true;
            } else {
                if (resposta.equalsIgnoreCase(PARAR)) {
                    return false;
                }
            }
//se chegarmos aqui, faz um laço até obtermos entrada significativa
        }
    }
}
