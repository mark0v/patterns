// Storage.java
public class Storage {
    private static Storage instance;
    private StorageType currentStorageType;

    public enum StorageType {
        LOCAL_DISK, AMAZON_S3
    }

    private Storage() {
        // Set default storage type, can be changed later
        this.currentStorageType = StorageType.LOCAL_DISK;
    }

    public static synchronized Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public void setStorageType(StorageType storageType) {
        this.currentStorageType = storageType;
    }

    public void uploadFile(String fileName) {
        switch (currentStorageType) {
            case LOCAL_DISK:
                // Implementation for uploading to local disk
                break;
            case AMAZON_S3:
                // Implementation for uploading to Amazon S3
                break;
        }
    }

    public void downloadFile(String fileName) {
        switch (currentStorageType) {
            case LOCAL_DISK:
                // Implementation for downloading from local disk
                break;
            case AMAZON_S3:
                // Implementation for downloading from Amazon S3
                break;
        }
    }
}
