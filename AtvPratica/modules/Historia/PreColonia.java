package modules.Historia;

public class PreColonia extends Historia {
    @Override
    public  void exibirConteudo() {
        System.out.println("Conteúdo do Brasil Pré-Colonial: ");
        System.out.println("Organização Tribal: " + conteudoOrganizacaoTribal());
        System.out.println("Economia: " + conteudoEconomia());
        System.out.println("Pintura Corporal: " + PinturaCorporal());
    }
    public  String conteudoOrganizacaoTribal() {
        return "A maioria dos povos indígenas no Brasil Pré-Colonial era organizada em tribos com estruturas coletivas e lideranças locais.";
    }
    public   String conteudoEconomia() {
        return "A economia era baseada na caça, pesca, coleta e agricultura de subsistência, com uma relação harmônica com a natureza.";
    }
    public  String PinturaCorporal() {
        return "Os povos indígenas utilizavam corantes naturais como urucum e jenipapo para fazer pinturas corporais.";
    }
}
