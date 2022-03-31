package cat.cotxe;

public class Main {

    public static void main(String[] args) {
        cotxe cotxe_fabrica = new cotxe();

        cotxe_fabrica.setMarca("RedBull Racing");
        System.out.println(cotxe_fabrica.getMarca());

        cotxe_fabrica.setHeight(256f);
        System.out.println(cotxe_fabrica.getHeight());

        cotxe_fabrica.setWidth(498f);
        System.out.println(cotxe_fabrica.getWidth());
    }
}

