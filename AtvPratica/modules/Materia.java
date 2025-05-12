package modules;

public abstract class Materia {
    String nome;
    
    public Materia(String nome) {
        this.nome = nome;
    }
    
    protected abstract void exibirConteudo();
}