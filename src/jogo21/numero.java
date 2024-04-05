
package jogo21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class numero {
    public static final numero DOIS = new numero (2,"2");
    public static final numero TRES = new numero (3,"3");
    public static final numero QUATRO = new numero (4,"4");
    public static final numero CINCO= new numero (5,"5");
    public static final numero SEIS = new numero (6,"6");
    public static final numero SETE = new numero (7,"7");
    public static final numero OITO = new numero (8,"8");
    public static final numero NOVE = new numero (9,"9");
    public static final numero DEZ = new numero (10,"10");
    public static final numero VALETE = new numero (10,"J");
    public static final numero RAINHA = new numero (10,"Q");
    public static final numero REI = new numero (10,"K");
    public static final numero AS = new numero (11,"A");
    
    private static final numero [] VALORES = {DOIS, TRES,
            QUATRO, CINCO,SEIS, SETE, OITO, NOVE, DEZ, VALETE, RAINHA, REI, AS};
    
    public static final List NUMEROS = Collections.unmodifiableList(Arrays.asList(VALORES));
    
    private final int valor;
    private final String exibicao;
    
    private numero (int valor, String exibicao) {
        
        this.valor = valor;
        this.exibicao = exibicao;
    }

    public int getValor() {
        return valor;
    }

    public String getExibicao() {
        return exibicao;
    }
}
