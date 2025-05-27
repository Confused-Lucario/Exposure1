package Introduction;

public class VariableIntro {
    public static void main(String[] args) {

        /*
        *to create a variable
        * datatype name = value;
         */
        double salary = 100000.56;
        int bonus= 250;

        /*
        * casting a variable means changing its datatype
        *to change a primitive data type, put the new type in ()
        * example below
         */
        bonus = (int) salary;

        System.out.println(salary);
        System.out.println(bonus);

    }
}
