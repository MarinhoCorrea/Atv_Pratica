package modules.Portugues;

public class Realismo extends EscolasLiterarias{
        
    public Realismo(String nomeEscola, String periodoHistorico, String autorPrincipal) {
        super(nomeEscola, periodoHistorico, autorPrincipal);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo do Realismo: Caracterizou-se pela objetividade, crítica social e análise psicológica dos personagens, buscando retratar a realidade de forma direta e racional.");    }

}
