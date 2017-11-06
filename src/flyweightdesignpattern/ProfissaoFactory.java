package flyweightdesignpattern;

import java.util.HashMap;


public class ProfissaoFactory {
    
    private static final HashMap <String, Profissao> profissoesPorNome = new HashMap();
    

    public static Profissao getProfissao(String nome){
        Profissao p = (Profissao)profissoesPorNome.get(nome);
        
        if( p == null){
            p = new Profissao();
            System.out.println("Nova Profissao Instanciada");
            p.setNome(nome);
            profissoesPorNome.put( nome , p);
        }
        
        return p;
    }
    
}
