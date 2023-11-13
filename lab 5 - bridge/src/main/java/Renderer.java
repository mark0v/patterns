public interface Renderer {
    String renderTitle(String title);
    String renderTextBlock(String text);
    String renderImage(String url);
    String renderLink(String href, String title);
    // Інші методи рендерингу...
}
