package modules.Geografia;

public class Rochas extends Geografia{
    protected String nome;

    public Rochas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo de Rochas: formação das rochas e tipos de rochas.");
    }
    
}
