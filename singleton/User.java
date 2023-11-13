// User.java
public class User {
    private Storage chosenStorage;
    private Storage.StorageType preferredStorageType;

    public User() {
        this.chosenStorage = null;
        this.preferredStorageType = Storage.StorageType.LOCAL_DISK;
    }

    public void setPreferredStorageType(Storage.StorageType storageType) {
        this.preferredStorageType = storageType;
    }

    public void chooseStorage(Storage storage) {
        this.chosenStorage = storage;
        this.chosenStorage.setStorageType(preferredStorageType);
    }

    public void uploadFile(String fileName) {
        if (this.chosenStorage != null) {
            this.chosenStorage.uploadFile(fileName);
        }
    }

    public void downloadFile(String fileName) {
        if (this.chosenStorage != null) {
            this.chosenStorage.downloadFile(fileName);
        }
    }
}
