package modules.Portugues;

public class Romantismo extends EscolasLiterarias {
    
    public Romantismo(String nomeEscola, String periodoHistorico, String autorPrincipal) {
            super(nomeEscola, periodoHistorico, autorPrincipal);
        }
    
        @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo de Romantismo:  Caracterizado por uma ênfase na emoção, na subjetividade e no individualismo, o Romantismo se opôs ao racionalismo e à objetividade do Iluminismo e do Neoclassicismo. ");
    }
}
