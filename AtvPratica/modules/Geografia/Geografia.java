package modules.Geografia;

import modules.Materia;

class Geografia extends Materia {
    public Geografia() {
        super("Geografia");
    }
    
    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo de Geografia: estudo do espaço geográfico e suas interações.");
    }
}