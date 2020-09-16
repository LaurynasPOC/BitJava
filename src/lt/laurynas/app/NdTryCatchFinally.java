package lt.laurynas.app;

import java.io.*;
import java.util.Arrays;

public class NdTryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        // ... sukuriu failo objektą, kuris laiko info kur failas randasi
        // File relativeFile = new File("data/singleLine.txt");
        File relativeFile = new File("./data/singleLine.txt");
        try {
            // standartinis būdas gauti duomenis iš teksitinio failo javoje
            FileReader fileReader = new FileReader(relativeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // skaitome eilutė po eilutės su .readLine() metodu
            String fileLine = bufferedReader.readLine(); // "\n", "\r\n" - ieško newline
            System.out.println(fileLine);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("********************************");

        File multiLine = new File("./data/multiLine.txt");
        try {
            FileReader fileReader = new FileReader(multiLine);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) { // žiūrome ar perskaityta eilutė nėra tuščia
                // System.out.println(fileLine); // spausdiname visą eilutę
                String[] splitString = fileLine.split(" ");
                // String[] splitString = fileLine.split("\\s;|\\s|;");
                System.out.println(fileLine);
                fileLine = bufferedReader.readLine(); // skaitome sekančią eilutę
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("********************************************************");
        File relativeFile2 = new File("./data/writtingToFiles.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(relativeFile2);
            BufferedWriter bw = new BufferedWriter(fw);
            // for (int k = 0; k < 20000; k++) {
            //     bw.write("A");
            // }
            // writting file with newline
            bw.write("Mindaugas\n");
            bw.write("Jonas\n");
            bw.write("Antanas\n");
            bw.write("Petras\n");

            // bw.flush();
            bw.close(); // close automatically flushes the buffer
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("***************************************");
        try {
            fw = new FileWriter(relativeFile2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            String fileLine = "\nappended file line";
            bufferedWriter.write(fileLine);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            checked();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            unchecked();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            u(2);
        } catch (FileNotFoundException e) {
            System.err.println("Failas nerastas, pažiūrėkite ar jis yra direktorijoje: " + relativeFile2.getPath());
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.err.println("I/O klaida, failas rastas, bet negaliu perskaityti!");
            System.err.println(e.getClass());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Bendrinė klaida");
        }


    }

    public static void unchecked() throws IOException {
        throw new IOException("IO klaida");
    }

    public static void checked() {
        throw new ArithmeticException("Aritmetikos klaida");
    }


    public static void u(int param) throws Exception {
        switch (param) {
            case 1:
                throw new Exception();
            case 2:
                throw new IOException();
            case 3:
                throw new FileNotFoundException();
        }
    }
}