import java.util.Scanner;

import modules.Geografia.QuizGeo;
import modules.Historia.PreColonia;
import modules.Historia.QuizHistoria;
import modules.Portugues.QuizPortugues;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizGeo quizGeo = new QuizGeo();
        QuizHistoria quizHistoria = new QuizHistoria();
        QuizPortugues quizPortugues = new QuizPortugues();
        int escolha;

        do {
            System.out.println("\n🌍 Bem-vindo à jornada do conhecimento!");
            System.out.println("1 - Encontrar a ROCHA SUPREMA no mundo da Geografia");
            System.out.println("2 - Ser um agente da AIH e recuperar as memórias perdida no mundo da História");
            System.out.println("3 - Recolher os fragmentos mágicos para construir a APOSTILA SAGRADA no mundo da Literatura");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    quizGeo.SelecionarAtv();
                    break;
                case 2:
                    quizHistoria.SelecionarAtv();
                    break;

                case 3:
                    quizPortugues.SelecionarAtv();
                    break;
                case 0:
                    System.out.println("\n👋 Adeus, viajante! Volte sempre!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\n⚠️ Escolha inválida! Tente novamente.");
            }
        } while (escolha != 0);
    }
}