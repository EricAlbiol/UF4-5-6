package cat.cotxe;
import java.util.Scanner;

public class Main {
    public static final String MSG1 = "Introdueix la marca:";
    public static final String MSG2 = "Introdueix l'alçada:";
    public static final String MSG3 = "Introdueix el pes:";

    public static void main(String[] args) {
        cotxe cotxe_fabrica = new cotxe();
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG1);
        cotxe_fabrica.setMarca(sc.next());

        System.out.println(MSG2);
        cotxe_fabrica.setHeight(sc.nextFloat());

        System.out.println(MSG3);
        cotxe_fabrica.setWidth(sc.nextFloat());

        System.out.println("Marca: "+ cotxe_fabrica.getMarca());
        System.out.println("Alçada: "+ cotxe_fabrica.getHeight());
        System.out.println("Pes: "+ cotxe_fabrica.getWidth());
    }
}
