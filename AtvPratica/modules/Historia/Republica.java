package modules.Historia;

public class Republica extends Historia{
    @Override
    public void exibirConteudo() {
        System.out.println("Conteúdo do Brasil República: ");
        System.out.println("Proclamação da República: " + estadoNovo());
        System.out.println("Revolução de 1930: " + clt());
        System.out.println("Ditadura Militar: " + suicidioVargas());
    }

    public String estadoNovo() {
        return "O Estado Novo foi um período da história do Brasil que durou de 1937 a 1945, caracterizado por um regime autoritário sob a liderança de Getúlio Vargas.";
    }
    
    public String clt() {
        return "A Consolidação das Leis do Trabalho (CLT) foi criada em 1943 e estabeleceu direitos trabalhistas fundamentais no Brasil.";
    }
    
    public String suicidioVargas() {
        return "Getúlio Vargas cometeu suicídio em 24 de agosto de 1954, em meio a uma crise política, deixando uma carta-testamento que expressava seu amor pelo povo brasileiro.";
    }
}