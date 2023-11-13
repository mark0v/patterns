public class SlackNotificationAdapter implements Notification {
    private SlackNotification slackNotification;

    public SlackNotificationAdapter(SlackNotification slackNotification) {
        this.slackNotification = slackNotification;
    }

    @Override
    public void send(String title, String message) {
        slackNotification.sendMessage(title, message);
    }
}
