package ex04;

class Television01 {
    private int channel;
    private int volume;
    private boolean onOff;

    Television01(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    } // 변수 이름이 달라서 충돌날 일이 없으니 this 사용 안함

    void print(){
        System.out.println("채널은 " + channel + "볼륨은 " + volume + "입니다.");
    }
}

public class TelevisionTest{
    public static void main(String[] args) {
        Television01 myTv = new Television01(7, 10, true);
        myTv.print();
        Television01 yourTv = new Television01(11, 20, true);
        yourTv.print();
    }
}
