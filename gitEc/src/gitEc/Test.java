package gitEc;

public class Test {
     String description;
     double price;
     String size="m";
    // double tax;
    
	public static void main(String[] args) {
		double tax =0.2;
		 double total=0.0;
		System.out.println("hi welcome to the shopping");
		Customer c1 = new Customer();
		c1.name1="Santhoshi";
		Customer c2 = new Customer();
		c1.name2="Praveen";
		
        Test item1 = new Test();
        Test item2 = new Test();
        
        item1.description="BlueJacket";
        item1.price =20.9;
        item1.size="S";
        
        item2.description="OrangeJacket";
        item2.price =10.9;
        item2.size="M";
        
        System.out.println("item1"+","+ item1.description+ ","+ item1.price+","+ item1.size);
        System.out.println("item2"+","+ item2.description+ ","+ item2.price+","+ item2.size);
        
        total = (item1.price + item2.price*2) * 1 + tax;
        System.out.println("the price : " + total);
        
        
        
		
	}

}
