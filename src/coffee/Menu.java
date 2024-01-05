package coffee;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    //메뉴에 대한 정보와 동작을 책임
    private List<String> item;
    private Map<String, Coffee> menuName; // 커피를 매핑하는 맵

    //아메리카노, 카푸치노, 마끼아또, 에스프레소
    public Menu(List<String> item, Map<String, Coffee> menu) {
        this.item = item;
        this.menuName = new HashMap<>();
    }

    public Map<String, Coffee> getMenu() {
        return menuName;
    }
}
