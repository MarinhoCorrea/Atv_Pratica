package modules.Portugues;

public class EscolasLiterarias extends Portugues {
    private String nomeEscola;
    private String periodoHistorico;
    private String autorPrincipal;
    public EscolasLiterarias(String nomeEscola, String periodoHistorico, String autorPrincipal) {
        this.nomeEscola = nomeEscola;
        this.periodoHistorico = periodoHistorico;
        this.autorPrincipal = autorPrincipal;
    }
    
    @Override
    public void exibirConteudo() {
        System.out.println("As Escolas Literárias são períodos históricos que agrupam autores e obras com características estilísticas, temáticas e contextos históricos semelhantes.");
    }
}