public class HTMLRenderer implements Renderer {
    @Override
    public String renderTitle(String title) {
        return "<h1>" + title + "</h1>";
    }

    @Override
    public String renderTextBlock(String text) {
        return "<p>" + text + "</p>";
    }

    @Override
    public String renderImage(String url) {
        return "<img src=\"" + url + "\"/>";
    }

    @Override
    public String renderLink(String href, String title) {
        return "<a href=\"" + href + "\">" + title + "</a>";
    }
    // Інші методи рендерингу...
}
