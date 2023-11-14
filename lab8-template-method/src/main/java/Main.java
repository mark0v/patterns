public class Main {
    public static void main(String[] args) {
        EntityProcessor productProcessor = new ProductProcessor();
        EntityProcessor userProcessor = new UserProcessor();
        EntityProcessor orderProcessor = new OrderProcessor();

        Product product = new Product();
        User user = new User();
        Order order = new Order();

        Response productResponse = productProcessor.updateEntity(product);
        System.out.println("Product Update: " + productResponse.getMessage() + " with status code " + productResponse.getStatusCode());

        Response userResponse = userProcessor.updateEntity(user);
        System.out.println("User Update: " + userResponse.getMessage() + " with status code " + userResponse.getStatusCode());

        Response orderResponse = orderProcessor.updateEntity(order);
        System.out.println("Order Update: " + orderResponse.getMessage() + " with status code " + orderResponse.getStatusCode());
    }
}
