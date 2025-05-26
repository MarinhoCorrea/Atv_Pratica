package modules.Geografia;

public class Magmaticas extends Rochas {
    public Magmaticas(String nome) {
        super(nome);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo de Rochas Magmáticas: formação a partir do resfriamento do magma.");
    }

}
