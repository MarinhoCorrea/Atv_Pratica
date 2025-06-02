package modules.Portugues;

import java.util.Scanner;

public class QuizPortugues {
    private Scanner scanner = new Scanner(System.in);

    public void SelecionarAtv() {
        System.out.println(
                "\nOlá, Viajante ! Meu nome é S.A.M.I.R.A., serei seu ajudante nessa jornada! Nós te escolhemos para uma Grande Missão!\nPrecisamos que você viaje pela linha do tempo e junte para nós os fragmentos mágicos de cada Era Literaria para que consigamos montar a Apostila Suprema!\n");
        System.out.println("Aceita a missão? Sim (1) /Não (0)");
        int resposta = scanner.nextInt();
        scanner.nextLine();
        switch (resposta) {
            case 1:
                try {
                    jornadaApostilaSagrada();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case 0:
                System.out.println(
                        "Que pena, viajante! Você perdeu a oportunidade de se tornar um grande sábio. Mas não se preocupe, sempre haverá novas aventuras esperando por você. Até a próxima!");
                break;

            default:
                System.out.println(
                        "Como planeja ajudar a reconstruir a APOSTILA SAGRADA sem seguir regras básicas da leitura e entendimento? Opção Inválida");
                SelecionarAtv();

        }
    }

    public void jornadaApostilaSagrada() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Trovadorismo trovadorismo = new Trovadorismo("Trovadorismo", "Século XII a XV", "Dom Dinis");

        System.out.println(
                "Ótimo, nossa primeira parada será o século XII! Iremos explorar o movimento conhecido como TROVADORISMO!");
        Thread.sleep(1500);

        System.out
                .println("\nS.A.M.I.R.A.: Estamos em uma vila medieval. Veja, um trovador se aproxima com sua viola!");
        Thread.sleep(1500);

        System.out.println(
                "Trovador: \"Senhora, por vós suspiro com grande paixão... / Neste mundo, só vós dais luz ao meu coração.\"");
        Thread.sleep(2000);

        System.out.println("\nS.A.M.I.R.A.: Vamos entender melhor esse período:");
        trovadorismo.exibirConteudo();
        System.out.println("Autor marcante: " + trovadorismo.getAutorPrincipal() + ", que além de rei, era poeta!");
        Thread.sleep(2500);

        // PERGUNTA 1
        System.out.println(
                "\nMissão: O trovador esqueceu o nome de uma das cantigas principais da época. Você pode ajudá-lo?");
        String resposta;
        do {
            System.out.println("a) Cantiga de Escárnio");
            System.out.println("b) Cantiga de Amigo");
            System.out.println("c) Cantiga de Guerra");
            System.out.println("d) Cantiga de Liberdade");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("b")) {
                System.out.println("Trovador: Sim! A cantiga de amigo! Como pude esquecer?");
            } else {
                System.out.println("Trovador: Hmm... acho que não é essa.");
            }
        } while (!resposta.equals("b"));
        Thread.sleep(1500);

        // PERGUNTA 2
        System.out.println(
                "\nS.A.M.I.R.A.: Muito bem! Agora, outra questão: qual era a principal característica das cantigas de amor?");
        do {
            System.out.println("a) Amor platônico e sofrimento do eu-lírico");
            System.out.println("b) Críticas políticas e sociais");
            System.out.println("c) Humor escrachado e zombaria");
            System.out.println("d) Narrativas sobre batalhas religiosas");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("a")) {
                System.out.println("S.A.M.I.R.A.: Exatamente! O amor era idealizado, muitas vezes não correspondido.");
            } else {
                System.out.println("S.A.M.I.R.A.: Essa não é a principal característica. Tente novamente.");
            }
        } while (!resposta.equals("a"));

        Thread.sleep(1500);

        System.out.println(
                "\nTrovador: Com sua ajuda, minha arte está salva! Que a poesia continue encantando os corações!");
        System.out.println(
                "S.A.M.I.R.A.: Ótimo! Ao ajudar o trovador consgeuimos um fragmento! Vamos seguir nossa jornada para a próxima escola literária...");
        System.out.println("\nS.A.M.I.R.A.: Excelente! Agora vamos para o século XIX... bem-vindo ao Romantismo!");
        Thread.sleep(2000);

        System.out.println(
                "\nVocê aparece em uma colina, vendo um jovem melancólico olhando o pôr do sol, segurando um livro.");
        System.out
                .println("Rapaz Romântico: \"Ah, meu amor perdido! Minha alma vagueia pelas memórias de Cecília...\"");
        Thread.sleep(2000);

        System.out.println(
                "\nS.A.M.I.R.A.: O Romantismo exaltava a emoção, a natureza e os sentimentos idealizados. Era comum a presença de amores impossíveis e figuras sonhadoras.");
        System.out.println("Autor marcante: Álvares de Azevedo, com sua melancolia característica.");
        Thread.sleep(2500);

        System.out.println("\nMissão 1: Que característica principal define o Romantismo?");
        do {
            System.out.println("a) Racionalidade extrema");
            System.out.println("b) Crítica social realista");
            System.out.println("c) Idealização amorosa e emocional");
            System.out.println("d) Humor e sátira política");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("c")) {
                System.out.println("Rapaz Romântico: Exato! A emoção é o que nos move!");
            } else {
                System.out.println("Rapaz Romântico: Isso não me parece muito romântico...");
            }
        } while (!resposta.equals("c"));

        Thread.sleep(1500);

        System.out.println("\nMissão 2: Qual desses autores também pertence ao Romantismo brasileiro?");
        do {
            System.out.println("a) Gregório de Matos");
            System.out.println("b) Álvares de Azevedo");
            System.out.println("c) Machado de Assis");
            System.out.println("d) Carlos Drummond de Andrade");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("b")) {
                System.out.println("Rapaz Romântico: Sim! Minha alma se inspira nele!");
            } else {
                System.out.println("Rapaz Romântico: Hmm... esse não parece do meu tempo.");
            }
        } while (!resposta.equals("b"));

        Thread.sleep(1500);

        System.out.println(
                "\nS.A.M.I.R.A.: Boa! Mais um fragmento! Agora, vamos para a próxima e última parada: o Realismo!");
        Thread.sleep(2000);

        System.out.println(
                "\nVocê acorda em um escritório antigo, com livros e papéis sobre a mesa. Um homem sério escreve em silêncio.");
        System.out.println("Homem: \"A realidade precisa ser exposta. Não há espaço para ilusão nos olhos da razão.\"");
        Thread.sleep(2000);

        System.out.println(
                "\nS.A.M.I.R.A.: Bem-vindo ao Realismo! Aqui, os autores abandonaram a idealização romântica e passaram a retratar os fatos com objetividade, focando em problemas sociais e psicológicos.");
        System.out.println(
                "Autor marcante: Machado de Assis, com obras como 'Dom Casmurro' e 'Memórias Póstumas de Brás Cubas'.");
        Thread.sleep(2500);

        System.out.println(
                "\nMissão 1: O escritor está com dúvidas sobre qual obra realista retrata bem o comportamento humano. Qual é a correta?");
        do {
            System.out.println("a) O Guarani");
            System.out.println("b) Senhora");
            System.out.println("c) Memórias Póstumas de Brás Cubas");
            System.out.println("d) Lira dos Vinte Anos");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("c")) {
                System.out.println("Escritor: Exatamente! Brás Cubas analisa o ser humano de forma fria e irônica.");
            } else {
                System.out.println("Escritor: Não... essa parece idealizada demais.");
            }
        } while (!resposta.equals("c"));

        Thread.sleep(1500);

        System.out.println("\nMissão 2: O Realismo se opõe diretamente a qual movimento literário anterior?");
        do {
            System.out.println("a) Modernismo");
            System.out.println("b) Arcadismo");
            System.out.println("c) Romantismo");
            System.out.println("d) Trovadorismo");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("c")) {
                System.out.println("Escritor: Perfeito. A razão substitui a emoção exagerada do Romantismo.");
            } else {
                System.out.println("Escritor: Não exatamente... pense em algo mais emocional.");
            }
        } while (!resposta.equals("c"));

        Thread.sleep(2000);

        System.out.println(
                "\nS.A.M.I.R.A.: Parabéns! Você completou a missão com sucesso e reuniu os fragmentos das três eras literárias!");
        System.out.println("A Apostila Suprema agora pode ser reconstruída!\n");

        Thread.sleep(2000);
        System.out.println(
                "\nS.A.M.I.R.A.: A Apostila Suprema brilha em suas mãos, reunindo os conhecimentos que você conquistou com coragem, inteligência e sensibilidade.");
        Thread.sleep(2500);

        System.out.println(
                "\nUm portal dourado se abre diante de você, iluminando o caminho de volta para sua realidade.");
        System.out.println(
                "S.A.M.I.R.A.: \"Mas lembre-se, viajante... o verdadeiro poder não está nos livros, e sim em como você os vive.\"");
        Thread.sleep(3000);

        System.out.println(
                "\nCom um último olhar para os personagens que encontrou — o trovador apaixonado, o jovem romântico, o autor realista — você atravessa o portal.");
        Thread.sleep(2500);

        System.out.println("\nAo retornar, tudo parece igual... mas algo mudou dentro de você.");
        System.out.println(
                "Você agora carrega em si as vozes do passado, prontos para guiá-lo nos desafios do presente.");
        Thread.sleep(3000);
        scanner.close();
    }
}
