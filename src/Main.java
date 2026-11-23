
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Exibe o cabeçalho
        cabecalho.exibir();

        // Lista que armazenará as questões
        List<Questao> questoes = new ArrayList<>();

        // QUESTÃO 1
        adicionarQuestao(questoes,
                "1. No Minecraft, qual criatura é conhecida por explodir quando se aproxima do jogador?",
                "A) Zumbi",
                "B) Enderman",
                "C) Creeper",
                "D) Esqueleto",
                "E) Aranha",
                "C");

        // QUESTÃO 2
        adicionarQuestao(questoes,
                "2. Qual é o nome do protagonista principal da franquia God of War?",
                "A) Thor",
                "B) Kratos",
                "C) Atreus",
                "D) Zeus",
                "E) Ares",
                "B");

        // QUESTÃO 3
        adicionarQuestao(questoes,
                "3. Em Pokémon, qual é o Pokémon mais conhecido por ser o companheiro de Ash?",
                "A) Charmander",
                "B) Bulbasaur",
                "C) Squirtle",
                "D) Pikachu",
                "E) Eevee",
                "D");

        // QUESTÃO 4
        adicionarQuestao(questoes,
                "4. Qual empresa desenvolveu a franquia Grand Theft Auto (GTA)?",
                "A) Ubisoft",
                "B) Rockstar Games",
                "C) Electronic Arts",
                "D) Nintendo",
                "E) Capcom",
                "B");

        // QUESTÃO 5
        adicionarQuestao(questoes,
                "5. Qual é o nome da cidade onde se passa a maior parte da história de Cyberpunk 2077?",
                "A) Neo Tokyo",
                "B) Night City",
                "C) Los Santos",
                "D) Raccoon City",
                "E) Vice City",
                "B");

        // QUESTÃO 6
        adicionarQuestao(questoes,
                "6. Em The Legend of Zelda: Breath of the Wild, qual é o nome do reino onde a história acontece?",
                "A) Midgard",
                "B) Hyrule",
                "C) Tamriel",
                "D) Azeroth",
                "E) Lordran",
                "B");

        // QUESTÃO 7
        adicionarQuestao(questoes,
                "7. Em GTA V, quais são os nomes dos três protagonistas jogáveis?",
                "A) Tommy, CJ e Niko",
                "B) Franklin, Michael e Trevor",
                "C) Arthur, John e Dutch",
                "D) Carl, Ryder e Big Smoke",
                "E) Luis, Roman e Johnny",
                "B");

        // QUESTÃO 8
        adicionarQuestao(questoes,
                "8. Em The Last of Us, qual é o nome da personagem que Joel precisa proteger durante sua jornada?",
                "A) Sarah",
                "B) Tess",
                "C) Abby",
                "D) Ellie",
                "E) Riley",
                "D");

        // QUESTÃO 9
        adicionarQuestao(questoes,
                "9. Na franquia Dark Souls, qual é o nome do reino principal do primeiro jogo?",
                "A) Lordran",
                "B) Drangleic",
                "C) Lothric",
                "D) Boletaria",
                "E) Yharnam",
                "A");

        // QUESTÃO 10
        adicionarQuestao(questoes,
                "10. Em Red Dead Redemption 2, qual é o nome do protagonista principal?",
                "A) John Marston",
                "B) Dutch van der Linde",
                "C) Arthur Morgan",
                "D) Micah Bell",
                "E) Hosea Matthews",
                "C");

        // QUESTÃO 11
        adicionarQuestao(questoes,
                "11. Em Far Cry 3, qual é o nome do principal antagonista da história?",
                "A) Pagan Min",
                "B) Joseph Seed",
                "C) Vaas Montenegro",
                "D) Hoyt Volker",
                "E) Anton Castillo",
                "C");

        // QUESTÃO 12
        adicionarQuestao(questoes,
                "12. Na franquia The Witcher, qual é o nome do cavalo de Geralt?",
                "A) Shadowmere",
                "B) Roach (Carpeado)",
                "C) Epona",
                "D) Agro",
                "E) Torrent",
                "B");

        // QUESTÃO 13
        adicionarQuestao(questoes,
                "13. Em Resident Evil 4, qual é o nome da organização responsável por sequestrar Ashley Graham?",
                "A) Umbrella Corporation",
                "B) Tricell",
                "C) Los Illuminados",
                "D) Blue Umbrella",
                "E) S.T.A.R.S.",
                "C");

        // QUESTÃO 14
        adicionarQuestao(questoes,
                "14. Qual é o nome do protagonista de Metal Gear Rising: Revengeance?",
                "A) Solid Snake",
                "B) Big Boss",
                "C) Raiden",
                "D) Gray Fox",
                "E) Revolver Ocelot",
                "C");

        // QUESTÃO 15
        adicionarQuestao(questoes,
                "15. Em Cyberpunk 2077, qual personagem tem suas memórias e personalidade compartilhadas com V através de um biochip?",
                "A) Jackie Welles",
                "B) Adam Smasher",
                "C) Goro Takemura",
                "D) Johnny Silverhand",
                "E) Viktor Vektor",
                "D");

        // Início do questionário
        System.out.println("========================================");
        System.out.println("           INICIO DO QUIZ");
        System.out.println("========================================");
        System.out.println();

        int acertos = 0;

        // Percorre todas as questões
        for (Questao q : questoes) {

            q.escrevaQuestao();

            String resposta = q.leiaResposta();

            if (q.isCorreta(resposta)) {
                acertos++;
            }

        }

        // Cálculo da média de acertos
        double media = (acertos * 100.0) / questoes.size();

        // Resultado final
        System.out.println("========================================");
        System.out.println("             RESULTADO FINAL");
        System.out.println("========================================");

        System.out.println("Total de questões: " + questoes.size());
        System.out.println("Questões acertadas: " + acertos);
        System.out.printf("Média de acertos: %.2f%%%n", media);

        System.out.println();
        System.out.println("Obrigado por participar do nosso QUIZ!");
        System.out.println("========================================");

    }

    // Método responsável por criar e adicionar questões à lista
    public static void adicionarQuestao(
            List<Questao> lista,
            String pergunta,
            String opcaoA,
            String opcaoB,
            String opcaoC,
            String opcaoD,
            String opcaoE,
            String correta) {

        Questao q = new Questao();

        q.pergunta = pergunta;
        q.opcaoA = opcaoA;
        q.opcaoB = opcaoB;
        q.opcaoC = opcaoC;
        q.opcaoD = opcaoD;
        q.opcaoE = opcaoE;
        q.correta = correta;

        lista.add(q);
    }
}
