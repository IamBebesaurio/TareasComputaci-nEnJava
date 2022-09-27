import javax.swing.*;

public class Desarrollo {
    int n;
    public void leer(){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para los números primos deseados y longitud de la sucesión: "));
    }
    public void suc(){
        int a=0;
        int b=1;
        int c;
        int d=0;
        int q;
        int r;
        int[] sucesion = new int[n];
        for (r=1;r<=n;r++) {
            sucesion[d] = a;
            d = d+1;
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println("Sucesión de Fibonacci:");
        for (q=0;q<=n-1;q++) {
            System.out.print(sucesion[q]);
            System.out.print(", ");
        }
    }
    public void numprim(){
        int contador;
        int f,j,x,i=0,num=0;
        int[] numeroprimo = new int[n];
        f=n;
        while (f>0) {
            num = num+1;
            x = 1;
            contador = 0;
            while (x<=num) {
                if (num%x==0) {
                    contador = contador+1;
                }
                x = x+1;
            }
            if (contador==2) {
                numeroprimo[i] = num;
                i = i+1;
                f = f-1;
            }
        }
        System.out.println("Números primos:");
        for (j=0;j<=i-1;j++) {

            System.out.print(numeroprimo[j]);
            System.out.print(", ");
        }
        System.out.println(" ");
    }
}
