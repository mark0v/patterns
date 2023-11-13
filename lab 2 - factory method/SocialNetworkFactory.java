public class SocialNetworkFactory {
    public enum NetworkType {
        FACEBOOK, LINKEDIN
    }

    public static SocialNetwork createNetwork(NetworkType type, String username, String password) {
        switch (type) {
            case FACEBOOK:
                return new Facebook(username, password);
            case LINKEDIN:
                return new LinkedIn(username, password);
            default:
                throw new IllegalArgumentException("Unknown social network type");
        }
    }
}
