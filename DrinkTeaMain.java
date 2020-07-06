package day06_objeck;

public class DrinkTeaMain {
	public static void main(String[] args) {
		

		Drink[]arr=new Drink[100];
		/*//Ä¿ÇÇ500 3 1500
		Drink d1=new Drink("Ä¿ÇÇ",500,3);
		//³ìÂ÷800 5 4000
		Drink d2=new Drink("³ìÂ÷",500,3);
		//Ä«Æä¶ó¶¼ 1500 5 7500	
		Drink d3=new Drink("Ä«Æä¶ó¶¼",500,3);
		arr[0]
		
		
		//ÃÑ ÆÇ¸Å¾×*/
		arr[0]=new Drink("Ä¿ÇÇ",500,3);
		arr[1]=new Drink("³ìÂ÷",500,3);
		arr[2]=new Drink("Ä«Æä¶ó¶¼",500,3);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null)break;
			arr[i].getData();
			sum+=arr[i].gettotal();
		
		
		}
		
		System.out.println("ÃÑÆÇ¸Å¾×:"+sum);
		
		}
	
	
	
	
	
	
	
		

}
