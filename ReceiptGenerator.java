import java.util.Scanner;

@SuppressWarnings("resource")
public class TableCalc {

	
	public static void main(String[] args) {
		
		String print = "Y";
		float taxConstant = (float) 7.5;
		
		System.out.println("Enter the first item name: ");
		Scanner firstItem = new Scanner(System.in);
		String item1 = firstItem.nextLine();
		System.out.println("And " + item1 + " costs (Enter only the value): ");
		Scanner firstCost = new Scanner(System.in);
		float cost1 = firstCost.nextFloat();
		
		System.out.println(item1 + ": " + cost1 + ".");
		
		System.out.println("Hit any letter to print receipt or hit Y to continue: ");
		Scanner firstRequest = new Scanner(System.in);
		String request1 = firstRequest.nextLine();
		if (request1.equalsIgnoreCase(print)){
			
			System.out.println("Enter the second item name: ");
			Scanner secondItem = new Scanner(System.in);
			String item2 = secondItem.nextLine();
			System.out.println("And " + item2 + " costs (Enter only the value): ");
			Scanner secondCost = new Scanner(System.in);
			float cost2 = secondCost.nextFloat();
			
			System.out.println(item2 + ": " + cost2 + ".");
			System.out.println("Hit any letter to print receipt or hit Y to continue: ");
			Scanner secondRequest = new Scanner(System.in);
			String request2 = secondRequest.nextLine();
			if (request2.equalsIgnoreCase(print)){
				
				System.out.println("Enter the third item name: ");
				Scanner thirdItem = new Scanner(System.in);
				String item3 = thirdItem.nextLine();
				System.out.println("And " + item3 + " costs (Enter only the value): ");
				Scanner thirdCost = new Scanner(System.in);
				float cost3 = thirdCost.nextFloat();
				
				System.out.println(item3 + ": " + cost3 + ".");
				System.out.println("Hit any letter to print receipt or hit Y to continue: ");
				Scanner thirdRequest = new Scanner(System.in);
				String request3 = thirdRequest.nextLine();
				if (request3.equalsIgnoreCase(print)){
					
					System.out.println("Enter the fourth item name: ");
					Scanner fourthItem = new Scanner(System.in);
					String item4 = fourthItem.nextLine();
					System.out.println("And " + item4 + " costs (Enter only the value): ");
					Scanner fourthCost = new Scanner(System.in);
					float cost4 = fourthCost.nextFloat();
					
					System.out.println(item4 + ": " + cost4 + ".");
					System.out.println("Hit any letter to print receipt or hit Y to continue: ");
					Scanner fourthRequest = new Scanner(System.in);
					String request4 = fourthRequest.nextLine();
					if (request4.equalsIgnoreCase(print)){
						
						System.out.println("Enter the fifth item name: ");
						Scanner fifthItem = new Scanner(System.in);
						String item5 = fifthItem.nextLine();
						System.out.println("And " + item5 + " costs (Enter only the value): ");
						Scanner fifthCost = new Scanner(System.in);
						float cost5 = fifthCost.nextFloat();
						
						System.out.println(item5 + ": " + cost5 + ".");
						System.out.println("Hit any letter to print receipt or hit Y to continue: ");
						Scanner fifthRequest = new Scanner(System.in);
						String request5 = fifthRequest.nextLine();
						if (request5.equalsIgnoreCase(print)){
							
							System.out.println("Enter the sixth item name: ");
							Scanner sixthItem = new Scanner(System.in);
							String item6 = sixthItem.nextLine();
							System.out.println("And " + item6 + " costs (Enter only the value): ");
							Scanner sixthCost = new Scanner(System.in);
							float cost6 = sixthCost.nextFloat();
							
							System.out.println(item6 + ": " + cost6 + ".");
							System.out.println("Hit any letter to print receipt or hit Y to continue: ");
							Scanner sixthRequest = new Scanner(System.in);
							String request6 = sixthRequest.nextLine();
							if (request6.equals(print)){
								
								
							}else{
								receipt6(item1, item2, item3, item4, item5, item6, cost1, cost2, cost3, cost4, cost5, cost6, taxConstant);
							}
						}else{
							receipt5(item1, item2, item3, item4, item5, cost1, cost2, cost3, cost4, cost5, taxConstant);
						}
					}else{
						receipt4(item1, item2, item3, item4, cost1, cost2, cost3, cost4, taxConstant);
					}
				}else{
					receipt3(item1, item2, item3, cost1, cost2, cost3, taxConstant);
				}
			
			}else{
				receipt2(item1, item2, cost1, cost2, taxConstant);	
			}
			
		}else{
			receipt1(item1, cost1, taxConstant);
		}
		
			
	}
	
	static void receipt1(String item1, float cost1, float taxConstant){
		System.out.print("How much tip would you like to give? (Enter only the value): ");
		Scanner tipConstant = new Scanner(System.in);
		
		float tipRaw = tipConstant.nextFloat() / 100;
		float taxValue = (taxConstant / 100) + 1;
		float totalCost = cost1 * taxValue;
		float finalTotalraw = totalCost * (++tipRaw);
		float taxRaw = (taxConstant / 100) * cost1;
		float tipFinal = totalCost * tipRaw;
		
		String tax = String.format("%.2f", taxRaw);
		String finalTotal = String.format("%.2f", finalTotalraw);
		String tip = String.format("%.2f", tipFinal);
		
		System.out.println("Here is your receipt:");
		System.out.println(item1 + "........................." + cost1);
		System.out.println("Total: " + cost1);
		System.out.println("Tax: " + tax);
		System.out.println("Tip: " + tip);
		System.out.println("Grand Total: " + finalTotal);
		System.out.print("Have a nice day!");
		
	}
	
	static void receipt2(String item1, String item2, float cost1, float cost2, float taxConstant){
		System.out.print("How much tip would you like to give? (Enter only the value): ");
		Scanner tipConstant = new Scanner(System.in);
		
		float tipRaw = tipConstant.nextFloat() / 100;
		float taxValue = (taxConstant / 100) + 1;
		float totalCost1 = cost1 * taxValue;
		float totalCost2 = cost2 * taxValue;
		float subtotalRaw = cost1 + cost2;
		float finalTotalraw = (totalCost1 + totalCost2) * (++tipRaw);
		float tipFinal = (totalCost1 + totalCost2) * tipRaw;
		float taxRaw = (taxConstant / 100) * subtotalRaw;
		
		String subtotal = String.format("%.2f", subtotalRaw);
		String finalTotal = String.format("%.2f", finalTotalraw);
		String tax = String.format("%.2f", taxRaw);
		String tip = String.format("%.2f", tipFinal);
		
		System.out.println("Here is your receipt:");
		System.out.println(item1 + "........................." + cost1);
		System.out.println(item2 + "........................." + cost2);
		System.out.println("Total: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Tip: " + tip);
		System.out.println("Grand Total: " + finalTotal);
		System.out.print("Have a nice day!");
	
	}

	static void receipt3(String item1, String item2, String item3, float cost1, float cost2, float cost3, float taxConstant){
		System.out.print("How much tip would you like to give? (Enter only the value): ");
		Scanner tipConstant = new Scanner(System.in);
		
		float tipRaw = tipConstant.nextFloat() / 100;
		float taxValue = (taxConstant / 100) + 1;
		float totalCost1 = cost1 * taxValue;
		float totalCost2 = cost2 * taxValue;
		float totalCost3 = cost3 * taxValue;
		float subtotalRaw = cost1 + cost2 + cost3;
		float finalTotalraw = (totalCost1 + totalCost2 + totalCost3) * (++tipRaw);
		float tipFinal = (totalCost1 + totalCost2 + totalCost3) * tipRaw;
		float taxRaw = (taxConstant / 100) * subtotalRaw;
		
		String subtotal = String.format("%.2f", subtotalRaw);
		String finalTotal = String.format("%.2f", finalTotalraw);
		String tax = String.format("%.2f", taxRaw);
		String tip = String.format("%.2f", tipFinal);
		
		System.out.println("Here is your receipt:");
		System.out.println(item1 + "........................." + cost1);
		System.out.println(item2 + "........................." + cost2);
		System.out.println(item3 + "........................." + cost3);
		System.out.println("Total: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Tip: " + tip);
		System.out.println("Grand Total: " + finalTotal);
		System.out.print("Have a nice day!");
	}
	
	static void receipt4(String item1, String item2, String item3, String item4, float cost1, float cost2, float cost3, float cost4, float taxConstant){
		System.out.print("How much tip would you like to give? (Enter only the value): ");
		Scanner tipConstant = new Scanner(System.in);
		
		float tipRaw = tipConstant.nextFloat() / 100;
		float taxValue = (taxConstant / 100) + 1;
		float totalCost1 = cost1 * taxValue;
		float totalCost2 = cost2 * taxValue;
		float totalCost3 = cost3 * taxValue;
		float totalCost4 = cost4 * taxValue;
		float subtotalRaw = cost1 + cost2 + cost3 + cost4;
		float finalTotalraw = (totalCost1 + totalCost2 + totalCost3 + totalCost4) * (++tipRaw);
		float tipFinal = (totalCost1 + totalCost2 + totalCost3 + totalCost4) * tipRaw;
		float taxRaw = (taxConstant / 100) * subtotalRaw;
		
		String subtotal = String.format("%.2f", subtotalRaw);
		String finalTotal = String.format("%.2f", finalTotalraw);
		String tax = String.format("%.2f", taxRaw);
		String tip = String.format("%.2f", tipFinal);
		
		System.out.println("Here is your receipt:");
		System.out.println(item1 + "........................." + cost1);
		System.out.println(item2 + "........................." + cost2);
		System.out.println(item3 + "........................." + cost3);
		System.out.println(item4 + "........................." + cost4);
		System.out.println("Total: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Tip: " + tip);
		System.out.println("Grand Total: " + finalTotal);
		System.out.print("Have a nice day!");
	}
	
	static void receipt5(String item1, String item2, String item3, String item4, String item5, float cost1, float cost2, float cost3, float cost4, float cost5, float taxConstant){
		System.out.print("How much tip would you like to give? (Enter only the value): ");
		Scanner tipConstant = new Scanner(System.in);
		
		float tipRaw = tipConstant.nextFloat() / 100;
		float taxValue = (taxConstant / 100) + 1;
		float totalCost1 = cost1 * taxValue;
		float totalCost2 = cost2 * taxValue;
		float totalCost3 = cost3 * taxValue;
		float totalCost4 = cost4 * taxValue;
		float totalCost5 = cost5 * taxValue;
		float subtotalRaw = cost1 + cost2 + cost3 + cost4 + cost5;
		float finalTotalraw = (totalCost1 + totalCost2 + totalCost3 + totalCost4 + totalCost5) * (++tipRaw);
		float tipFinal = (totalCost1 + totalCost2 + totalCost3 + totalCost4 + totalCost5) * tipRaw;
		float taxRaw = (taxConstant / 100) * subtotalRaw;
		
		String subtotal = String.format("%.2f", subtotalRaw);
		String finalTotal = String.format("%.2f", finalTotalraw);
		String tax = String.format("%.2f", taxRaw);
		String tip = String.format("%.2f", tipFinal);
		
		System.out.println("Here is your receipt:");
		System.out.println(item1 + "........................." + cost1);
		System.out.println(item2 + "........................." + cost2);
		System.out.println(item3 + "........................." + cost3);
		System.out.println(item4 + "........................." + cost4);
		System.out.println(item5 + "........................." + cost5);
		System.out.println("Total: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Tip: " + tip);
		System.out.println("Grand Total: " + finalTotal);
		System.out.print("Have a nice day!");
	}
	
	static void receipt6(String item1, String item2, String item3, String item4, String item5, String item6, float cost1, float cost2, float cost3, float cost4, float cost5, float cost6, float taxConstant){
		System.out.print("How much tip would you like to give? (Enter only the value): ");
		Scanner tipConstant = new Scanner(System.in);
		
		float tipRaw = tipConstant.nextFloat() / 100;
		float taxValue = (taxConstant / 100) + 1;
		float totalCost1 = cost1 * taxValue;
		float totalCost2 = cost2 * taxValue;
		float totalCost3 = cost3 * taxValue;
		float totalCost4 = cost4 * taxValue;
		float totalCost5 = cost5 * taxValue;
		float totalCost6 = cost6 *taxValue;
		float subtotalRaw = cost1 + cost2 + cost3 + cost4 + cost5 + cost6;
		float finalTotalraw = (totalCost1 + totalCost2 + totalCost3 + totalCost4 + totalCost5 + totalCost6) * (tipRaw + 1);
		float tipFinal = (totalCost1 + totalCost2 + totalCost3 + totalCost4 + totalCost5 + totalCost6) * tipRaw;
		float taxRaw = (taxConstant / 100) * subtotalRaw;
		
		String subtotal = String.format("%.2f", subtotalRaw);
		String finalTotal = String.format("%.2f", finalTotalraw);
		String tax = String.format("%.2f", taxRaw);
		String tip = String.format("%.2f", tipFinal);
		
		System.out.println("Here is your receipt:");
		System.out.println(item1 + "........................." + cost1);
		System.out.println(item2 + "........................." + cost2);
		System.out.println(item3 + "........................." + cost3);
		System.out.println(item4 + "........................." + cost4);
		System.out.println(item5 + "........................." + cost5);
		System.out.println(item6 + "........................." + cost6);
		System.out.println("Total: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Tip: " + tip);
		System.out.println("Grand Total: " + finalTotal);
		System.out.print("Have a nice day!");
	}
	
}
