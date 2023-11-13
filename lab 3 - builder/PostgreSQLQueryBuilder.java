public class PostgreSQLQueryBuilder implements QueryBuilder {
    private StringBuilder query = new StringBuilder();

    @Override
    public QueryBuilder select(String fields) {
        query.append("SELECT ").append(fields);
        return this;
    }

    @Override
    public QueryBuilder where(String condition) {
        query.append(" WHERE ").append(condition);
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        query.append(" LIMIT ").append(limit);
        return this;
    }

    @Override
    public String getSQL() {
        return query.toString();
    }
}
