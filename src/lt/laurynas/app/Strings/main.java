package lt.laurynas.app.Strings;

public class main {
    public static void main(String[] args) {
        System.out.println("Sveiki, Jonai" + "\r\n" + "Kaip sekasi?");

        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        System.out.println(lorem.toLowerCase());

        System.out.println(lorem.toUpperCase());

        System.out.println(lorem.replace("o", "z"));
        System.out.println(lorem.endsWith("elit"));

    }
}
