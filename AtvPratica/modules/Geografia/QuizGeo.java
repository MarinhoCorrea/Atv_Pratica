package modules.Geografia;
import java.util.Scanner;

public class QuizGeo {
    private Scanner scanner = new Scanner(System.in);

    public void SelecionarAtv() {
        System.out.println("\nOlá, aventureiro! Qual jornada deseja encarar hoje?");
        System.out.println("\n1 - Partir em uma aventura em busca da rocha suprema\n2 - Analisar os livros antigos na Biblioteca Real\n3 - Sair");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        switch(escolha) {
            case 1:

            break;

            case 2:

            break;

            case 3:
                System.out.println("Adeus viajante! Até uma próxima aventura 😉");
            break;
        }










        //System.out.println("Ao abrir o baú que contem a ROCHA SUPREMA, você descobre uma verdade libertadora: A verdadeira ROCHA SUPREMA são os conhecimentos que você adquiriu durante a sua jornada! Parabéns por ter concluído a sua aventura! ❤️");
    }
}