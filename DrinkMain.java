package day06_objeck;

public class DrinkMain {

	public static void main(String[] args) {
		 Drink coffe=new Drink("Ŀ��",500,3);
		 coffe.getData();
		 coffe.gettotal();
		 //Ŀ�� 500 3 1500
		 Drink tea=new Drink("����",800,5);
		 tea.getData();
		 
		 //���� 800 5 4000
		 //�Ǹűݾ�
		 System.out.println("�Ǹűݾ�:"+(coffe.gettotal()+tea.gettotal()));
	//�ٸ� �� ��ü�� �����ֹǷ� �� ��ü�� �ּ��� coffe,tea�� ���� �ʿ��� �Լ��� �ҷ��´�
	}
	

}
