package flyweightdesignpattern;

import java.util.concurrent.ThreadLocalRandom;

public class FlyWeightDesignPattern {


    private final static String[] profissoes = {"Engenheiro", "Programador", "Professor", "Medico", "Dentista", "Enfeirmeiro"};
    
    
    public static void main(String[] args) {

        for( int i = 0; i < 10000000 ; i++ ){
            Pessoa pessoa = new Pessoa();
            pessoa.setNome ( String.valueOf(i)  + " da Silva");
            pessoa.setCPF ( String.valueOf(i) );
            pessoa.setProfissao ( geraProfissao() );
            pessoa.cadastraNoBanco();
        }
    }
    
    static Profissao geraProfissao(){

        int indiceProfissoes = ThreadLocalRandom.current().nextInt(0, profissoes.length + 1);
        
        return semFlyWeight(indiceProfissoes);
        //return flyWeight(indiceProfissoes);
    }
    
    static Profissao flyWeight( int indiceProfissoes ){
        
        return ProfissaoFactory.getProfissao(String.valueOf(indiceProfissoes));
    }
    
    static Profissao semFlyWeight( int indiceProfissoes ){
        
        Profissao p = new Profissao();
        System.out.println("Nova Profissao Instanciada");
        p.setNome(String.valueOf(indiceProfissoes));
        p.setSalarioBase(indiceProfissoes);
        return p;
    }
}