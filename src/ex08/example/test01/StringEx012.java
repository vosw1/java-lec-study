package ex08.example.test01;

public class StringEx011 {

    public static String encoding(String data) {
        return "";
    }

    public static String decoding(String encodingData) {
        return "";
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte

        // AABBBCCCCDDDDD로 분배
        String[] dataarrs = data.split("");
        for (String dataarr : dataarrs) {
            System.out.print(dataarr);
        }
       // 인코딩 A2B3C4D5
        
        // 디코딩 AABBBCCCCDDDDD
    }
}
