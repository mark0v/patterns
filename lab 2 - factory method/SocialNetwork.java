public abstract class SocialNetwork {
    protected String username;
    protected String password;

    public SocialNetwork(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract void postMessage(String message);
}
