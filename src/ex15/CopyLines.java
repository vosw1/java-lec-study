package ex15;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\input.txt"));
            outputStream = new PrintWriter(new FileWriter("D:\\workspace\\java_lec\\study\\src\\ex15\\output.txt"));
            String l;

            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
                System.out.println(l);
            }
        } finally {

            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}