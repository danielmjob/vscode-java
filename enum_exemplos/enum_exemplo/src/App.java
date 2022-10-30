import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        
        Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println();
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED; // Formato enum
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // Formato String

        System.out.println();
        System.out.println(os1); // enum
        System.out.println(os2); // String

    }
}
