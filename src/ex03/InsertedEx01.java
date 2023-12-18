package ex03;

public class InsertedEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        int target;
        int temp;

        // 1회전
        target = arr[1]; // 8
        if(arr[0] > arr[1]){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        // 2회전
        target = arr[2];// 2
        if(arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        target = arr[1];
        if(arr[0] > arr[1]){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        // 3회전
        target = arr[3];
        if(arr[2] > arr[3]) {
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }
        target = arr[2];// 2
        if(arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        target = arr[1];
        if(arr[0] > arr[1]){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        // 3회전
        target = arr[4];
        if(arr[3] > arr[4]) {
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }

        target = arr[3];
        if(arr[2] > arr[3]) {
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }
        target = arr[2];
        if(arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        target = arr[1];
        if(arr[0] > arr[1]){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        for (int v : arr) { // 전체만 출력 가능
            System.out.print(v + " ");
        }
    }
}
