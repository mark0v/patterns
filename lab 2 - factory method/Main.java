public class Main {
    public static void main(String[] args) {
        SocialNetwork facebook = SocialNetworkFactory.createNetwork(SocialNetworkFactory.NetworkType.FACEBOOK, "user_facebook", "password123");
        SocialNetwork linkedIn = SocialNetworkFactory.createNetwork(SocialNetworkFactory.NetworkType.LINKEDIN, "user_email@example.com", "password456");

        facebook.postMessage("Hello Facebook!");
        linkedIn.postMessage("Hello LinkedIn!");
    }
}
