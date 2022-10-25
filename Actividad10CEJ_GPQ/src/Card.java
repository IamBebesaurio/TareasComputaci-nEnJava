import javax.swing.*;
import java.util.Scanner;

public class Card {

    int car=52;
    String[] palo = new String[3];
    String[] color = new String[2];
    String[] valor = new String[9];
    String[] deck = new String[52];


    public void asignar(){
        palo[0] = "treboles";
        palo[1] = "corazones";
        palo[2] = "diamantes";
        color[0] = "rojo";
        color[1] = "negro";
        valor[0] = "2";
        valor[1] = "3";
        valor[2] = "4";
        valor[3] = "5";
        valor[4] = "6";
        valor[5] = "7";
        valor[6] = "8";
        valor[7] = "9";
        valor[8] = "10";

    }
    public void shuffle(){
        int x=0;
        int y=0;
        int z=0;


        for (int i=0;i<=51;i++) {
            x=(int) (Math.random()*3);
            y=(int) (Math.random()*2);
            z=(int) (Math.random()*8);
            deck[i]= palo[x]+"      "+ color[y]+"       "+ valor[z];
        }
        System.out.println("Se mezcló el deck");
    }
    public void head(){
        System.out.println(deck[0]);
        car=car-1;
        System.out.println("Quedan "+car+ " cartas");
    }
    public void pick(){
        int he=0;
        he=(int) (Math.random()*52+1);
        System.out.println(deck[he]);
        car=car-1;
        System.out.println("Quedan "+car+ " cartas");
    }
    public void hand(){
        int han=0;
        car=car-1;
        for (int i=0;i<=5;i++) {
            han=(int) (Math.random()*52+1);
            System.out.println(deck[han]);;
            car=car-1;
            System.out.println("Quedan "+car+ " cartas");
        }

    }

    public void showMenu(){
        Card de=new Card();
        int op;
        int opb;
        de.asignar();
        opb = 1;
        int throw_exception;
        throw_exception = 11;
        while (opb==1) {
            System.out.println("Bienvenido a Poker!");
            System.out.println("Selecciona una opción:");
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("0 Salir");
            Scanner reader = new Scanner(System.in);
            op = reader.nextInt();
            switch (op) {
                case 1:
                    if (throw_exception<=0) {
                        System.out.println("Se han agotado las cartas");
                        opb = 0;
                    } else {
                        de.shuffle();
                    }
                    break;
                case 2:
                    if (throw_exception<=0) {
                        System.out.println("Se han agotado las cartas");
                        opb = 0;
                    } else {
                        de.head();
                        throw_exception=throw_exception-1;
                    }
                    break;
                case 3:
                    if (throw_exception<=0) {
                        System.out.println("Se han agotado las cartas");
                        opb = 0;
                    } else {
                        de.pick();
                        throw_exception=throw_exception-1;
                    }
                    break;
                case 4:
                    if (throw_exception<=0) {
                        System.out.println("Se han agotado las cartas");
                        opb = 0;
                    } else {
                        de.hand();
                        throw_exception=throw_exception-5;
                    }
                    break;
                case 0:
                    opb = 0;
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }

        }
    }

