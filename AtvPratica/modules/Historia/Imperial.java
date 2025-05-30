package modules.Historia;

public class Imperial extends Historia {
    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo do Brasil Imperial: ");
        System.out.println("Idade da Coroação: " + idadeCoroacao());
        System.out.println("Guerra do Paraguai: " + guerraParaguai());
        System.out.println("Lei Áurea: " + leiAurea());
    }
    public String idadeCoroacao(){
        return "Dom Pedro II assumiu como imperador do Brasil com 14 anos de idade, após o Golpe da Maioridade, que antecipou sua maioridade legal, que era aos 18 anos.\n A antecipação da maioridade ocorreu em 1840 e a coroação foi em 1841, marcando o início do Segundo Reinado.";
    }
    public String guerraParaguai(){
        return "A Guerra do Paraguai, também conhecida como Guerra da Tríplice Aliança, foi um conflito armado que ocorreu entre 1864 e 1870 na América do Sul.\n A guerra envolveu o Paraguai contra a Tríplice Aliança, formada pelo Império do Brasil, Argentina e Uruguai.";
    }
    public String leiAurea(){
        return "A Lei Áurea, oficialmente Lei Imperial nº 3.353 de 13 de maio de 1888, foi a lei que aboliu a escravidão no Brasil.\n Sancionada pela princesa Isabel, então regente do Império, a lei declarava extinta a escravidão em todo o território brasileiro.";
    }
}
