package Weeek1;

public class Day5 {
    public static void main(String[] args) {

        String rawText = "Your order has been successfully processed!\n" +
                "Order number: 1020315\n" +
                "Click here for order details.";

        //System.out.println(rawText);
        String[] rawText2 = rawText.split("Order number");
        String secondPartText = rawText2[1];

        String[] rawOrderNum = secondPartText.split("Click here");
        System.out.println("rawOrderNum[0]");

        String orderNum = rawOrderNum[0].trim();
        System.out.println(orderNum);




    }
}
