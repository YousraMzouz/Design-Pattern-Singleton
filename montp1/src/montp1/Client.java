package montp1;

public class Client {
	int id;
	
public Client(int id) {
	this.id = id;
}	
	
	 public void creer() {
		   Terre j = Terre.getInstance();
            System.out.println(j.s);

	   }

	public static void main( String[] args) {
		
		Client C1= new Client(112);
		Client C2= new Client(113);
		C1.creer();
		C2.creer();
}
}