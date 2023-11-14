public class InHouseDeliveryStrategy implements DeliveryStrategy {
    @Override
    public double calculateCost(Order order) {
        // Розрахунок вартості для доставки власною службою
        return order.getWeight() * 1.0; // Приклад розрахунку
    }
}
