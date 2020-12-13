package chapter6;

public class ConnectionManager {
	private static Connection[] connPool = new Connection[5];
    private static int counter = 0;

    static {
        for (int i = 0; i < connPool.length; i++) {
            connPool[i] = new Connection();
        }
    }

    public static Connection getConnection() {
        if (counter < connPool.length) {
            return connPool[counter++];
        }

        return null;
    }
}
class Connection {
	//private Connection() {};
	private static Connection c = new Connection();
	public static Connection access() {
		return c;
	}
}