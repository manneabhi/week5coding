public class SoupMainClass {

	public static void main(String[] args) {
	
		Soup soup = new Soup();
		System.out.println(soup);
		soup.setSs(new Order(soup));
		soup.start();
		
		soup.setSs(new Packed(soup));	
		soup.start();
		soup.stop();
		
		soup.setSs(new Deliver(soup));	
		soup.start();
		soup.stop();
		
		soup.setSs(new Order(soup));
		soup.stop();
		
	}
}
