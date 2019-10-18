package assesment3;
import java.util.*;
public class Manage {
	int sid=100;
	List<Stock> stocks=new ArrayList<>();
	public void addnew(String name, float price, int quantity) {
		Stock p=new Stock(sid,name,price,quantity);
		sid++;
		stocks.add(p);
	}
	public void viewitem(Stock s){
		System.out.println("----------------------------------------------------------------------------------------------------");
	
		System.out.printf("%70s\n","DETAILS OF item");
		System.out.println("----------------------------------------------------------------------------------------------------");
	
		System.out.printf("Item ID : %-30s Item Name : %-1s\n",String.valueOf(s.getId()),s.getItems());
		System.out.printf("price",s.getPrice());
		System.out.printf("Quantity",s.getQuantity());
	
	
	}
	private void removeitem(Stock p) {

		ArrayList<Stock> pp=new ArrayList<>();
		stocks.remove(p);
		System.out.println("item removed Successfully!!!");
	}
	
	private void updateitem(int upp) {
		Scanner b=new Scanner(System.in);
		System.out.println("Name of item : ");
		String name=b.nextLine();
		
		System.out.println("price of item : ");
		Float price=b.nextFloat();
		
		System.out.println("Quantity of item : ");
		int quantity=b.nextInt();
		
		for(Stock p:stocks) {
			if(p.getId()==upp) {
				p.setItem(name);
				p.setPrice(price);
				p.setQuantity(quantity);
		System.out.println("Details of item updated successfully");
			}
		}
	}



	public static void main(String[] args) {
		Manage m=new Manage();
	
		Scanner sc=new Scanner(System.in);
		int input=-1;
		do {
			System.out.println("\n");
			System.out.println("Press 1 to Enter new item details");
			System.out.println("Press 2 to get itmes present in the list");
			System.out.println("Press 3 to update item details");
			System.out.println("Press 4 to delete item details");
			System.out.println("Press 5 to search the item");
			System.out.println("\n");
			System.out.println("Please enter your option");
			input=sc.nextInt();
			sc.nextLine();
			switch(input) {
			case 1:
					System.out.println("Name of item : ");
					String name = sc.nextLine();
					System.out.println("price of item : ");
					float price=sc.nextFloat();
					System.out.println("quantity of the item : ");
					int quantity=sc.nextInt();
					m.addnew(name,price,quantity);
					break;
					
			case 2: System.out.printf("The present in the list");
					for(Stock pat:m.stocks) {
						m.viewitem(pat);
					}
					break;
			case 4: System.out.println("To update item details");
					System.out.println("Enter Id of person to update");
							int upp=sc.nextInt();
							sc.nextLine();
							m.updateitem(upp);
			case 5: System.out.println(" To delete item details");
							int remp=sc.nextInt();
							for(Stock pati:m.stocks) {
								if(pati.getId()==remp) {m.removeitem(pati);}
							}
							break;
					
			case 6 :System.out.println("To Search by item name");
							String names=sc.nextLine();
							boolean there=true;
							for(Stock pati:m.stocks) {
								if(pati.getItems().equals(names)) {m.viewitem(pati);there=false;}
							}
							if(there) {System.out.println("There is no data of item with that name");}
			case 0 : input=0; 
			default: System.out.println("Please enter valid option");
					
			}
		}while(input!=0);
	}
}
	