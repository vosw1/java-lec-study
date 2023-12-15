package ex03;

public class TheaterSeats {
    public static void main(String[] args) {

        // 배열은 구조 변경 불가능
        int[][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {1, 1, 0, 0, 0, 0, 1, 1, 1, 0}
        }; // 4,10 배열

        int sum = 0;
        int count = 0;
        //int row = -1;

        for (int row = 0; row < seats.length; row++) {
            count = 0;
            for (int i = 0; i < seats[row].length; i++) { //직접 값을 넣는것보다 length를 쓰는게 좋음
                count = count + seats[row][i]; //누적코드 :자기 값 + 새로운 값 => 넣음
            }
            System.out.println(row + "번째 행의 관객수는 : " + count);
            sum = sum + count;
        }
        System.out.println("전체 관객수는 : " + sum);

/*
        row++;
        count = 0;
        for (int i = 0; i < seats[row].length; i++) { //직접 값을 넣는것보다 length를 쓰는게 좋음
            System.out.println(seats[row][i]);
            count = count + seats[row][i]; //누적코드 :자기 값 + 새로운 값 => 넣음
        }
        System.out.println(row + "번째 행의 관객수는 : " + count);
        sum = sum + count;

        row++;
        count = 0;
        for (int i = 0; i < seats[row].length; i++) { //직접 값을 넣는것보다 length를 쓰는게 좋음
            System.out.println(seats[row][i]);
            count = count + seats[row][i]; //누적코드 :자기 값 + 새로운 값 => 넣음
        }
        System.out.println(row + "번째 행의 관객수는 : " + count);
        sum = sum + count;

        row++;
        count = 0;
        for (int i = 0; i < seats[row].length; i++) { //직접 값을 넣는것보다 length를 쓰는게 좋음
            System.out.println(seats[row][i]);
            count = count + seats[row][i]; //누적코드 :자기 값 + 새로운 값 => 넣음
        }
        System.out.println(row + "번째 행의 관객수는 : " + count);
        sum = sum + count;

        System.out.println("전체 관객수는 : " + sum);
*/

    }
}
