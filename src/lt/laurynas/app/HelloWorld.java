package lt.laurynas.app;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE - 1); //underflow
        System.out.println(Integer.MAX_VALUE + 1); //overflow

        int i = 5;
        int j = 2;

        System.out.println("i is " + i);
        System.out.println("j is " + j);

        int k = i % j;
        // System.out.println("i%j is " + k);
        // float result = 2 / 0;
        // System.out.println(result);
        // int x = 10;
        // int y = 5;
        // System.out.println(x == 10 && y <= 5); //true
        // System.out.println(x <= y && y > 5); // false
        // System.out.println(„abc” instanceof String);  // true

        String str1  = "Sveiki, Jonai!";
        String str2 = "Kaip sekasi?";
        System.out.println(str1 + "\r\n" + str2);
    }
}


