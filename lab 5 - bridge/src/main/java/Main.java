public class Main {
    public static void main(String[] args) {
        Renderer htmlRenderer = new HTMLRenderer();
        Renderer jsonRenderer = new JsonRenderer();

        Page simplePage = new SimplePage(htmlRenderer, "Simple Title", "Simple Content");
        System.out.println(simplePage.view());

        Product product = new Product(/* ініціалізація продукту */);
        Page productPage = new ProductPage(jsonRenderer, product);
        System.out.println(productPage.view());

        // Можна змінювати Renderer у рантаймі
        productPage = new ProductPage(htmlRenderer, product);
        System.out.println(productPage.view());
    }
}
