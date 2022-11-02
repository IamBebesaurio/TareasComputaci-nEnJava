import javax.swing.*;

public class Triangle {
    public void pertri(){
        double bt,lt2,lt3, alt,pt,at;
        bt = Integer.parseInt(JOptionPane.showInputDialog("Digite la base de su triàngulo"));
        lt2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo lado de su triàngulo"));
        lt3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer lado de su triàngulo"));
        pt=bt+lt2+lt3;
        System.out.println("El perìmetro de su triàngulo es: "+pt);
    }
    public void aretri(){
        double bt,lt2,lt3, alt,pt,at;
        bt = Integer.parseInt(JOptionPane.showInputDialog("Digite la base"));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Digite la altura del triàngulo"));
        at=(bt*alt)/2;
        System.out.println("El àrea de su triàngulo es: "+at);
    }


}
