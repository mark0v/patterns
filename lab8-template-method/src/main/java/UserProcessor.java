public class UserProcessor extends EntityProcessor {
    @Override
    protected boolean validateData(Object entity) {
        // Специфічна логіка перевірки (перевірте поле електронної пошти)
        return true;
    }

    @Override
    protected Response handleValidationError(Object entity) {
        return new Response("Validation Error", 400);
    }

    @Override
    protected void prepareRequest(Object entity) {
        // Готуємо запит на оновлення користувача
    }

    @Override
    protected Response performUpdate(Object entity) {
        // Оновити користувача та створити відповідь
        return new Response("User Updated", 200);
    }
}
