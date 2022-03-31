package cat.cat;

public class Main {

    public static void main(String[] args) {
        cat cat_adoptat = new cat();

        cat_adoptat.setRace("Sphynx");
        System.out.println(cat_adoptat.getRace());

        cat_adoptat.setHeight(0.50f);
        System.out.println(cat_adoptat.getHeight());

        cat_adoptat.setWidth(5.25f);
        System.out.println(cat_adoptat.getWidth());
    }
}

