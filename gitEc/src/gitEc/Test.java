package gitEc;

public class Test {
	String description;
	double price;
	String size = "m";
	// double tax;

	public static void main(String[] args) {
		double tax = 0.2;
		double total = 0.0;

		System.out.println("hi welcome to the shopping");
		Customer c1 = new Customer();
		c1.name1 = "Santhoshi";
		c1.size = "s";

		Customer c2 = new Customer();
		c1.name2 = "Praveen";

		Test item1 = new Test();
		Test item2 = new Test();
		
		Test items[]={item1,item2};
		String names[]= {"ss","pp"};

		item1.description = "BlueJacket";
		item1.price = 20.9;
		item1.size = "S";

		item2.description = "OrangeJacket";
		item2.price = 10.9;
		item2.size = "M";
	/*	
		for(Test loop: items )
		{
			System.out.println(loop.description);
		}
*/
		
		System.out.println("item1" + "," + item1.description + "," + item1.price + "," + item1.size);
		System.out.println("item2" + "," + item2.description + "," + item2.price + "," + item2.size);

		total = (item1.price + item2.price * 2) * 1 + tax;
		System.out.println("the price : " + total);

		/*
		 * Customer c3 = new Customer(); c3.name3 = "aaradhya"; c3.size="S";
		 */

		int x = 0;

		int mesurement = 8;

		switch (mesurement) {
		case 1, 2, 3:
			c1.size = "s";
			break;
		case 4, 5, 6:
			c1.size = "m";
			break;
		case 7, 8, 9:
			c1.size = "l";
		break;
			
		default :
			c1.size="xl";
			
		}
		System.out.println(c1.size);	

	}

}
