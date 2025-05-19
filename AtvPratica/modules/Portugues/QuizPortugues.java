package modules.Portugues;
import java.util.Scanner;

public class QuizPortugues {
    private Scanner scanner = new Scanner(System.in);

    public void SelecionarAtv() {
        System.out.println("\nOlá, Viajante ! Nós te escolhemos para uma Grande Missão!\nPrecisamos que você viaje pela linha do tempo e junte para nós os fragmentos mágicos de cada Era Literaria para que consigamos montar a Apostila Suprema!\n");
        System.out.println("Aceita a missão? Sim (1) /Não (0)");
        int resposta = scanner.nextInt();
        switch(resposta) {
            case 1:

            break;

            case 2:
            System.out.println("Que pena, viajante! Você perdeu a oportunidade de se tornar um grande sábio. Mas não se preocupe, sempre haverá novas aventuras esperando por você. Até a próxima!");
            break;

        }
        
}
