package cat.quadrat;

public class Main {

    public static void main(String[] args) {
        quadrat quadrat_nou = new quadrat();

        quadrat_nou.setColor("Yellow");
        System.out.println(quadrat_nou.getColor());

        quadrat_nou.setSide(3f);
        System.out.println(quadrat_nou.getSide());

        quadrat_nou.setArea(9f);
        System.out.println(quadrat_nou.getArea());
    }
}

