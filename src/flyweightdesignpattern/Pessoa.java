package flyweightdesignpattern;

public class Pessoa {
    
    // Parâmetros intrínsicos
    private String nome;
    private String CPF;
    
    // Parâmetros extrínsecos
    private Profissao profissao;

    
    public void cadastraNoBanco(){}
    
    
    //GETS E SETS:
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }   

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao propriedade) {
        this.profissao = propriedade;
    }
    
}
