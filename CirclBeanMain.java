package day06_objeck;

public class CirclBeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� 1.2.3.4.5.��5���� ��Ŭ�� ��ü�� �����
		//�� ��Ŭ���ǳ��̸� ����ϰ�
		//�Ѹ����� ����Ͻÿ�
		/*
	CircleBean c1=new CircleBean(5);
	CircleBean c2=new CircleBean(4);
	CircleBean c3=new CircleBean(3);
	CircleBean c4=new CircleBean(4);
	CircleBean c5=new CircleBean(5);
	
	System.out.println(c1.getArea());
	System.out.println(c2.getArea());
	System.out.println(c3.getArea());
	System.out.println(c4.getArea());
	System.out.println(c5.getArea());
	double sum=c1.getArea()+c2.getArea()+c3.getArea()+c4.getArea()+c5.getArea()
	
	
	System.out.println(sum);*/
	//��ó�� �ؿ����� ������ �迭�� for���� �̿��ؼ� �ؿ��� ó�� �غ��� 
		
	CircleBean[]arr=new CircleBean[5];//����&����  
	for(int i=0;i<arr.length;i++) {
	arr[i]=new CircleBean(i+1);//�ʱ�ȭ
	}
	int hap=0;
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i].getArea());
		hap+=arr[i].getArea();
	}
	 System.out.println("�Ѹ���:"+hap);
	}

}
	
	
	
	
	
	
	
	
	
