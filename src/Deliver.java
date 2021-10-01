
public class Deliver implements SoupOrderState
{

	Soup soup;
	
	public Deliver(Soup soup) {
		this.soup = soup;
	}

	@Override
	public void start() {
		System.out.println("Your order will deliver soon");	

	}

	@Override
	public void stop() {
		System.out.println("Your order has deliverd!!!");	

	}

	
}
