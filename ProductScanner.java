import java.util.Scanner;

class ProductStore{
	String itemName;
	float price;
}


public class ProductScan {

	public static void main(String[] args) {
		Scanner products = new Scanner(System.in);
		Scanner items = new Scanner(System.in);
		Scanner Price = new Scanner(System.in);
		float tax = (float) 0.075;
		
		System.out.print("How many products would you like to enter today?: ");
		float productNum = products.nextFloat();
		int productNumInt = (int) productNum;
		
		ProductStore[] productArray = new ProductStore[productNumInt];
		
		for (int count1 = 0; count1 < productNum; count1++){
			productArray[count1] = new ProductStore();
			
			System.out.print("Item Name: ");
			String productName = items.nextLine();
			productArray[count1].itemName = productName;
			
			System.out.print("Price: ");
			float itemPrice = Price.nextFloat();
			productArray[count1].price = itemPrice;
		}
		
		float total = 0;
		
		for (int count2 = 0; count2 < productNum; count2++){
			total += productArray[count2].price;
		}
		
		tax = total * tax;
		tax = (float)Math.round(tax * 100) / 100;
		
		float grandTotal = total + tax;
		grandTotal = (float)Math.round(grandTotal * 100) / 100;
		
		System.out.println("Subtotal: " + total);
		System.out.println("Tax: " + tax);
		System.out.print("Grand Total: " + grandTotal);
		
	}
}
