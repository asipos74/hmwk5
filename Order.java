package homework2.hmwk5;

import java.util.ArrayList;
import java.util.List;

public class Order implements Payments {
    private static final List<Gifts> gifts = new ArrayList();

    static void addOneGiftToOrder(Gifts gift) {
        gift.setQuantity(1);
        gifts.add(gift);
    }

    static void addOneGiftToOrder(Gifts gift, Integer quant) {
        gift.setQuantity(quant);
        gifts.add(gift);
    }

    static void modifyQuantityGift(Gifts gift, Integer newQuant) {
        for (Gifts g : gifts) {
            if (g.getName().equals(gift.getName())) {
                g.setQuantity(newQuant);
                break;
            }
        }
    }

    static void removeGift(Gifts gift) {
        for (Gifts g : gifts) {
            if (g.getName().equals(gift.getName())) {
                gifts.remove(g);
                break;
            }
        }
    }

    void printOrder() {
        Double totalOrderPrice = 0.00;
        for (int i = 0; i < gifts.size(); i++) {
            gifts.get(i).printGift();
            totalOrderPrice = totalOrderPrice + gifts.get(i).getPrice() * gifts.get(i).getQuantity();
        }
        System.out.print("Total price order: " + totalOrderPrice +" EUR");
    }

    public void printPaymentInstruction() {
        printOrder();
        System.out.println(" will be paid from account 2511....01.EUR");
    }

}
