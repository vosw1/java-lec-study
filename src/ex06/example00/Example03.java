package ex06.example00;

class Sports {
    String getName() {
        return  "아직 결정되지 않음";
    }
    int getPlayers(){
        return 0;
    }
}

class Soccer extends Sports {
    String getName;
    int getPlayers;

    public Soccer(String getName, int getPlayers) {
        this.getName = getName;
        this.getPlayers = getPlayers;
    }

    @Override
    public String getName() {
        return getName;
    }

    @Override
    public int getPlayers() {
        return getPlayers;
    }

    public static void print(Soccer obj) {
        System.out.println("경기이름: " + obj.getName());
        System.out.println("경기자수: " + obj.getPlayers());
    }
}

public class Example03 {
    public static void main(String[] args) {
        Soccer obj = new Soccer("축구", 11);
        obj.print(obj);
    }
}
