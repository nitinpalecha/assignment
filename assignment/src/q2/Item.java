package q2;

public class Item {

	String product_bar_code;
	String product_brand_name;
	double price;
	double net_price;
	
	public Item() {
		super();
	}
	
	//overload constructor
	public Item(String product_bar_code, String product_brand_name, double price) {
		super();
		this.product_bar_code = product_bar_code;
		this.product_brand_name = product_brand_name;
		this.price = price;
	}
	
 
	
	public double calculate_net_price(double prices){
		
		double total_price=prices;
		if(prices > 200){
			
			double discount=0.05*prices;
			total_price=total_price-discount;
		}else if(prices > 500){
			double discount=0.10*prices;
			total_price=total_price-discount;
		}
		
		return total_price;
	}
	
	
	
	public static void main(String[] args) {
		
		Item item=new Item();
		System.out.println("199: "+item.calculate_net_price(199));
		System.out.println("200: "+item.calculate_net_price(200));
		System.out.println("201: "+item.calculate_net_price(201));// greater than 200 discount applied
		System.out.println("499: "+item.calculate_net_price(499));
		System.out.println("500: "+item.calculate_net_price(500));
		System.out.println("501: "+item.calculate_net_price(501));// greater than 500 discount applied
		
	}
}
