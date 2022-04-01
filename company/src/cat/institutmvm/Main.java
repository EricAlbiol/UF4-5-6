package cat.institutmvm;
import java.util.Scanner;

public class Main {
    public static final String MSG1 = "Introdueix el nom:";
    public static final String MSG2 = "Introdueix el cognom:";
    public static final String MSG3 = "Introdueix el DNI:";
    public static final String MSG4 = "Introdueix l'alçada:";
    public static final String MSG5 = "Introdueix el pes:";


    public static void main(String[] args) {
        person alumne = new person();
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG1);
        alumne.setName(sc.next());

        System.out.println(MSG2);
        alumne.setSurname(sc.next());

        System.out.println(MSG3);
        alumne.setDni(sc.next());

        System.out.println(MSG4);
        alumne.setHeight(sc.nextFloat());


        System.out.println(MSG5);
        alumne.setWidth(sc.nextFloat());

        System.out.println("Nom: "+ alumne.getName());
        System.out.println("Cognom: "+ alumne.getSurname());
        System.out.println("DNI: "+ alumne.getDni());
        System.out.println("Alçada: "+ alumne.getHeight());
        System.out.println("Pes: "+ alumne.getWidth());
    }
}
