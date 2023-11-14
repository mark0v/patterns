public class Response {
    private String message;
    private int statusCode;

    public Response(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return "Message";
    }

    public String getStatusCode() {
        return "200";
    }

    // Геттери та сетери
}
