package day06_objeck;

public class DrinkTeaMain {
	public static void main(String[] args) {
		

		Drink[]arr=new Drink[100];
		/*//Ŀ��500 3 1500
		Drink d1=new Drink("Ŀ��",500,3);
		//����800 5 4000
		Drink d2=new Drink("����",500,3);
		//ī��� 1500 5 7500	
		Drink d3=new Drink("ī���",500,3);
		arr[0]
		
		
		//�� �Ǹž�*/
		arr[0]=new Drink("Ŀ��",500,3);
		arr[1]=new Drink("����",500,3);
		arr[2]=new Drink("ī���",500,3);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null)break;
			arr[i].getData();
			sum+=arr[i].gettotal();
		
		
		}
		
		System.out.println("���Ǹž�:"+sum);
		
		}
	
	
	
	
	
	
	
		

}
