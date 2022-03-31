package cat.chair;

public class Main {

    public static void main(String[] args) {
        chair new_chair = new chair();

        new_chair.setMarca("Ikea");
        System.out.println(new_chair.getMarca());

        new_chair.setMaterial("Fusta");
        System.out.println(new_chair.getMaterial());

        new_chair.setHeight(0.72f);
        System.out.println(new_chair.getHeight());

        new_chair.setWidth(6f);
        System.out.println(new_chair.getWidth());
    }
}

