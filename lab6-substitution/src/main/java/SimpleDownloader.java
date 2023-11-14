public class SimpleDownloader implements Downloader {
    @Override
    public void download(String fileUrl) {
        // Логіка завантаження файлу з URL
        System.out.println("Downloading file from: " + fileUrl);
    }
}
