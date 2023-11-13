// Main.java
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Storage storage = Storage.getInstance();

        // User sets their preferred storage type to Amazon S3
        user.setPreferredStorageType(Storage.StorageType.AMAZON_S3);

        // User chooses the storage
        user.chooseStorage(storage);

        // Perform file operations
        user.uploadFile("example.txt");
        user.downloadFile("example.txt");
    }
}
