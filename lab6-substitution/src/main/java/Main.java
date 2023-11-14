public class Main {
    public static void main(String[] args) {
        Downloader downloader = new CachingDownloaderProxy();

        // Перше завантаження файлу
        downloader.download("http://example.com/file1");

        // Повторне завантаження того самого файлу
        downloader.download("http://example.com/file1");

        // Завантаження іншого файлу
        downloader.download("http://example.com/file2");
    }
}
