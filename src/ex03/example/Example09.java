package ex03.example;

public class Example09 {
    public static void main(String[] args) {

        int n = 10;
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i < n; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }
        for (int j = 0; j < n; j++) {
            System.out.print(f[j] + " ");
        }
    }
}