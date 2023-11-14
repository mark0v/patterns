public class Main {
    public static void main(String[] args) {
        Order order = new Order(5); // Встановлення ваги замовлення

        DeliveryStrategy pickup = new PickupStrategy();
        DeliveryStrategy externalDelivery = new ExternalDeliveryStrategy();
        DeliveryStrategy inHouseDelivery = new InHouseDeliveryStrategy();

        System.out.println("Pickup Cost: " + pickup.calculateCost(order));
        System.out.println("External Delivery Cost: " + externalDelivery.calculateCost(order));
        System.out.println("In-House Delivery Cost: " + inHouseDelivery.calculateCost(order));
    }
}
