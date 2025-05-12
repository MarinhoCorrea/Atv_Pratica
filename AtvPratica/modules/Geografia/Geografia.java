package modules.Geografia;
import Materia;

class Geografia extends Materia {
    public Geografia() {
        super("Geografia");
    }
    
    @Override
    void exibirConteudo() {
        System.out.println("Conteúdo de Geografia: estudo do espaço geográfico e suas interações.");
    }
}