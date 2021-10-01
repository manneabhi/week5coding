
public class Soup {

	SoupOrderState order;
	SoupOrderState pack;
	SoupOrderState deliver;

	
	SoupOrderState ss;
    int count = 0;
    
    public Soup()
    {
    	order = new Order(this);
    	pack = new Packed(this);
    	deliver = new Deliver(this);    
    	
    	ss = order;
    }
    

	public void start() {

		ss.start();
	}

	public void stop() {

		ss.stop();
	}

	public SoupOrderState getSs() {
		return ss;
	}

	public void setSs(SoupOrderState ss) {
		this.ss = ss;
	}

	public SoupOrderState getOrder() {
		return order;
	}
	
	public SoupOrderState getPack() {
		return pack;
	}

	public SoupOrderState getDeliver() {
		return deliver;
	}

	public int getCount() {
		return count;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nWelcome to Online Soup Order ");
		if (count != 1) {
			result.append("");
		}
		result.append("\n");
		return result.toString();
	}
	
}
