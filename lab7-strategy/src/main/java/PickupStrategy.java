public class PickupStrategy implements DeliveryStrategy {
    @Override
    public double calculateCost(Order order) {
        // Вартість самовивозу може бути фіксованою або нульовою
        return 0;
    }
}
