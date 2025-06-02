package modules.Geografia;

import java.util.Scanner;
import java.util.ArrayList;

public class QuizGeo {
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Rochas> rochas = new ArrayList<>();

    public void SelecionarAtv() {
        System.out.println("\nOlá, aventureiro! Qual jornada deseja encarar hoje?");
        System.out.println(
                "\n1 - Partir em uma aventura em busca da ROCHA SUPREMA\n2 - Analisar os livros antigos na Biblioteca Real\n3 - Sair");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        switch (escolha) {
            case 1:
                try {
                    aventuraRochaSuprema();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                try {
                    bibliotecaReal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case 3:
                System.out.println("Adeus viajante! Até uma próxima aventura 😉");
                break;

            default:
                SelecionarAtv();
        }
    }

    public void aventuraRochaSuprema() throws InterruptedException {
        rochas.add(new Magmaticas("Granito"));
        rochas.add(new Magmaticas("Basalto"));
        rochas.add(new Sedimentares("Calcário"));
        rochas.add(new Sedimentares("Arenito"));
        rochas.add(new Metamorficas("Mármore"));
        rochas.add(new Metamorficas("Gnaisse"));

        System.out.println("\n🌍 Você é um aventureiro destemido, em busca da lendária ROCHA SUPREMA.");
        Thread.sleep(3000);
        System.out.println("Dizem que ela contém o conhecimento geológico de todas as eras...");
        Thread.sleep(3000);
        System.out.println("...e apenas os sábios podem encontrá-la.");
        Thread.sleep(3000);

        System.out.println("\n⛰️ Após dias enfrentando desertos escaldantes e cavernas escuras...");
        Thread.sleep(3000);
        System.out.println("...você chega a um vale silencioso e envolto em neblina.");
        Thread.sleep(3000);
        System.out.println("\nUma figura se destaca à frente: um velho sábio, sentado sobre uma pedra antiga.");
        Thread.sleep(3000);

        System.out.println("\n👤 Sábio: \"Ah... outro buscador da Rocha Suprema...\"");
        Thread.sleep(3000);
        System.out.println(
                "Sábio: \"Diga-me, viajante, você sabe ouvir a voz das rochas? Elas falam... mas poucos as escutam.\"");
        Thread.sleep(3500);
        System.out.println("Sábio: \"Se deseja continuar, terá que provar seu valor. Está preparado?\"");
        Thread.sleep(3000);

        System.out.println("\n⚔️ Você faz um aceno firme com a cabeça. Está na hora.");
        Thread.sleep(3000);
        System.out.println(
                "🌲 Após atravessar florestas densas, você encontra uma construção de pedra escondida: o Templo da Rocha Suprema!");
        Thread.sleep(3500);

        System.out.println(
                "\n🔥 A entrada está trancada. No centro do salão, um altar rodeado de rochas brilha sob um feixe de luz natural.");
        Thread.sleep(3500);
        System.out.println(
                "\n📜 Inscrição no altar: \"Aquele que deseja adentrar a tumba sagrada deverá reconhecer a essência de cada rocha.\"");
        Thread.sleep(3500);

        System.out.println("\n🧠 Você respira fundo. Hora de testar seus conhecimentos.");
        Thread.sleep(2500);

        int pontuacao = 0;

        for (Rochas r : rochas) {
            System.out.println("\n🔹 Rocha encontrada: " + r.getNome());
            Thread.sleep(2500);
            System.out.println("Qual é sua classificação?");
            System.out.println("1 - Ígnea\n2 - Sedimentar\n3 - Metamórfica");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            boolean correto = (r instanceof Magmaticas && escolha == 1) ||
                    (r instanceof Sedimentares && escolha == 2) ||
                    (r instanceof Metamorficas && escolha == 3);

            if (correto) {
                System.out.println("\n✅ Correto! " + r.getNome() + " revelou sua verdadeira natureza.");
                pontuacao++;
            } else {
                System.out.println("\n❌ Incorreto! " + r.getNome() + " guarda segredos que ainda não compreende.");
            }

            Thread.sleep(2500);
        }

        if (pontuacao >= 3) {
            System.out.println("\n🔓 Um estrondo ecoa pelo templo. As portas de pedra se abrem lentamente...");
            Thread.sleep(3500);
            System.out.println("No centro da sala sagrada, um pedestal com uma rocha pulsante de luz o aguarda.");
            Thread.sleep(3000);
            System.out.println("\n🌟 Você se aproxima. Ao tocá-la, uma onda de conhecimento invade sua mente.");
            Thread.sleep(3500);
            System.out
                    .println("\n👤 Sábio (voz distante): \"Agora você entende... A Rocha Suprema não é um objeto...\"");
            Thread.sleep(3000);
            System.out.println(
                    "👤 Sábio: \"...ela é o conhecimento que você conquistou com esforço, coragem e curiosidade.\"");
            Thread.sleep(3500);
            System.out.println(
                    "\n🎉 Parabéns, aventureiro! A verdadeira Rocha Suprema são os conhecimentos que você adquiriu pelo caminho!");
        } else {
            System.out.println(
                    "\n🚪 As portas permanecem seladas. O templo sussurra: \"Volte quando estiver mais preparado...\"");
            Thread.sleep(3000);
            System.out.println("\n📘 Dica: Visite a Biblioteca Real para estudar mais antes de tentar novamente.");
        }

    }

    public void bibliotecaReal() throws InterruptedException {
        System.out.println(
                "\n📚 Você adentra a majestosa Biblioteca Real, onde pergaminhos e livros centenários repousam sobre prateleiras douradas.");
        Thread.sleep(3000);
        System.out
                .println("Os sábios estudam atentamente mapas antigos, fórmulas geológicas e registros de expedições.");
        Thread.sleep(3000);
        System.out.println("\nAqui você pode aprender tudo sobre a formação das rochas e expandir sua sabedoria.");
        Thread.sleep(3000);

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
            Thread.sleep(3000);
            rocha.exibirConteudo();
            Thread.sleep(3000);
            magmaticas.exibirConteudo();
            Thread.sleep(3000);
            sedimentares.exibirConteudo();
            Thread.sleep(3000);
            metamorficas.exibirConteudo();
            Thread.sleep(3000);
            System.out
                    .println("\n✨ O conhecimento é seu maior tesouro! Agora você pode continuar explorando ou voltar.");
        } else if (escolha == 2) {
            System.out.println("\n🔍 Exemplos Práticos...");
            System.out.println(
                    "\n🔍 Exemplo: O granito e o basalto são rochas magmáticas, muito usadas na construção e em pisos.");
            Thread.sleep(3000);
            System.out.println(
                    "\n🌊 Rochas Sedimentares: Surgem a partir da compactação de sedimentos ao longo de milhões de anos.");
            Thread.sleep(3000);
            System.out.println(
                    "\n🔍 Exemplo: O calcário e o arenito são rochas sedimentares, encontradas em cavernas e utilizadas na produção de cimento.");
            Thread.sleep(3000);
            System.out.println(
                    "\n🔍 Exemplo: O mármore e o gnaisse são rochas metamórficas, usadas em esculturas e revestimentos sofisticados.");
            Thread.sleep(3000);
            System.out.println("\n✨ Agora que viu alguns exemplos, sua compreensão ficou ainda mais forte!");
            Thread.sleep(3000);
        } else if (escolha == 3) {
            System.out.println("\n🔙 Você sai da biblioteca e se prepara para sua jornada!");
            Thread.sleep(3000);
            SelecionarAtv();
        } else {
            System.out.println("\n⚠️ Escolha inválida! Tente novamente.");
        }

    }
}