package jogo21;

public class Jogo21 {

    public static void main(String[] args) {
        MacoCartas cartas = new MacoCartas();
        for (int i = 0; i < 4; i++) {
            cartas.embaralhar();
            Baralho baralho = new Baralho();
            baralho.adicionaraoMaco(cartas);
            cartas.embaralhar();
        }
        mao mao_banca = new mao();
        BancaBlackJack banca = new BancaBlackJack("Banca", mao_banca, cartas);
        mao mao_humana = new mao();
        Jogador jogador = new JogadorHumano("Humano", mao_humana);
        banca.adicionarOuvinte(Console.INSTANCE);
        jogador.adicionarOuvinte(Console.INSTANCE);
        banca.adicionarJogador(jogador);
        banca.novoJogo();
        banca.exporCartas();

    }

}
