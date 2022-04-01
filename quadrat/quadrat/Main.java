package cat.quadrat;
import java.util.Scanner;

public class Main {
    public static final String MSG1 = "Introdueix el color del quadrat:";
    public static final String MSG2 = "Introdueix la mida del costat del quadrat:";
    public static final String MSG3 = "Introdueix l'area del quadrat:";

    public static void main(String[] args) {
        quadrat quadrat_nou = new quadrat();
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG1);
        quadrat_nou.setColor(sc.next());

        System.out.println(MSG2);
        quadrat_nou.setSide(sc.next());

        System.out.println(MSG3);
        quadrat_nou.setArea(sc.next());

        System.out.println("Color: "+ quadrat_nou.getColor());
        System.out.println("Costat: "+ quadrat_nou.getSide());
        System.out.println("Area: "+ quadrat_nou.getArea());
    }
}

