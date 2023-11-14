public abstract class EntityProcessor {
    public final Response updateEntity(Object  entity) {
        if (!validateData(entity)) {
            return handleValidationError(entity);
        }

        prepareRequest(entity);
        Response response = performUpdate(entity);
        postUpdateHook(entity, response);
        return response;
    }

    protected abstract boolean validateData(Object entity);

    protected abstract Response handleValidationError(Object entity);

    protected abstract void prepareRequest(Object entity);

    protected abstract Response performUpdate(Object entity);

    protected void postUpdateHook(Object entity, Response response) {
    }
}
