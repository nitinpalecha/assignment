package q1;

public class InvoiceApplication {

	
	public static void main(String[] args) {
		
		double[] item_price={0.0,19.2,23.4,5656.3};
		Invoice invoice=new Invoice("S1AB23",item_price );
		System.out.println(invoice.calculate_total_amount());
		
		
		double[] item_price2={-10.0,-119.2,-123.4,-15656.3};
		Invoice invoice2=new Invoice("djmitin",item_price2 );
		System.out.println(invoice2.calculate_total_amount());
	}
}
