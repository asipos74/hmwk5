package homework2.hmwk5;

public class Sweets extends Gifts {
    String type;
    public String getType() {
        return type;
    }

    public Sweets (String name, Double price, String type) {
        this.name = name;
        this.price = price;
       // this.quantity = quantity;
        this.type = type;
    }
}
