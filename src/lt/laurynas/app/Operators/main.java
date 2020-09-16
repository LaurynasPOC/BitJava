package lt.laurynas.app.Operators;

public class main {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        System.out.println("5 dalinant iš 2 gaunama liekana yra: " + x%y);
        int m = 2;
        int n = 0;
        // System.out.println(m/n); //Can not be divided
        x = 10;
        y = 5;

        System.out.println(x == 10 && y <= 5); // True
        System.out.println(x <= y && y > 5); // False
        // System.out.println(„abc” instanceof String); //Error not valid characters
    }
}
