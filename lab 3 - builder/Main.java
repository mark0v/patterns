public class Main {
    public static void main(String[] args) {
        QueryBuilder postgreSQLQuery = new PostgreSQLQueryBuilder()
                .select("*")
                .where("id = 1")
                .limit(10);

        System.out.println("PostgreSQL Query: " + postgreSQLQuery.getSQL());

        QueryBuilder mySQLQuery = new MySQLQueryBuilder()
                .select("name, age")
                .where("age > 18")
                .limit(5);

        System.out.println("MySQL Query: " + mySQLQuery.getSQL());
    }
}
