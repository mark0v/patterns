public class SMSNotification {
    private String phone;
    private String sender;

    public SMSNotification(String phone, String sender) {
        this.phone = phone;
        this.sender = sender;
    }

    public void sendSMS(String message) {
        // Логіка відправлення SMS
    }
}
