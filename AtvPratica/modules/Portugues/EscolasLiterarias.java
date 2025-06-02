package modules.Portugues;

public class EscolasLiterarias extends Portugues{
    private String nomeEscola;
    private String periodoHistorico;
    private String autorPrincipal;

    public EscolasLiterarias(String nomeEscola, String periodoHistorico, String autorPrincipal) {
        this.nomeEscola = nomeEscola;
        this.periodoHistorico = periodoHistorico;
        this.autorPrincipal = autorPrincipal;
    }

    public void exibirConteudo() {
        System.out.println("Informações da escola literária:");
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public String getPeriodoHistorico() {
        return periodoHistorico;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }
}