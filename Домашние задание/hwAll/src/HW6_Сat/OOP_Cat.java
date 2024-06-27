package HW6_Сat;

public class OOP_Cat {
    public static void main(String[] args) {

        Cat cat = new Cat("Шпинат",60);
        Plate plate1 = new Plate(20);
        Plate plate2 = new Plate(100);


//        System.out.println(cat.getName());
        System.out.println(cat);
        System.out.println("[1]" + plate1);
        System.out.println("[2] " + plate2);
        System.out.println();
        cat.eat(plate1);

        System.out.println(cat);
        System.out.println("[1]" + plate1);
        System.out.println("[2] " + plate2);
        System.out.println();
        cat.eat(plate1);

        System.out.println(cat);
        System.out.println("[1]" + plate1);
        System.out.println("[2] " + plate2);
        System.out.println();
        cat.eat(plate2);

        System.out.println(cat);
        System.out.println("[1]" + plate1);
        System.out.println("[2] " + plate2);
        System.out.println();
        cat.eat(plate2);

        System.out.println(cat);
        System.out.println("[1] " + plate1);
        System.out.println("[2] " + plate2);
        System.out.println();


    }
}
