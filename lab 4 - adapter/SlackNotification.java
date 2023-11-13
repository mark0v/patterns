public class SlackNotification {
    private String login;
    private String apiKey;
    private String chatId;

    public SlackNotification(String login, String apiKey, String chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    public void sendMessage(String title, String message) {
        // Логіка відправлення повідомлення у Slack
    }
}
