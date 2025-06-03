package Objects;

public class Ikea {

    public static void main(String[] args) {

        // Datatype + Name = Value
        int example = 1;
        Table table1 = new Table();

        // These are the same:
        // String myString = new String("Hello World");
        String myString = "Hello World";

        System.out.println(table1.getWeight());

        table1.setWeight(10000.0);

        System.out.println(table1.getWeight());

    }
}
