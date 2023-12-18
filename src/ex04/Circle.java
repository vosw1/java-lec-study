package ex04;

// 설계도
public class Circle {
        private int radius;

        // 생성자 : 생성될 때 무조건 실행되는 메서드
        // 눈에 안보이지만 자동생성되어있는 메서드
        public Circle(int r){ // 초기화 코드
                radius = r;
        }

        public double getArea(){
            return 3.14 * radius * radius;
        }
}
