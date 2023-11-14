public class ExternalDeliveryStrategy implements DeliveryStrategy {
    @Override
    public double calculateCost(Order order) {
        // Розрахунок вартості для доставки зовнішньою службою
        return order.getWeight() * 1.5;// Приклад розрахунку
    }
}
