import javax.swing.*;

public class Circle {
public void arecir(){
    double dc, pc,ac;
    dc = Integer.parseInt(JOptionPane.showInputDialog("Digite el diámetro del cìrculo"));
    ac=(dc/2)*3.1416*(dc/2);
    System.out.println("El àrea de su cìrculo es: "+ac);
}
public void percir(){
    double dc, pc,ac;
    dc = Integer.parseInt(JOptionPane.showInputDialog("Digite el diámetro del cìrculo"));
    pc=3.1416*dc;
    System.out.println("El perìmetro de su cìrculo es: "+pc);
}
}
