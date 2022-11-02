import javax.swing.*;
import java.util.Scanner;

public class Shape {
    double ls, ps,as;
    double dc, pc,ac;
    double bt,lt2,lt3, alt,pt,at;
    int op,opp,opa;
    public void menu(){
        int op,opp,opa;
        Scanner reader = new Scanner(System.in);
        Circle cir=new Circle();
        Square squ=new Square();
        Triangle tri=new Triangle();
        System.out.println("Bienvenido a càlculos de figuras!");
        System.out.println("Selecciona una opción:");
        System.out.println("1 Obtener Perìmetro");
        System.out.println("2 Obtener Àrea");
        op = reader.nextInt();
        switch (op) {
            case 1:
                System.out.println("Selecciona una figura:");
                System.out.println("1 Circle");
                System.out.println("2 Triangle");
                System.out.println("3 Square");
                opp= reader.nextInt();
                switch (opp) {
                    case 1:
                        cir.percir();
                        break;
                    case 2:
                        tri.pertri();
                        break;
                    case 3:
                        squ.persqu();
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
                break;
            case 2:
                System.out.println("Selecciona una figura:");
                System.out.println("1 Circle");
                System.out.println("2 Triangle");
                System.out.println("3 Square");
                opa= reader.nextInt();
                switch (opa) {
                    case 1:
                        cir.arecir();
                        break;
                    case 2:
                        tri.aretri();
                        break;
                    case 3:
                        squ.aresqu();
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
    public void getArea(){

                //circle
                dc = Integer.parseInt(JOptionPane.showInputDialog("Digite el diámetro del cìrculo"));
                ac=(dc/2)*3.1416*(dc/2);
                System.out.println("El àrea de su cìrculo es: "+ac);


                //triangle
                bt = Integer.parseInt(JOptionPane.showInputDialog("Digite la base"));
                alt = Integer.parseInt(JOptionPane.showInputDialog("Digite la altura del triàngulo"));
                at=(bt*alt)/2;
                System.out.println("El àrea de su triàngulo es: "+at);

                //square
                ls = Integer.parseInt(JOptionPane.showInputDialog("Digite un lado de su cuadrado"));
                as=ls*ls;
                System.out.println("El àrea de su cuadrado es: "+as);

        }


    public void getPerimeter(){

                //circle
                dc = Integer.parseInt(JOptionPane.showInputDialog("Digite el diámetro del cìrculo"));
                pc=3.1416*dc;
                System.out.println("El perìmetro de su cìrculo es: "+pc);


                bt = Integer.parseInt(JOptionPane.showInputDialog("Digite la base de su triàngulo"));
                lt2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo lado de su triàngulo"));
                lt3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer lado de su triàngulo"));
                pt=bt+lt2+lt3;
                System.out.println("El perìmetro de su triàngulo es: "+pt);

                //square
                ls = Integer.parseInt(JOptionPane.showInputDialog("Digite un lado de su cuadrado"));
                ps=ls+ls+ls+ls;
    }

}
