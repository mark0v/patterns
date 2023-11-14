import java.util.HashMap;
import java.util.Map;

public class CachingDownloaderProxy implements Downloader {
    private SimpleDownloader downloader;
    private Map<String, String> cache;

    public CachingDownloaderProxy() {
        this.downloader = new SimpleDownloader();
        this.cache = new HashMap<>();
    }

    @Override
    public void download(String fileUrl) {
        if (cache.containsKey(fileUrl)) {
            System.out.println("Loading from cache: " + fileUrl);
        } else {
            downloader.download(fileUrl);
            cache.put(fileUrl, "Cached content for " + fileUrl);
            System.out.println("Cached file: " + fileUrl);
        }
    }
}
