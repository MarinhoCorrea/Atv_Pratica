package modules.Historia;

import java.util.Scanner;

public class QuizHistoria {
    private Scanner scanner = new Scanner(System.in);
    public PreColonia preColonia = new PreColonia();
    public Colonial Colonial = new Colonial();
    public Imperial Imperial = new Imperial();
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
        //FIM BRASIL COLONIA
        System.out.println("Você foi expetacular! Agora entendi o motivo da AIH ter te contratado\n");
        System.out.println("Acho que não vou ficar te elogiando tanto... PROXIMA PARADA : BRASIL iMPÉRIO");
        //BRASIL IMPÉRIO
        System.out.println("Você chegou à Era do Brasil Império!\n");
        System.out.println("Luzes douradas brilham ao seu redor, e você se encontra no interior de um palácio do século XIX...\n");
        System.out.println("Um homem de barba longa e vestes elegantes se aproxima. É Dom Pedro II!\n");
        System.out.println("Dom Pedro II: Saudações, viajante. Tenho refletido sobre o passado de minha nação, mas certas memórias me escapam.\n");
        System.out.println("Você responde: Majestade, estou aqui para ajudá-lo a recordar.\n");
        Thread.sleep(2000);

        System.out.println("Dom Pedro II: Diga-me... lembro que assumi o trono muito jovem. Com quantos anos fui coroado imperador?");
        do {
            System.out.println("a) 10 anos");
            System.out.println("b) 14 anos");
            System.out.println("c) 20 anos");
            System.out.println("d) 18 anos");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("b")) {
                System.out.println("Resposta correta!" + Imperial.idadeCoroacao());
                Thread.sleep(2000);
                System.out.println("Dom Pedro II: Isso mesmo! Tive que assumir grandes responsabilidades ainda muito jovem...");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Dom Pedro II: Não creio que seja essa a idade...");
                return;
            }
        } while (!resposta.equals("b"));

        System.out.println("Dom Pedro II caminha até uma enorme biblioteca repleta de livros e comenta:\n");
        System.out.println("Dom Pedro II: Sempre valorizei a educação e a cultura... mas o Brasil enfrentou desafios. Qual foi a principal guerra durante o meu governo?");
        do {
            System.out.println("a) Guerra da Cisplatina");
            System.out.println("b) Guerra de Canudos");
            System.out.println("c) Guerra do Paraguai");
            System.out.println("d) Revolução Praieira");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("c")) {
                System.out.println("Resposta correta!" + Imperial.guerraParaguai());
                Thread.sleep(2000);
                System.out.println("Dom Pedro II: Exatamente! Foi um conflito longo e sangrento... que deixou marcas profundas.");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Dom Pedro II: Não... esse não foi o maior conflito do meu reinado.");
                return;
            }
        } while (!resposta.equals("c"));

        System.out.println("Dom Pedro II caminha até uma janela e observa crianças brincando:\n");
        System.out.println("Dom Pedro II: Havia um movimento forte na sociedade... algo que mudaria o Brasil profundamente.");
        System.out.println("Dom Pedro II: Qual foi a lei assinada no final do Império que marcou a abolição da escravidão?");
        do {
            System.out.println("a) Lei Eusébio de Queirós");
            System.out.println("b) Lei do Ventre Livre");
            System.out.println("c) Lei Áurea");
            System.out.println("d) Lei de Terras");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("c")) {
                System.out.println("Resposta correta!" + Imperial.leiAurea());
                Thread.sleep(2000);
                System.out.println("Dom Pedro II: Sim... a princesa Isabel assinou essa lei com meu total apoio. Um passo fundamental para a justiça.");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Dom Pedro II: Essa lei foi importante, mas não foi a que aboliu a escravidão.");
                return;
            }
        } while (!resposta.equals("c"));

        System.out.println("Dom Pedro II: Agora sim, minhas memórias retornam. Você foi essencial, rapaz.");
        System.out.println("Dom Pedro II te leva por um passeio pelo Palácio Imperial e conta as suas histórias da época de menino.");
        Thread.sleep(2000);
        System.out.println("Por fim , Dom Pedro II o conduz até os portões do palácio, e você retorna à máquina do tempo para sua próxima missão...\n");
        // FIM BRASIL IMPERIAL
        System.out.println("Já esta quase sendo promovido para chefe , hein !? Estamos quase no fim...\n");
        System.out.println("Seu desempenho até aqui foi extraordinario, espero que tire de letra a sua ... ÚLTIMA PARADA : BRASIL REPÚBLICA");
        // BRASIL REPÚBLICA
                System.out.println("Você chega à última parada da máquina do tempo: A ERA DA REPÚBLICA!\n");
        System.out.println("Tudo está em ruínas... jornais queimados, rádios silenciosos, multidões nas ruas com cartazes apagados.\n");
        System.out.println("Uma figura se forma no meio da fumaça... é o próprio **Getúlio Vargas**, surgindo como um eco poderoso da história.\n");
        System.out.println("Voz de Vargas: Eu sou a voz do trabalhismo, da força do Estado... e também das sombras da repressão. Se deseja concluir sua jornada, prove que compreende o meu legado.\n");
        System.out.println("Você responde: Estou pronto, Getúlio. Vamos relembrar a verdade.\n");
        Thread.sleep(2000);

        System.out.println("Getúlio Vargas: Comecemos... Em qual período histórico se iniciou meu governo autoritário, conhecido como Estado Novo?");
        do {
            System.out.println("a) 1922");
            System.out.println("b) 1937");
            System.out.println("c) 1945");
            System.out.println("d) 1954");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("b")) {
                System.out.println("Correto." + republica.estadoNovo());
                Thread.sleep(2000);
                System.out.println("Vargas: Sim... 1937. Assumi poderes totais... mas para manter a ordem, dizia eu.");
            } else {
                System.out.println("Errado.");
                System.out.println("Vargas: Não deturpe os fatos. Você falhou.");
                return;
            }
        } while (!resposta.equals("b"));

        System.out.println("Vargas caminha lentamente pelo cenário destruído e ergue um velho microfone de rádio:");
        System.out.println("Vargas: E agora... qual era o conteúdo principal da Consolidação das Leis do Trabalho (CLT), criada por mim em 1943?");
        do {
            System.out.println("a) A revogação de todos os direitos dos sindicatos");
            System.out.println("b) A liberação do trabalho infantil e feminino");
            System.out.println("c) A regulamentação de direitos trabalhistas como férias, jornada de trabalho e salário mínimo");
            System.out.println("d) A implementação do voto censitário");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("c")) {
                System.out.println("Resposta correta!" + republica.clt());
                Thread.sleep(2000);
                System.out.println("Vargas: A CLT foi meu maior legado aos trabalhadores... embora alguns digam que foi para controlar os sindicatos.");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Vargas: Falso. Você não conhece minha história.");
                return;
            }
        } while (!resposta.equals("c"));

        System.out.println("Vargas se aproxima, agora mais sombrio. Sua voz ecoa no ambiente:");
        System.out.println("Vargas: Última pergunta. Minha morte, em 1954, foi um momento marcante. O que motivou meu suicídio, segundo meu próprio testamento?");
        do {
            System.out.println("a) Um golpe militar iminente e intensa pressão política");
            System.out.println("b) Uma grave doença incurável");
            System.out.println("c) Desgosto pela derrota nas eleições");
            System.out.println("d) Traição de aliados dentro do governo");
            System.out.print("Digite a letra correspondente à sua resposta: ");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("a")) {
                System.out.println("Resposta correta!" + republica.suicidioVargas());
                Thread.sleep(2000);
                System.out.println("Vargas: Eu saí da vida para entrar na história... e você entendeu o motivo.");
            } else {
                System.out.println("Resposta incorreta.");
                System.out.println("Vargas: Não... você não compreendeu minha dor. Aqui termina sua jornada.");
                return;
            }
        } while (!resposta.equals("a"));

        System.out.println("Vargas desaparece lentamente na névoa... O cenário se ilumina e as ruínas se restauram.");
        System.out.println("Você completou a jornada histórica com sabedoria e coragem.");
        System.out.println("A máquina do tempo se ativa pela última vez, levando você de volta ao presente...\n");
        System.out.println("✨ PARABÉNS! Você finalizou o Quiz da História do Brasil! ✨");

    }

    

}
