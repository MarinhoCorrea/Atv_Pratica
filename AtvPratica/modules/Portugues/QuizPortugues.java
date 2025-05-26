package modules.Portugues;
import java.util.Scanner;

public class QuizPortugues {
    private Scanner scanner = new Scanner(System.in);

    public void SelecionarAtv() {
        System.out.println("\nOlá, Viajante ! Nós te escolhemos para uma Grande Missão!\nPrecisamos que você viaje pela linha do tempo e junte para nós os fragmentos mágicos de cada Era Literaria para que consigamos montar a Apostila Suprema!\n");
        System.out.println("Aceita a missão? Sim (1) /Não (0)");
        int resposta = scanner.nextInt();
        scanner.nextLine();
        switch(resposta) {
            case 1:
                jornadaApostilaSagrada();
            break;

            case 0:
            System.out.println("Que pena, viajante! Você perdeu a oportunidade de se tornar um grande sábio. Mas não se preocupe, sempre haverá novas aventuras esperando por você. Até a próxima!");
            break;

            default: 
            System.out.println("Como planeja ajudar a reconstruir a APOSTILA SAGRADA sem seguir regras básicas da leitura e entendimento? Opção Inválida");
            SelecionarAtv();

        }
    }  

    public void jornadaApostilaSagrada() {

        Trovadorismo trovadorismo = new Trovadorismo("Trovadorismo", "Século XII a XV", "Dom Dinis");

        System.out.println("Ótimo, nossa primeira parada será o século XII! Iremos explorar um movimento conhecido por muitos como TROVADORISMO! Irei te contar um pouco sobre ele!");
        trovadorismo.exibirConteudo();
        System.out.println("Pronto! Conseguiu aprender? Não importa! Não temos tempo para isso! Vamos logo! Temos que salvar o rei Ricardo Coração de Leão! Um dos maiores autores do Trovadorismo! Ele está em perigo!!!!");        
    }
}
