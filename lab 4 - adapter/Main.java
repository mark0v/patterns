public class Main {
    public static void main(String[] args) {
        Notification emailNotifier = new EmailNotification("admin@example.com");
        emailNotifier.send("Title", "Email Message");

        SlackNotification slack = new SlackNotification("login", "apiKey", "chatId");
        Notification slackNotifier = new SlackNotificationAdapter(slack);
        slackNotifier.send("Title", "Slack Message");

        SMSNotification sms = new SMSNotification("123456789", "Sender");
        Notification smsNotifier = new SMSNotificationAdapter(sms);
        smsNotifier.send("Title", "SMS Message");
    }
}
