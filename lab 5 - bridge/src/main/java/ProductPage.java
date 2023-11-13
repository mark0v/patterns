public class ProductPage extends Page {
    private final Product product;

    public ProductPage(Renderer renderer, Product product) {
        super(renderer);
        this.product = product;
    }

    @Override
    public String view() {
        String view = renderer.renderTitle(product.getName());
        view += renderer.renderTextBlock(product.getDescription());
        view += renderer.renderImage(product.getImageUrl());
        return view;
    }
}
