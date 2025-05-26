package modules.Historia;

import java.util.Scanner;

public class QuizHistoria {
    private Scanner scanner = new Scanner(System.in);
    public PreColonia preColonia = new PreColonia();
    public Colonial Colonial = new Colonial();
    public String resposta;

    public void SelecionarAtv() {
        System.out.println(
                "\nOlá, Historiador ! Nós te escolhemos para uma Grande Missão!\nA AIH (Agência Intergalática Historiadora) percebeu várias falhas no passado da história do Brasil e que precisa ser resolvido\n");
        System.out.println(
                "Seu papel será saltar pelas Eras do Brasil e ir auxiliando as figuras que estiverem com dificuldade.\n");
        System.out.println("Aceita a missão? Sim (1) /Não (0)");
        int resposta = scanner.nextInt();
        switch (resposta) {
            case 1:

                break;

            case 0:
                System.out.println(
                        "Que pena, Historiador! Você perdeu a oportunidade de se tornar uma lenda viva dentro da Agencia...\n");
                break;
            default:
                System.out.println("Resposta inválida. Por favor, digite 1 para Sim ou 0 para Não.");
                SelecionarAtv();
                break;
        }
    }

    public void Dinamica() throws InterruptedException {
        System.out.println(
                "\nMuito bem! Agora pegue esse traje que já vamos te mandar para a Primeira Era : BRASIL PRÉ-COLÔNIA  \n");
        System.out.println("Vestindo o traje...\n");
        Thread.sleep(2000);
        System.out.println("Entrando na Maquina do tempo\n");
        Thread.sleep(2000);
        // PRÉ-COLÔNIA
        System.out.println("Você chegou na Era do Brasil Pré-Colônia!\n");
        System.out.println(
                "Aqui, você encontrará o Paje Solagasta , durante uma caça, ele bateu a cabeça e esqueceu alguns aspectos da sua cultura \n");
        System.out.println(
                "Você terá que ajudar o Paje Solagasta a lembrar de sua cultura, respondendo as perguntas dele corretamnente\n");
        System.out.println("Se você errar, ele ficará triste e não conseguirá continuar sua jornada.\n");
        System.out.println("Vamos começar!\n");
        Thread.sleep(2000);
        System.out.println(
                "Você se aproxima do Paje Solagasta e ele te cumprimenta: Olá, viajante! Eu sou o Paje Solagasta, líder espiritual da tribo. Estou com dificuldades para lembrar de alguns aspectos da nossa cultura. Você poderia me ajudar?\n");
        System.out
                .println("Você responde: Claro, Paje Solagasta! Estou aqui para ajudar. Quais são as suas dúvidas?\n");
        Thread.sleep(2000);
        System.out.println(
                "Paje Solagasta: Eu gostaria de saber mais sobre a nossa relação entre comunidade. Você poderia me contar sobre isso?");
        System.out.println("Você responde: Claro! ");

        do {
            System.out
                    .println("Como era organizada a sociedade da maioria dos povos indígenas no Brasil Pré-Colonial?");
            System.out.println("a) Monarquias centralizadas com exército permanente");
            System.out.println("b) Tribos com estruturas coletivas e lideranças locais");
            System.out.println("c) Cidades-estados governadas por sacerdotes");
            System.out.println("d) Sistemas feudais com senhores e servos");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();
            if (resposta.equals("b")) {
                System.out.println("Resposta correta!" + preColonia.conteudoOrganizacaoTribal());
                Thread.sleep(2000);
                System.out.println("Paje Solagasta: Nossa, verdade! Estou começando a lembrar!");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Paje Solagasta:Nâo sei... Isso não está me parecendo muito correto...");
                return;
            }
        } while (!resposta.equals("b"));
        System.out.println("Vocês saem andando pela floresta e veêm as pessoas fazendo várias atividades ");
        System.out.println(
                "Paje Solagasta:Vendo o meu povo trabalhando desse jeito eu estou com uma dúvida, como nós nos sustentamos?");
        System.out.println(
                "Qual era a principal atividade econômica dos povos indígenas brasileiros antes da chegada dos portugueses?");
        do {
            System.out.println("a) Extração de petróleo");
            System.out.println("b) Comércio marítimo");
            System.out.println("c) Agricultura de subsistência, caça e pesca");
            System.out.println("d) Mineração de ouro");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("c")) {
                System.out.println(
                        "Resposta correta!" + preColonia.conteudoEconomia());
                Thread.sleep(2000);
                System.out.println(
                        "Paje Solagasta: Isso mesmo! Agora estou lembrando como vivíamos!");
            } else {
                System.out
                        .println("Resposta incorreta.");
                System.out.println("Paje Solagasta: Hmm... Isso não parece certo...\n");
                return;
            }
        } while (!resposta.equals("c"));
        System.out.println("O Pajé olha para si mesmo e percebe vários deselhos em seu corpo, ele então pergunta: ");
        System.out.println(
                "Paje Solagasta: Eu percebo que estou com desenhos pelo meu corpo, do que é feita essa tinta?");
        System.out.println(
                "Qual substância era tradicionalmente usada pelos povos indígenas do Brasil para fazer pintura corporal?");
        do {
            System.out.println("a) Tinta de carvão industrial");
            System.out.println("b) Argila sintética");
            System.out.println("c) Corantes naturais como urucum e jenipapo");
            System.out.println("d) Corante vermelho importado da Europa");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();
            if (resposta.equals("c")) {
                System.out.println("Resposta correta!" + preColonia.PinturaCorporal());
                Thread.sleep(2000);
                System.out.println(
                        "Paje Solagasta: Isso mesmo! Agora me lembro das cores vibrantes que usamos em nossos rituais!");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Paje Solagasta: Hmm... Isso não parece certo.");
                return;
            }
        } while (!resposta.equals("c"));
        System.out.println("Paje Solagasta: Agora lembrei de tudo! Muito Obrigado meu amigo!");
        System.out.println("Você se despede do Paje Solagasta e volta para a máquina do tempo.\n");
        // PRÉ-COLÔNIA FIM
        System.out.println("Você completou a missão com sucesso! Parabéns, Historiador!\n");
        System.out.println("Não temos tempo a perder, vamos para a próxima Era!\n");
        // COLONIA
        System.out.println("Você chegou à Era do Brasil Colônia!\n");
        System.out.println("Você vê navios atracando e ouve o barulho dos engenhos ao longe...\n");
        System.out.println("Um senhor de engenho chamado Dom Valentim se aproxima aflito. Ele perdeu memórias importantes sobre o funcionamento da colônia.\n");
        System.out.println("Você terá que ajudá-lo a lembrar fatos importantes desse período.\n");
        System.out.println("Vamos começar!\n");
        Thread.sleep(2000);
        System.out.println(
                "Dom Valentim: Olá, Amigo! Preciso muito da sua ajuda... as coisas aqui não fazem mais sentido para mim.\n");
        System.out
                .println("Você responde: Fique tranquilo, Dom Valentim. Estou aqui para ajudar. O que deseja saber?\n");
        Thread.sleep(2000);

        System.out.println(
                "Dom Valentim: Me lembro vagamente que havia um produto muito importante aqui. Qual era mesmo o principal produto de exportação dessa época?");
        do {
            System.out.println("a) Café");
            System.out.println("b) Pau-brasil");
            System.out.println("c) Ouro");
            System.out.println("d) Açúcar");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("d")) {
                System.out.println("Resposta correta!" + Colonial.produtoExportacao());
                Thread.sleep(2000);
                System.out.println("Dom Valentim: Claro! O açúcar dos engenhos, como pude esquecer?");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Dom Valentim: Hmm... não me soa familiar...");
                return;
            }
        } while (!resposta.equals("d"));

        System.out.println(
                "Enquanto vocês caminham pelos arredores do engenho, Dom Valentim olha para os trabalhadores e pergunta:\n");
        System.out.println("Dom Valentim: E quanto à mão de obra... quem era forçado a trabalhar nos engenhos?");
        do {
            System.out.println("a) Trabalhadores assalariados europeus");
            System.out.println("b) Escravos africanos trazidos à força");
            System.out.println("c) Índios aliados voluntários");
            System.out.println("d) Comerciantes holandeses");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("b")) {
                System.out.println("Resposta correta!" + Colonial.maoDeObra());
                Thread.sleep(2000);
                System.out.println(
                        "Dom Valentim: Sim, infelizmente... A escravidão é uma marca terrível da atualidade.");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Dom Valentim: Não... acho que não era assim.");
                return;
            }
        } while (!resposta.equals("b"));

        System.out.println(
                "Dom Valentim caminha até a varanda e contempla os canhões de defesa da vila, então questiona:\n");
        System.out.println(
                "Dom Valentim: Tivemos que nos defender de vários inimigos... qual desses países tentou invadir e ocupar partes do Brasil durante o período colonial?");
        do {
            System.out.println("a) Itália");
            System.out.println("b) China");
            System.out.println("c) Holanda");
            System.out.println("d) Alemanha");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("c")) {
                System.out.println("Resposta correta!" + Colonial.invasoesEstrangeiras());
                Thread.sleep(2000);
                System.out.println(
                        "Dom Valentim: Isso mesmo! Os holandeses invadiram o Nordeste, como pude esquecer de Maurício de Nassau?");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Dom Valentim: Não... acho que essa resposta está esquisita.");
                return;
            }
        } while (!resposta.equals("c"));

        System.out.println("Dom Valentim: Agora me lembro de tudo! Obrigado, viajante, por restaurar minha memória! Deixe eu te servir um café antes de você partir.");
        System.out.println("Você aceita o café e aproveita para conversar mais um pouco com Dom Valentim.\n");
        Thread.sleep(2000);
        System.out.println("Você se despede de Dom Valentim e se prepara para o próximo salto temporal...\n");
    }

}
