package ex17;

import java.io.*;
import java.net.*;

public class URLConnectionReader {
    public static void main(String[] args) throws IOException {
        URL site = new URL("http://naver.com/");
        URLConnection url = site.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.getInputStream())
        );
        String inLine;

        while ((inLine = in.readLine()) != null) {
            System.out.println(inLine);
        }
        in.close();
    }
}