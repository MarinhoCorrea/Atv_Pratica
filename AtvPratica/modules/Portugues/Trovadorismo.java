package modules.Portugues;

public class Trovadorismo extends EscolasLiterarias {
    public Trovadorismo(String nomeEscola, String periodoHistorico, String autorPrincipal) {
        super(nomeEscola, periodoHistorico, autorPrincipal);
    }
    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo do Trovadorismo:  Caracterizou Caracterizou-se pela produção de cantigas, poesias que eram cantadas ou recitadas, acompanhadas de instrumentos musicais.  ");
    }
}
