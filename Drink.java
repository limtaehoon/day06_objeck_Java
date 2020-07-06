package day06_objeck;

public class Drink {
	String d;
	int won;
	int num;
	
	public Drink (String d,int won,int num) {
		this.d=d;
		this.won=won;
		this.num=num;
	}
	public int gettotal() {
		return won*num;
	}
	
	public void getData() {
		System.out.println(d+"\t");
		System.out.println(won+"\t");
		System.out.println(num+"\t");
	//System.out.println(won*num+"\t");
	
	System.out.println(gettotal()+"\n");
	
	}
}
