package factorypattern;
public class ConnectionTest {
	public static void main(String[] args) {
		ConnectionFactory factory=new ConnectionFactory();
		Connection db=factory.getConnection (args[0]);
		db.connect();		
		
		//"ORACLE://127.0.0.1:5000"
/*		Connection mysql= factory.getConnection("MYSQL://127.0.0.1:5000");
		mysql.connect();*/	
	}
}
