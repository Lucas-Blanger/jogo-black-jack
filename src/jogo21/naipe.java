package jogo21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class naipe {
    public static final naipe OUROS = new naipe ((char)9830);
    public static final naipe COPAS = new naipe ((char)9829);
    public static final naipe ESPADAS = new naipe ((char)9824);
    public static final naipe PAUS = new naipe ((char)9827);
    
      private static final naipe [] VALORES = {OUROS, COPAS, ESPADAS, PAUS};
      
      public static final List NAIPES = Collections.unmodifiableList(Arrays.asList(VALORES));
    
    private final char exibicao;
    
    private naipe (char exibicao){
        this.exibicao = exibicao;
    }
    
    public char getExibicao() {
        return exibicao;
    }
    
}
