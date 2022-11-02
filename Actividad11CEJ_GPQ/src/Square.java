import javax.swing.*;

public class Square {
    public void persqu(){
        double ls, ps,as;
        ls = Integer.parseInt(JOptionPane.showInputDialog("Digite un lado de su cuadrado"));
        ps=ls+ls+ls+ls;
        System.out.println("El perìmetro de su cuadrado es: "+ps);
    }
    public void aresqu(){
        double ls, ps,as;
        ls = Integer.parseInt(JOptionPane.showInputDialog("Digite un lado de su cuadrado"));
        as=ls*ls;
        System.out.println("El àrea de su cuadrado es: "+as);
    }

}
