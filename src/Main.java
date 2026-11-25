
public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("              QUIZ - MUNDOS DOS VIDEOGAMES");
        System.out.println("==================================================");
        System.out.println(" Aluno: Luis Gustavo");
        System.out.println(" Professor: Brenno Pimenta da Costa");
        System.out.println(" Tema: Mundos dos Videogames");
        System.out.println("==================================================");

        Questao[] questoes = new Questao[15];

        questoes[0] = new Questao();
        questoes[0].pergunta = "Qual criatura de Minecraft explode ao se aproximar do jogador?";
        questoes[0].opcaoA = "A) Enderman";
        questoes[0].opcaoB = "B) Zumbi";
        questoes[0].opcaoC = "C) Creeper";
        questoes[0].opcaoD = "D) Esqueleto";
        questoes[0].opcaoE = "E) Aranha";
        questoes[0].correta = "C";

        questoes[1] = new Questao();
        questoes[1].pergunta = "Qual e o nome do protagonista da franquia God of War?";
        questoes[1].opcaoA = "A) Atreus";
        questoes[1].opcaoB = "B) Kratos";
        questoes[1].opcaoC = "C) Baldur";
        questoes[1].opcaoD = "D) Thor";
        questoes[1].opcaoE = "E) Zeus";
        questoes[1].correta = "B";

        questoes[2] = new Questao();
        questoes[2].pergunta = "Qual Pokemon acompanha Ash Ketchum em suas aventuras?";
        questoes[2].opcaoA = "A) Charmander";
        questoes[2].opcaoB = "B) Bulbasaur";
        questoes[2].opcaoC = "C) Squirtle";
        questoes[2].opcaoD = "D) Pikachu";
        questoes[2].opcaoE = "E) Eevee";
        questoes[2].correta = "D";

        questoes[3] = new Questao();
        questoes[3].pergunta = "Qual empresa desenvolveu a franquia Grand Theft Auto (GTA)?";
        questoes[3].opcaoA = "A) Ubisoft";
        questoes[3].opcaoB = "B) Rockstar Games";
        questoes[3].opcaoC = "C) Electronic Arts";
        questoes[3].opcaoD = "D) Nintendo";
        questoes[3].opcaoE = "E) Capcom";
        questoes[3].correta = "B";

        questoes[4] = new Questao();
        questoes[4].pergunta = "Qual e o nome da cidade onde se passa Cyberpunk 2077?";
        questoes[4].opcaoA = "A) Neo Tokyo";
        questoes[4].opcaoB = "B) Night City";
        questoes[4].opcaoC = "C) Los Santos";
        questoes[4].opcaoD = "D) Raccoon City";
        questoes[4].opcaoE = "E) Vice City";
        questoes[4].correta = "B";

        questoes[5] = new Questao();
        questoes[5].pergunta = "Qual e o nome do reino principal de The Legend of Zelda: Breath of the Wild?";
        questoes[5].opcaoA = "A) Hyrule";
        questoes[5].opcaoB = "B) Midgard";
        questoes[5].opcaoC = "C) Asgard";
        questoes[5].opcaoD = "D) Lordran";
        questoes[5].opcaoE = "E) Tamriel";
        questoes[5].correta = "A";

        questoes[6] = new Questao();
        questoes[6].pergunta = "Quais sao os tres protagonistas de GTA V?";
        questoes[6].opcaoA = "A) CJ, Tommy e Niko";
        questoes[6].opcaoB = "B) Franklin, Michael e Trevor";
        questoes[6].opcaoC = "C) Arthur, John e Dutch";
        questoes[6].opcaoD = "D) Joel, Ellie e Tommy";
        questoes[6].opcaoE = "E) Leon, Chris e Ethan";
        questoes[6].correta = "B";

        questoes[7] = new Questao();
        questoes[7].pergunta = "Qual personagem Joel precisa proteger em The Last of Us?";
        questoes[7].opcaoA = "A) Sarah";
        questoes[7].opcaoB = "B) Tess";
        questoes[7].opcaoC = "C) Abby";
        questoes[7].opcaoD = "D) Ellie";
        questoes[7].opcaoE = "E) Marlene";
        questoes[7].correta = "D";

        questoes[8] = new Questao();
        questoes[8].pergunta = "Qual e o nome do reino presente no primeiro Dark Souls?";
        questoes[8].opcaoA = "A) Lordran";
        questoes[8].opcaoB = "B) Hyrule";
        questoes[8].opcaoC = "C) Night City";
        questoes[8].opcaoD = "D) Rapture";
        questoes[8].opcaoE = "E) Columbia";
        questoes[8].correta = "A";

        questoes[9] = new Questao();
        questoes[9].pergunta = "Quem e o protagonista de Red Dead Redemption 2?";
        questoes[9].opcaoA = "A) John Marston";
        questoes[9].opcaoB = "B) Dutch van der Linde";
        questoes[9].opcaoC = "C) Arthur Morgan";
        questoes[9].opcaoD = "D) Jack Marston";
        questoes[9].opcaoE = "E) Micah Bell";
        questoes[9].correta = "C";

        questoes[10] = new Questao();
        questoes[10].pergunta = "Quem e o principal antagonista de Far Cry 3?";
        questoes[10].opcaoA = "A) Pagan Min";
        questoes[10].opcaoB = "B) Joseph Seed";
        questoes[10].opcaoC = "C) Vaas Montenegro";
        questoes[10].opcaoD = "D) Hoyt Volker";
        questoes[10].opcaoE = "E) Anton Castillo";
        questoes[10].correta = "C";

        questoes[11] = new Questao();
        questoes[11].pergunta = "Qual e o nome do cavalo de Geralt na franquia The Witcher?";
        questoes[11].opcaoA = "A) Epona";
        questoes[11].opcaoB = "B) Roach (Carpeado)";
        questoes[11].opcaoC = "C) Agro";
        questoes[11].opcaoD = "D) Shadowmere";
        questoes[11].opcaoE = "E) Sardinilla";
        questoes[11].correta = "B";

        questoes[12] = new Questao();
        questoes[12].pergunta = "Qual e a organizacao inimiga em Resident Evil 4?";
        questoes[12].opcaoA = "A) Umbrella";
        questoes[12].opcaoB = "B) Tricell";
        questoes[12].opcaoC = "C) Los Illuminados";
        questoes[12].opcaoD = "D) BSAA";
        questoes[12].opcaoE = "E) Blue Umbrella";
        questoes[12].correta = "C";

        questoes[13] = new Questao();
        questoes[13].pergunta = "Quem e o protagonista de Metal Gear Rising: Revengeance?";
        questoes[13].opcaoA = "A) Solid Snake";
        questoes[13].opcaoB = "B) Big Boss";
        questoes[13].opcaoC = "C) Raiden";
        questoes[13].opcaoD = "D) Gray Fox";
        questoes[13].opcaoE = "E) Revolver Ocelot";
        questoes[13].correta = "C";

        questoes[14] = new Questao();
        questoes[14].pergunta = "Qual personalidade esta armazenada no biochip de V em Cyberpunk 2077?";
        questoes[14].opcaoA = "A) Jackie Welles";
        questoes[14].opcaoB = "B) Adam Smasher";
        questoes[14].opcaoC = "C) Goro Takemura";
        questoes[14].opcaoD = "D) Johnny Silverhand";
        questoes[14].opcaoE = "E) Viktor Vektor";
        questoes[14].correta = "D";

        int acertos = 0;

        for (int i = 0; i < questoes.length; i++) {
            System.out.println("\nQuestao " + (i + 1) + ":");
            questoes[i].escrevaQuestao();

            String resposta = questoes[i].leiaResposta();

            if (questoes[i].isCorreta(resposta)) {
                acertos++;
            }
        }

        double media = ((double) acertos / questoes.length) * 100;

        System.out.println("\n==================================================");
        System.out.println("                  RESULTADO FINAL");
        System.out.println("==================================================");
        System.out.println("Total de questoes: " + questoes.length);
        System.out.println("Questoes acertadas: " + acertos);
        System.out.printf("Media de acertos: %.2f%%\n", media);
        System.out.println("==================================================");
        System.out.println("Obrigado por participar do Quiz!");
        System.out.println("==================================================");
    }
}
