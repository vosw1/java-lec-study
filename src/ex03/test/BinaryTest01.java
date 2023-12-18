package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {

        // N = 13
        // 시간복잡도 log2(N) -> log2(13) -> 3.700 (3과 4사이)
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int N = arr.length;
        final int target = 9;
        int start = 0;
        int end = N - 1;
        int mid;

        // 1 회전
        mid = start + ((end - start) / 2); // 기대값 6

        if (arr[mid] == target) {
            System.out.println("1회전 : " + target + "값은 " + mid + "번지에 있습니다");
        }

        if (arr[mid] < target) { // 기대값 start 5, end 8
            start = mid + 1;
        }

        if (arr[mid] > target) {
            end = mid - 1;
        }

        System.out.println("1회전 start : " + start);
        System.out.println("1회전 end : " + end);

        // 2 회전
        mid = start + ((end - start) / 2); // 기대값 6

        if (arr[mid] == target) {
            System.out.println("2회전 : " + target + "값은 " + mid + "번지에 있습니다");
        }

        if (arr[mid] < target) { // 기대값 start 7, end 8
            start = mid + 1;
        }

        if (arr[mid] > target) {
            end = mid - 1;
        }

        System.out.println("2회전 start : " + start);
        System.out.println("2회전 end : " + end);

        // 3 회전
        mid = start + ((end - start) / 2); // 기대값 7

        if (arr[mid] == target) {
            System.out.println("3회전 : " + target + "값은 " + mid + "번지에 있습니다");
        }

        if (arr[mid] < target) { // 기대값 start 8, end 8
            start = mid + 1;
        }

        if (arr[mid] > target) {
            end = mid - 1;
        }

        System.out.println("3회전 start : " + start);
        System.out.println("3회전 end : " + end);

        // 4 회전
        mid = start + ((end - start) / 2); // 기대값 8

        if (arr[mid] == target) { // 찾음
            System.out.println("4회전 : " + target + "값은 " + mid + "번지에 있습니다");
        }

        if (arr[mid] < target) {
            start = mid + 1;
        }

        if (arr[mid] > target) {
            end = mid - 1;
        }

        System.out.println("4회전 start : " + start);
        System.out.println("4회전 end : " + end);

        System.out.println("시간복잡도 : " + Math.log(N) / Math.log(2));
    }
}