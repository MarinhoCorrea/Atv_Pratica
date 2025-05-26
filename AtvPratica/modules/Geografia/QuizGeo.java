package modules.Geografia;
import java.util.Scanner;
import java.util.ArrayList;

public class QuizGeo {
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Rochas> rochas = new ArrayList<>();
    

    public void SelecionarAtv() {
        System.out.println("\nOlá, aventureiro! Qual jornada deseja encarar hoje?");
        System.out.println("\n1 - Partir em uma aventura em busca da ROCHA SUPREMA\n2 - Analisar os livros antigos na Biblioteca Real\n3 - Sair");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        switch(escolha) {
            case 1:
                aventuraRochaSuprema();
            break;

            case 2:
                bibliotecaReal();
            break;

            case 3:
                System.out.println("Adeus viajante! Até uma próxima aventura 😉");
            break;

            default:
                SelecionarAtv();
        }
    }

    public void aventuraRochaSuprema() {

        rochas.add(new Magmaticas("Granito"));
        rochas.add(new Magmaticas("Basalto"));
        rochas.add(new Sedimentares("Calcário"));
        rochas.add(new Sedimentares("Arenito"));
        rochas.add(new Metamorficas("Mármore"));
        rochas.add(new Metamorficas("Gnaisse"));

        System.out.println("\n🌍 Você é um aventureiro destemido, em busca da lendária ROCHA SUPREMA.");
        System.out.println("Dizem que ela contém o conhecimento geológico de todas as eras e apenas os sábios podem encontrá-la.");
        System.out.println("\nApós dias de caminhada por desertos implacáveis e montanhas escarpadas, você chega a um vale misterioso.");
        System.out.println("No meio do caminho, uma figura surge: um velho sábio, sentado sobre uma pedra com inscrições antigas.");
        System.out.println("\n👤 Sábio: 'Ah, viajante... para encontrar a ROCHA SUPREMA, você precisa primeiro compreender a essência da terra.'");
        System.out.println("'Cada rocha tem sua história, seu segredo. Você está preparado para enfrentar o desafio?'");

        System.out.println("\n⚔️ Determinado, você decide continuar sua jornada.");
        System.out.println("A cada passo, você encontra formações rochosas desconhecidas, e precisa identificá-las corretamente.");
        System.out.println("Somente os que dominam a geologia conseguirão chegar ao templo secreto.");

        System.out.println("\n🚶‍♂️ Depois de atravessar florestas ocultas e cavernas profundas, entre as árvores surge uma construção de pedra.");
        System.out.println("Seu coração acelera: este é o lendário Templo da ROCHA SUPREMA!");

        System.out.println("\n🔥 A porta do templo está trancada. No centro do salão, há um altar com diferentes rochas.");
        System.out.println("Para avançar, você precisa classificá-las corretamente, provando seu conhecimento.");
        System.out.println("Será que você conseguirá superar esse último desafio e entrar na tumba lendária?");

        System.out.println("\n🔒 Você se aproxima do altar no centro do templo, onde repousam diversas rochas antigas.");
        System.out.println("Ao lado, há um painel esculpido na pedra com inscrições em uma linguagem ancestral.");
        System.out.println("\n📜 A mensagem diz: 'Aquele que deseja adentrar a tumba da ROCHA SUPREMA precisa provar seu conhecimento sobre as rochas do mundo.'");
        System.out.println("'Classifique corretamente as rochas diante de você e a porta se abrirá.'");

        System.out.println("\n🧐 Você observa atentamente as rochas sobre o altar. É hora de classificá-las!");

        System.out.println("\n🔹 Rocha 1: Granito\nQual é sua classificação?");
        System.out.println("1 - Ígnea\n2 - Sedimentar\n3 - Metamórfica");
        int pontuacao = 0;
    
    for (Rochas r : rochas) { // Aqui, 'r' representa cada rocha da lista
        System.out.println("\n🔹 Rocha encontrada: " + r.getNome());
        System.out.println("Qual é sua classificação?");
        System.out.println("1 - Ígnea\n2 - Sedimentar\n3 - Metamórfica");
        
        int escolha = scanner.nextInt();
        scanner.nextLine();

        boolean correto = (r instanceof Magmaticas && escolha == 1) ||
                          (r instanceof Sedimentares && escolha == 2) ||
                          (r instanceof Metamorficas && escolha == 3);

        if (correto) {
            System.out.println("\n✅ Correto! " + r.getNome() + " foi classificada corretamente.");
            pontuacao++;
        } else {
            System.out.println("\n❌ Incorreto! " + r.getNome() + " pertence a outra classificação.");
        }
    }

    if (pontuacao >= 3) {
        System.out.println("\n🎉 A tumba está satisfeita com seus resultados! A porta se abre lentamente...");
        System.out.println("Ao abrir o baú que contém a ROCHA SUPREMA, você descobre uma verdade libertadora:");
        System.out.println("A verdadeira ROCHA SUPREMA são os conhecimentos que você adquiriu durante a jornada! Parabéns! ❤️");
    } else {
        System.out.println("\n🚪 A tumba permanece fechada. Talvez seja hora de aprender mais e tentar novamente!");
    }

    }
    public void bibliotecaReal() {
        System.out.println("\n📚 Você adentra a majestosa Biblioteca Real, onde pergaminhos e livros centenários repousam sobre prateleiras douradas.");
        System.out.println("Os sábios estudam atentamente mapas antigos, fórmulas geológicas e registros de expedições.");
        System.out.println("\nAqui você pode aprender tudo sobre a formação das rochas e expandir sua sabedoria.");

        System.out.println("\nEscolha o que deseja aprender:");
        System.out.println("1 - Aprender conceitos");
        System.out.println("2 - Ver exemplos práticos");
        System.out.println("3 - Voltar");

        Rochas rocha = new Rochas(null);
        Rochas magmaticas = new Magmaticas(null);
        Rochas metamorficas = new Metamorficas(null);
        Rochas sedimentares = new Sedimentares(null);


        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 1) {
            System.out.println("\n📖 Aprendendo Conceitos..."); 
            rocha.exibirConteudo();
            magmaticas.exibirConteudo();
            sedimentares.exibirConteudo();
            metamorficas.exibirConteudo();
            System.out.println("\n✨ O conhecimento é seu maior tesouro! Agora você pode continuar explorando ou voltar.");
        } 
        else if (escolha == 2) {
            System.out.println("\n🔍 Exemplos Práticos...");
            System.out.println("\n🔍 Exemplo: O granito e o basalto são rochas magmáticas, muito usadas na construção e em pisos.");            System.out.println("\n🌊 Rochas Sedimentares: Surgem a partir da compactação de sedimentos ao longo de milhões de anos.");
            System.out.println("\n🔍 Exemplo: O calcário e o arenito são rochas sedimentares, encontradas em cavernas e utilizadas na produção de cimento.");
            System.out.println("\n🔍 Exemplo: O mármore e o gnaisse são rochas metamórficas, usadas em esculturas e revestimentos sofisticados.");
            System.out.println("\n✨ Agora que viu alguns exemplos, sua compreensão ficou ainda mais forte!");
        } 
        else if (escolha == 3) {
            System.out.println("\n🔙 Você sai da biblioteca e se prepara para sua jornada!");
            SelecionarAtv(); // Sai do loop e retorna ao menu principal
        } 
        else {
            System.out.println("\n⚠️ Escolha inválida! Tente novamente.");
        }

    }
}