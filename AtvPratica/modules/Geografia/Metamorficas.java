package modules.Geografia;

public class Metamorficas extends Rochas{
    public Metamorficas(String nome) {
        super(nome);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo de Rochas Metamorficas: formação a partir de alta pressão e temperatura");
    }
}
