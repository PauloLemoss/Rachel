package com.company;
import java.util.Scanner;
public class Personagem {

    private String nome;
    private int vida;
    private String arma;
    private int dano;


    public Personagem (String no, int vi, String ar) {
        this.nome = no;
        this.vida = vi;
        this.arma = ar;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida () {
        return vida;
    }

    public void setVida (int vida){
        this.vida = vida;
    }

    public String getArma (){
        return arma;
    }

    public void setArma(String arma){

        this.arma = arma;
    }

    public int getDano() {
        return dano;
    }

    public void setDano (int dano){
        this.dano = dano;
    }


    public void atacar (){
        Scanner scan1 = new Scanner(System.in);
        int dano;
        dano = 0;

        if( this.arma.equals("Bastao")) {
            setDano(dano = new java.util.Random().nextInt(8));
        }else if (this.arma.equals("Espadas")) {
            setDano(dano = new java.util.Random().nextInt(12));
            System.out.println(getDano());
        }else if (this.arma.equals("Sai")){
            setDano(dano = new java.util.Random().nextInt(10));
        }else if (this.arma.equals("Nunchaku")){
            setDano(dano = new java.util.Random().nextInt(9));
        }
        System.out.println("Você atacou o inimigo e deu " + dano + " de dano!");

    }


    public void apresentar(){



        if(this.nome.equals("Leonardo")){
            System.out.println("Boa escolha!");
            System.out.println("Voce escolheu " + this.getNome() + ":");

            System.out.println("Leonardo, Leo e o lider das quatro tartarugas,  usa bandana azul e tem como armas duas katanas.");
        } else if(this.nome.equals("Raphael")){
            System.out.println("Boa escolha!");
            System.out.println("Voce escolheu " + this.getNome() + ":");

            System.out.println("Raphael, Raphael o anti-heroi do grupo, nervoso, rebelde, ele sempre se odeia as ordens de Leonardo e tem um mau-humor caracteristico. Usa bandana vermelha e tem duas sais como armas.");
        }else if(this.nome.equals("Michelangello")) {
            System.out.println("Boa escolha!");
            System.out.println("Voce escolheu " + this.getNome() + ":");

            System.out.println("Michelangello, Mikey, e o cacula dos irmaos e o mais engracado. Devorador de pizzas ele sempre tem piadas para fazer e usa uma bandana laranja e um par de nunchakus como arma.");
        }else if(this.nome.equals("Donatello")){
            System.out.println("Boa escolha!");
            System.out.println("Voce escolheu " + this.getNome() + ":");
            System.out.println("Donatello, Donnie e o genio do grupo, responsavel pela parte tecnologica da base e inventor de muitos apetrechos. Usa uma bandana roxa e tem um cajado (ou bastao) como arma predileta.");

        }else if(this.nome.equals("Karai")){
            System.out.println("Honra e dever sao aspectos integrais para a vilan misteriosa conhecida como Karai.");
            System.out.println("As habilidades de artes marciais e esgrima tornaram a vila muito perigosa para as tartarugas, \n principalmente para o Leonardo. \n Sendo uma filha adotada do Destruidor,"
                    + "\n uma aprendiz, ou a proxima pessoa na linha de sucessao para a lideranca do Cla<"
                    + "\n sua reputacao como vila e temida por todos.");

        }else if(this.nome.equals("Cabeca-de-couro")){
            System.out.println("Leatherhead ou Cabeca-de-couro e um mutante crocodilo, que foi utilizado como um rato de laboratorio (ou, neste caso, um reptil) pelo Kraang.");
            System.out.println("Ele usa suas garras implacaveis para derrotar seus inimigos");

        }else if(this.nome.equals("Destruidor")){
            System.out.println("Destruidor é um mestre de Ninjutsu, um inimigo e rival de Splinter, o \"pai adotivo\" de Karai, o líder nefasto do clã do pé, e um dos dois antagonistas principais da série, sendo a primeira Os Kraang.");
            System.out.println("");
        }


    }


}
