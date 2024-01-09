package ex15;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\input.txt"));
            outputStream = new PrintWriter(new FileWriter("D:\\workspace\\java_lec\\study\\src\\ex15\\output.txt"));
            String line;
            while ((line = inputStream.readLine()) != null) {
                outputStream.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
