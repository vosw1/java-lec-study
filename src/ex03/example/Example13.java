package ex03.example;

public class Example13 {
    public static void main(String[] args) {
        //1. 배열 만들기
        String[] a = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] b = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        //2. 배열 확인하기
       /* for(String s1:a){
            System.out.println(s1 + " ");
        }

        for (String s2 : b) {
            System.out.println(s2 + " ");
        }*/
        //3. 카드 랜덤으로 뽑기
        int aRandom = 0;
        int bRandom = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < b.length; k++) {
                    aRandom = (int) (Math.random() * a.length);
                    bRandom = (int) (Math.random() * b.length);
                }
            }
            System.out.println(a[aRandom] + "의 " + b[bRandom]);
        }
    }
}