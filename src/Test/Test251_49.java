package Test;
class Connection {
	private static Connection _inst = null;
	private int count = 0;
	public static Connection get() {
		if(_inst ==null) {
			_inst = new Connection();
			return _inst;
		}
		return _inst;
	}
	public void count() {count++;}
	public int getCount() {return count;}
}
public class Test251_49 {
	public static void main(String[] args) {
		Connection conn1 = Connection.get();
		conn1.count();
		Connection conn2 = Connection.get();
		conn2.count();
		Connection conn3 = Connection.get();
		conn3.count();
		System.out.print(conn1.getCount());
	}
}
