package modules.Historia;

import modules.Materia;

 class Historia extends Materia {
    public Historia() {
        super("História");
    }
    
    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo de História: Estudo do passado para entender o Presente");
    }
}