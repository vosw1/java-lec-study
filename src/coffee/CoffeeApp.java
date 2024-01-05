package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        Barista barista = new Barista();
       // Menu menu = new Menu();
        Customer customer = new Customer(barista);

        //customer.order();
    }
}
