public class ProductProcessor extends EntityProcessor {
    @Override
    protected boolean validateData(Object entity) {
        // Специфічна для продукту логіка перевірки
        return true;
    }

    @Override
    protected Response handleValidationError(Object entity) {
        // Повідомити адміністратора у разі помилки підтвердження
        // Приклад: sendNotificationToAdmin();
        return new Response("Validation Error", 400);
    }

    @Override
    protected void prepareRequest(Object entity) {
        // Підготовка запиту на оновлення продукту
    }

    @Override
    protected Response performUpdate(Object entity) {
        // Оновити продукт і створити відповідь
        return new Response("Product Updated", 200);
    }
}
