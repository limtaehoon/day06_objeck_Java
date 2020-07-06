package day06_objeck;

public class DrinkMain {

	public static void main(String[] args) {
		 Drink coffe=new Drink("커피",500,3);
		 coffe.getData();
		 coffe.gettotal();
		 //커피 500 3 1500
		 Drink tea=new Drink("녹차",800,5);
		 tea.getData();
		 
		 //녹자 800 5 4000
		 //판매금액
		 System.out.println("판매금액:"+(coffe.gettotal()+tea.gettotal()));
	//다른 두 객체를 더해주므로 그 객체의 주소인 coffe,tea를 적고 필요한 함수를 불러온다
	}
	

}
