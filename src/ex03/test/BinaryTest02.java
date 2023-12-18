package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {
        // 이진 검색 => 반드시 정렬이 되어 있어야 함
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int N = arr.length;

        final int target = 12;
        int start = 0;
        int end = N - 1;
        int mid = (end - start) / 2;

        for (int i = 1; i < N-1; i++) {
            if (arr[mid] == target) {
                System.out.println(target + "값은 " + mid + "번지에 있습니다");
                break;
            } else if (arr[mid] < target) { // 기대값 start 5, end 8
                start = mid + 1;
                mid = start + ((end - start) / 2);
            } else if (arr[mid] > target) { // 기대값 start 0, end 3
                end = mid - 1;
                mid = start + ((end - start) / 2);
            }
            System.out.println(i + "회전 start: " + start);
            System.out.println(i + "회전 end: " + end);
        }
    }
}
