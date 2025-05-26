package modules.Geografia;

public class Sedimentares extends Rochas {
    public Sedimentares(String nome) {
        super(nome);
    }

     @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo de Rochas Sedimentares:formadas pela deposição e consolidação de sedimentos, que são fragmentos de outras rochas (ígneas, metamórficas ou até mesmo sedimentares) ou materiais orgânicos.");
    }

}
