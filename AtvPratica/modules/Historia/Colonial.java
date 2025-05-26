package modules.Historia;

public class Colonial extends PeriodosBrasil {
    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo do Brasil Colonial:");
    }
    public String produtoExportacao() {
        return "O principal produto de exportação do Brasil Colonial era o açúcar, devido à terra que promoveu grande produção e à neccesidade do mercado.";
    }
    public String maoDeObra() {
        return "A mão de obra no Brasil Colonial era predominantemente escrava, composta por indígenas e africanos trazidos para trabalhar nas plantações.";
    }
    public String invasoesEstrangeiras() {
        return "Os holandeses permaneceram no Brasil de 1630 a 1654, e sua presença aqui ficou profundamente marcada pela administração de Maurício de Nassau, militar alemão enviado pela Companhia das Índias Ocidentais para governar a colônia holandesa.\nA expulsão dos holandeses aconteceu por meio da mobilização popular contra os holandeses motivada pela Guerra de Restauração, que teve início em 1640.";
    }
}
