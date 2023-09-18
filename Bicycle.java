package homework2.hmwk5;

public class Bicycle extends Gifts  {

    String status;

    public Bicycle (String name, Double price, String status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
