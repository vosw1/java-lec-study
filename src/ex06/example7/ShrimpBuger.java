package ex06.example7;

public class ShrimpBuger extends Burger{
    private String material;

    public ShrimpBuger(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
