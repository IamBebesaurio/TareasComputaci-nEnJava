public class Main {
    public static void main(String[] args) {
        double division;
        double multiplicacion;
        double resta;
        double suma;
        double x1;
        double y1;
        x1 = Math.floor(Math.random()*100);
        y1 = Math.floor(Math.random()*100);
        suma = x1+y1;
        resta = x1-y1;
        multiplicacion = x1*y1;
        division = x1/y1;
        System.out.println("X ="+x1);
        System.out.println("Y ="+y1);
        System.out.println("Suma:"+suma);
        System.out.println("Resta:"+resta);
        System.out.println("Multiplicación:"+multiplicacion);
        System.out.println("División:"+division);
        System.out.println("Módulo:"+x1+","+y1);
    }
}