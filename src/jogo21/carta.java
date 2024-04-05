package jogo21;

public class carta {
    
    private numero numero;
    private naipe naipe;
    private boolean virada_para_cima = true;

    public carta(numero numero, naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public numero getNumero() {
        return numero;
    }

    public naipe getNaipe() {
        return naipe;
    }

    public boolean isVirada_para_cima() {
        return virada_para_cima;
    }

    public void setVirada_para_cima(boolean virada_para_cima) {
        this.virada_para_cima = virada_para_cima;
    }

    public String toString() {
        if (!isVirada_para_cima()) {
            return "Oculta";
        }
        return numero.getExibicao() + naipe.getExibicao();
    }
}
