// User.java
public class User {
    private Storage chosenStorage;

    public User() {
        this.chosenStorage = null;
    }

    public void chooseStorage(Storage storage) {
        this.chosenStorage = storage;
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
