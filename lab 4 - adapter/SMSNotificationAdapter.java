public class SMSNotificationAdapter implements Notification {
    private SMSNotification smsNotification;

    public SMSNotificationAdapter(SMSNotification smsNotification) {
        this.smsNotification = smsNotification;
    }

    @Override
    public void send(String title, String message) {
        smsNotification.sendSMS(message);
    }
}
