package modules.Historia;

public class ArquivosAIH extends Historia {
    public PreColonia PreColonia = new PreColonia();
    public Colonial Colonial = new Colonial();
    public Imperial Imperial = new Imperial();
    public Republica Republica = new Republica();
    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo do Brasil Arquivos AIH: ");
        System.out.println("Pré-Colônia: ");
        PreColonia.exibirConteudo();
        System.out.println("Brasil Colonial: ");
        Colonial.exibirConteudo();
        System.out.println("Brasil Império: ");
        Imperial.exibirConteudo();
        System.out.println("Brasil República: ");
        Republica.exibirConteudo();
    }
}
