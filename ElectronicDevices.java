package homework2.hmwk5;

public class ElectronicDevices extends Gifts{
    String characteristic;

    public String getCharacteristic() {
      return characteristic;
    }

    public ElectronicDevices (String name, Double price, String characteristic) {
        this.name = name;
        this.price = price;
        this.characteristic = characteristic;
    }
}
