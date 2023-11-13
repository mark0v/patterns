public class JsonRenderer implements Renderer {
    @Override
    public String renderTitle(String title) {
        return "{\"title\": \"" + title + "\"}";
    }

    @Override
    public String renderTextBlock(String text) {
        return "{\"text\": \"" + text + "\"}";
    }

    @Override
    public String renderImage(String url) {
        return "{\"image\": \"" + url + "\"}";
    }

    @Override
    public String renderLink(String href, String title) {
        return "{\"link\": {\"href\": \"" + href + "\", \"title\": \"" + title + "\"}}";
    }
    // Інші методи рендерингу...
}
