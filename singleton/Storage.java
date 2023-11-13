// Storage.java
public class Storage {
    private static Storage instance;

    private Storage() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public void uploadFile(String fileName) {
        // Implementation for uploading a file
    }

    public void downloadFile(String fileName) {
        // Implementation for downloading a file
    }
}
