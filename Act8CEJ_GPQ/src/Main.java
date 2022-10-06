import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CARD de=new CARD();
        de.asignar();
        de.shuffle();
        de.head();
        int res;
        int sg;
        sg = 1;
        while (sg==1) {
            res = Integer.parseInt(JOptionPane.showInputDialog("Que acción desea realizar (Pickear=1) (Tomar mano=2)"));
            if (res==1) {
                de.pick();
            } else {
                if (res==2) {   
                    de.hand();
                } else {
                    System.out.println("");
                }
            }
            sg = Integer.parseInt(JOptionPane.showInputDialog("Seguir jugando Si(1) No(2)"));

        }



    }
}