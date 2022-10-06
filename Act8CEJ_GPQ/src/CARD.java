public class CARD {

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
        }
        System.out.println("Quedan "+car+ " cartas");
    }
}
