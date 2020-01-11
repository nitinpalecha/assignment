package q1;

public class Invoice {

	String invoice_number;
	double[] item_price;
	long total_number_of_items;
	double total_invoice_bill_amount;
	public Invoice() {
		super();
	}
	public Invoice(String invoice_number, double[] item_price) {
		super();
		this.invoice_number = invoice_number;
		this.item_price = item_price;
	}
	public Invoice(String invoice_number, double[] item_price,
			long total_number_of_items, double total_invoice_bill_amount) {
		super();
		this.invoice_number = invoice_number;
		this.item_price = item_price;
		this.total_number_of_items = total_number_of_items;
		this.total_invoice_bill_amount = total_invoice_bill_amount;
	}
	
	
	public double calculate_total_amount(){
		
		
		double sum=0.0;
		
		for(int i=0;i<item_price.length;i++){
			sum=sum+this.item_price[i];
		}
		
		
		if(sum < 0){
			throw new IllegalArgumentException("Total price is negative......yoooooo");
		}
		return sum;
	}
	
	
}
