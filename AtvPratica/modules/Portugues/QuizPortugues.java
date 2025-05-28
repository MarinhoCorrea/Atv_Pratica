package modules.Portugues;
import java.util.Scanner;

public class QuizPortugues {
    private Scanner scanner = new Scanner(System.in);

    public void SelecionarAtv() {
        System.out.println("\nOlá, Viajante ! Meu nome é S.A.M.I.R.A., serei seu ajudante nessa jornada! Nós te escolhemos para uma Grande Missão!\nPrecisamos que você viaje pela linha do tempo e junte para nós os fragmentos mágicos de cada Era Literaria para que consigamos montar a Apostila Suprema!\n");
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
        System.out.println("Em um milésimo de segundo, você é transportado juntamente ao seu ajudante.\nAo abrir os olhos, percebe-se envolto por uma floresta misteriosa, onde a escuridão dança entre as copas densas e uma flora exuberante cintila com beleza sobrenatural.\n");
        System.out.println("O silêncio mortal logo é cortado por uma voz encantadora ao meio das sombras. Movido pela curiosidade, você decide ir em sua direção");
        System.out.println("Um senhor alimentando patos em um lago aparenta ser a fonta da voz maravilhosa. Sua vestimenta o chama a atenção: mantos, um cetro apoiado no chão e uma coroa com diversas joias.");
        System.out.println("Ao admirar o senhor por um tempo, confuso com a real identidade, você sente uma vibração em seu bolso: Um relógio, que outrora não estava lá, começa a apitar.");
        System.out.println("Ao pegar o relógio, uma surpresa não agrádavel se mostra: S.A.M.I.R.A. havia se disfarçado como um relógio e escondido em seu bolso.\n 'Olá! Como você está amigão???!'\n Você se assusta com o ocorrido, e seu grito chama a atenção do nobre senhor, que anda em sua direção para cumprimenta-lo.");
        System.out.println("Olá senhor, como estás? Por que estás me bisbilhotando neste belo entardecer?");
        System.out.println("")
    }
}
