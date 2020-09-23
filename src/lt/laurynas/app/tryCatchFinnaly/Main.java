package lt.laurynas.app.tryCatchFinnaly;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working directory is: " + System.getProperty("user.dir"));
        File relativeFile = new File("./data/singleLine.txt");
        try {
            FileReader fileReader = new FileReader(relativeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            System.out.println(fileLine);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*************************************");

        File relativeFile2 = new File("./data/multiLine.txt");
        try {
            FileReader fileReader2 = new FileReader(relativeFile2);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
            String fileLines2 = bufferedReader2.readLine();
            while (fileLines2 != null) {
                // System.out.println(fileLines2);
                String[] splitString = fileLines2.split(" ");
                fileLines2 = bufferedReader2.readLine();
                System.out.println(Arrays.toString(splitString));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("***********************************************");

        File relativeFiles = new File("./data/writtingToFiles.csv");

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter employee name: ");
            String name = sc.nextLine();
            FileWriter wr = new FileWriter(relativeFiles);
            BufferedWriter ml = new BufferedWriter(wr);

            ml.write(name + "\n");


            ml.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*********************************************");
        try {
            FileWriter fw = new FileWriter(relativeFile2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            String fileLine = "\nSpecific Data";
            bufferedWriter.write(fileLine);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(("*********************************************"));
        // try {
        //     checked();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        //
        // try {
        //     unchecked();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        //     try {
        //         u(2);
        //     } catch (FileNotFoundException e) {
        //         System.err.println("Failas nerastas, pažiūrėkite ar jis yra direktorijoje: " + relativeFile2.getPath());
        //     } catch (IOException | ArrayIndexOutOfBoundsException e) {
        //         System.err.println("I/O klaida, failas rastas, bet negaliu perskaityti!");
        //         System.err.println(e.getMessage());
        //         e.printStackTrace();
        //     } catch (Exception e) {
        //         System.err.println("Bendrinė klaida");
        //     }
        //
        //
        //
        // }

        // public static void unchecked() throws IOException {
        //     throw new IOException("IO klaida");
        // }
        //
        // public static void checked() {
        //     throw new ArithmeticException("Aritmetikos klaida");
        // }
        //
        //
        // public static void u(int param) throws Exception {
        //     switch (param) {
        //         case 1:
        //             throw new Exception();
        //         case 2:
        //             throw new IOException();
        //         case 3:
        //             throw new FileNotFoundException();
        //     }
        // }

    }
}