package homework2.hmwk5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Order orderGift = new Order();
        List<Gifts> gifts = new ArrayList();
        Bicycle bike = new Bicycle("Pegas", 250.00, "second");
        orderGift.addOneGiftToOrder(bike);
        gifts.add(bike);
        ElectronicDevices radio = new ElectronicDevices("Hitachi", 300.00, "HIFI");
        orderGift.addOneGiftToOrder(radio, 3);
        orderGift.modifyQuantityGift(bike, 2);
        orderGift.removeGift(radio);
        Sweets sweet = new Sweets("Tiramisu", 5.50, "cake");
        orderGift.addOneGiftToOrder(sweet, 5);
        gifts.add(sweet);

        System.out.println("--------------------------");
        System.out.println("List the ordered gifts in ascending order after gift price");
        Collections.sort(gifts);
        for (Gifts g : gifts) {
            System.out.println(g.getName() + " , " + g.getPrice());
        }
        System.out.println("---------------------------");

        Order order1 = new Order();
        Order order2 = new Order();
        ElectronicDevices tv = new ElectronicDevices("Sony", 750.00, "TV set");

        order1.addOneGiftToOrder(tv, 3);
        Sweets cookie = new Sweets("Dobos", 4.0,"cake");
        order2.addOneGiftToOrder(cookie,2);
        HotelBooking hotelBooking1 = new HotelBooking();
        HotelBooking hotelBooking2 = new HotelBooking();
        HotelBooking hotelBooking3 = new HotelBooking();

        List<Payments> paymentsOrderAndBooking = new ArrayList<Payments>();
        paymentsOrderAndBooking.add(orderGift);
       // paymentsOrderAndBooking.add(order1);
        paymentsOrderAndBooking.add(hotelBooking1);
        paymentsOrderAndBooking.add(hotelBooking2);
        paymentsOrderAndBooking.add(hotelBooking3);

       for (Payments payments : paymentsOrderAndBooking) {
            payments.printPaymentInstruction();
        }

    }
}
