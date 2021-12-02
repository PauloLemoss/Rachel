package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String escolha;
        int senha = 123;
        int n;
        int tartaruga = 0;


        Personagem[] t = new Personagem[6]; // Declaração de Array dos personagens elas herdam os atributos da classe pai

        // declarando os personagens
        t[0] = new Personagem("Leonardo", 120, "Espadas");
        t[1] = new Personagem("Raphael", 120, "Sai");
        t[2] = new Personagem("Donatello", 120, "Bastao");
        t[3] = new Personagem("Michelangello", 120, "Nunchaku");
        t[4] = new Personagem("Cabeca-de-Couro", 100, "Mordida");
        t[5] = new Personagem("Karai", 100, "Espadas");
        

        int cc = 0;
        while (cc < 1) { // laço de repetição

            System.out.println("\n_____________________________________\n");
            System.out.println("Digite: ''START'' para comecar o jogo:");

            escolha = scan.nextLine();

            if (escolha.equalsIgnoreCase("START")) {



                cc++;

                while (cc < 2) {

                    System.out.println("\n____________________________________________________________\n");
                    System.out.println("ESCOLHA UM PERSONAGEM:");
                    System.out.println(" ");
                    System.out.println("_______________________");
                    System.out.println("1- Leonardo            |");
                    System.out.println("                       |");
                    System.out.println("_______________________|");
                    System.out.println("2- Raphael             |");
                    System.out.println("                       |");
                    System.out.println("_______________________|");
                    System.out.println("3- Donatello           |");
                    System.out.println("                       |");
                    System.out.println("_______________________|");
                    System.out.println("4- Michelangello       |");
                    System.out.println("_______________________|");
                    System.out.println("\n____________________________________________________________\n");
                    n = scan.nextInt(); // Scanner para receber a resposta do úsuario


                    if (n == 1) {

                        t[0].apresentar();
                        cc++;
                        tartaruga = 0;
                    } else if (n == 2) {
                        t[1].apresentar();
                        cc++;
                        tartaruga = 1;
                    } else if (n == 3) {
                        t[2].apresentar();
                        cc++;
                        tartaruga = 2;
                    } else if (n == 4) {
                        t[3].apresentar();
                        cc++;
                        tartaruga = 3;

                    } else {


                        System.out.println("VALOR INVALIDO");


                    }

                }
            } else {
                System.out.println("VALOR INVALIDO");
            }
        }


        System.out.println("\n-------------TARTARUGA NINJA GAME-----------------\n");
        System.out.println("Voce e :" + t[tartaruga].getNome());
        System.out.println("Voce esta em seu esconderijo secreto no esgoto.");
        System.out.println(" ");
        System.out.println("O Mestre Splinter esta parado na sua frente");
        System.out.println(" ");
        while (cc < 3) {
            System.out.println("Oque voce faz?");
            System.out.println(" ");
            System.out.println("1- Falar com o Mestre");
            System.out.println("2- Ignorar o Mestre ");
            System.out.println("\n____________________________________________________________\n");
            n = scan.nextInt();

            if (n == 1) {
                System.out.println("Mestre Splinter: Se acalme, " + t[tartaruga].getNome() + ". Seus irmãos foram capturados, você estava muito ferido mais graças ao rémedio que eu fiz o seu 'HP' recuperou");
                System.out.println("Mestre Splinter: Seu HP:" + t[tartaruga].getVida());
                System.out.println("Mestrer Splinter: Venha sempre para o esconderijo no esgoto quando quiser recuperar seu 'HP'!");
                cc++;
            } else if (n == 2) {
                System.out.println("Mestre Splinter: " + t[tartaruga].getNome() + " Não vire as costas pra mim rapaz!");
                System.out.println(" ");
                System.out.println("Mestre Splinter: Eu sei que esta querendo  vingar os irmaos que foram capturados, "
                        + "voce estava muito ferido mais gracas ao remedio que eu fiz o seu >> HP foi restaurado <<");
                System.out.println(" ");
                System.out.println("Mestre Splinter: Seu HP:" + t[tartaruga].getVida());
                System.out.println(" ");
                System.out.println("Mestrer Splinter: Venha sempre para o esconderijo no esgoto quando quiser >> recuperar seu HP <<!");
                cc++;

            } else {
                System.out.println("VALOR INVALIDO");
            }
        }
        System.out.println("\n____________________________________________________________\n");
        System.out.println("Pra onde voce vai?");
        System.out.println(" ");
        System.out.println("_______________________");
        System.out.println("1- Sair do esgoto      |");
        System.out.println("_______________________|");
        System.out.println("2- Vasculhar o esgoto  |");
        System.out.println("_______________________|");
        System.out.println("3- Mexer no computador |");
        System.out.println("_______________________|");
        n = scan.nextInt();

        if (n == 1) {
            System.out.println(" Voce saiu do esgoto\n "
                    + " um vilao estava te esperando!");
            System.out.println("                      ");
            t[5].apresentar();
            System.out.println("                      ");
            System.out.println("Karai: Torturamos seus irmaos!  um deles nao aguentou e acabou revelando seu esconderijo!");
            System.out.println("Karai: Voce e a ultima das tartarugas!");
            System.out.println("                      ");
            System.out.println("    >>> >>>>> BATALHAR <<<<< <<<   ");


            int level;
            level = 0;
            int pizza = 1;
            while (level < 1) {


                System.out.println("\n____________________________________________________________\n");
                System.out.println("Sua vida atual e: " + t[tartaruga].getVida());
                System.out.println("Vida da Karai: " + t[5].getVida());
                System.out.println("Oque voce faz?");
                System.out.println(" ");
                System.out.println("\n__________________");
                System.out.println("1- Atacar        |");
                System.out.println("_________________|");
                System.out.println("2- Defender      |");
                System.out.println("_________________|");
                System.out.println("3- Comer Pizza   |");
                System.out.println("_________________|");
                n = scan.nextInt();


                if (n == 1) {
                    t[tartaruga].atacar();
                    t[5].setVida(t[5].getVida() - t[tartaruga].getDano());

                } else if (n == 2) {

                    System.out.println("Voce entrou no seu casco e bloqueou metade do dano do inimigo");
                } else if (n == 3) {

                    if (pizza >= 1) {
                        int curar = 0;
                        curar = new java.util.Random().nextInt(30) + 10;
                        System.out.println("Voce se curou: " + curar);
                        t[tartaruga].setVida(t[tartaruga].getVida() + curar);
                        System.out.println("Sua vida Atual e: " + t[tartaruga].getVida());
                        pizza--;


                    } else if (pizza <= 0) {
                        System.out.println("________________________________________");
                        System.out.println("|      Voce nao tem mais pizzas!!      |");
                        System.out.println("|______________________________________|");

                    }


                }

                if (t[5].getVida() < 1) {
                    vencer();
                    level++;
                } else if (t[5].getVida() > 0) {
                    if (n == 1) {
                        int vilaoDano = 0;
                        vilaoDano = new java.util.Random().nextInt(13);
                        System.out.println(t[5].getNome() + "Atacou voce e deu " + vilaoDano + " de dano!");
                        t[tartaruga].setVida(t[tartaruga].getVida() - vilaoDano);
                    } else if (n == 2) {
                        int vilaoDano = 0;

                        vilaoDano = new java.util.Random().nextInt(15);
                        System.out.println(t[5].getNome() + "Atacou voce e deu " + vilaoDano + " de dano!");
                        System.out.println("Mas o seu casco te protgeu de grande parte do dano então o dano do vilao foi " + vilaoDano);
                        t[tartaruga].setVida(t[tartaruga].getVida() - vilaoDano / 2);
                    }
                }

                if (t[tartaruga].getVida() < 1) {
                    morreu();
                    level++;
                }

                System.out.println("\n____________________________________________________________\n");


            }
        }


        if (n == 2){
            System.out.println("Voce estava vasculhando o esgoto e deu de cara com um temido crocodilo");
            System.out.println("               ");
            t[4].apresentar();
            System.out.print("                 ");
            System.out.println("Cabeca-de-couro: O ESGOTO E MEU, SAIAM DO MEU CAMINHO!!");
            System.out.println("                      ");
            System.out.println("    >>> >>>>> BATALHAR <<<<< <<<   ");

            int level2;
            level2 = 0;
            int pizza2 =  1;
            while (level2 < 1) {


                System.out.println("\n____________________________________________________________\n");
                System.out.println("Sua vida atual e: " + t[tartaruga].getVida());
                System.out.println("Vida do cabeca-de-couro: " + t[4].getVida());
                System.out.println("Oque voce faz?");
                System.out.print("                 ");
                System.out.println("__________________");
                System.out.println("1- Atacar        |");
                System.out.println("_________________|");
                System.out.println("2- Defender      |");
                System.out.println("_________________|");
                System.out.println("3- Comer Pizza   |");
                System.out.println("_________________|");

                n = scan.nextInt();

                if (n == 1) {
                    t[tartaruga].atacar();
                    t[4].setVida(t[4].getVida() - t[tartaruga].getDano());

                } else if (n == 2) {

                    System.out.println("Voce entrou no seu casco e bloqueou metade do dano do inimigo");
                }else if (n == 3) {

                    if(pizza2 >= 1){
                        int curar = 0;
                        curar = new java.util.Random().nextInt(30)+10;
                        System.out.println("Você se curou: " + curar);
                        t[tartaruga].setVida(t[tartaruga].getVida() + curar);
                        System.out.println("Sua vida Atual é: " + t[tartaruga].getVida());
                        pizza2--;


                    }else if (pizza2 <= 0) {
                        System.out.println("________________________________________");
                        System.out.println("|      Voce nao tem mais pizzas!!      |");
                        System.out.println("|______________________________________|");

                    }

                }

                if (t[4].getVida() < 1) {
                    vencer();
                    level2++;
                } else if (t[4].getVida() > 0) {
                    if (n == 1) {
                        int vilaoDano = 0;
                        vilaoDano = new java.util.Random().nextInt(13);
                        System.out.println(t[6].getNome() + "Atacou voce e deu " + vilaoDano + " de dano!");
                        t[tartaruga].setVida(t[tartaruga].getVida() - vilaoDano);
                    } else if (n == 2) {
                        int vilaoDano = 0;

                        vilaoDano = new java.util.Random().nextInt(15);
                        System.out.println(t[4].getNome() + "Atacou voce e deu " + vilaoDano + " de dano!");
                        System.out.println("Mas o seu casco te protegeu de grande parte do dano entao o dano do vilao foi "+  vilaoDano);
                        t[tartaruga].setVida(t[tartaruga].getVida() - vilaoDano/2);
                    }
                }

                if (t[tartaruga].getVida() < 1) {
                    morreu();
                    level2++;
                    level2++;
                }

                System.out.println("\n____________________________________________________________\n");
            }
        }
        if (n==3) {
            try {


                System.out.println("Você entrou no computador");
                System.out.println("Digite o Codigo Númerico de 3 digitos: ***");
                int s = scan.nextInt();

                if( s == senha){
                    System.out.println(" Parabens voce ativou o codigo de trapaça");
                    int pizza = 50;
                }
            } catch (InputMismatchException erro) {
                System.out.println("Ocorreu um erro : " + erro);
            }

        }

        }



    private static void vencer() {
        System.out.println("___________________________");
        System.out.println("|      Voce venceu!!      |");
        System.out.println("|_________________________|");

    }

    private static void morreu() {

        System.out.println("_________________________");
        System.out.println("|      Voce Morreu!!     |");
        System.out.println("|                        | ");
        System.out.println("|   > Tente Novamente <  | ");
        System.out.println("|________________________|");




    }
}
