package modules.Portugues;
import modules.Materia;


class Portugues extends Materia {
    public Portugues() {
        super("Português");
    }
    
    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo de Português: Escolas Literárias");
    }
}
