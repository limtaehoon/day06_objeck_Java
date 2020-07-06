package day06_objeck;

public class CirclBeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반지름이 1.2.3.4.5.인5개의 써클빈 객체를 만들고
		//각 써클빈의넓이를 출력하고
		//총면적을 출력하시요
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
	//위처럼 해왔지만 이제는 배열과 for문을 이용해서 밑에서 처럼 해보자 
		
	CircleBean[]arr=new CircleBean[5];//선언&생성  
	for(int i=0;i<arr.length;i++) {
	arr[i]=new CircleBean(i+1);//초기화
	}
	int hap=0;
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i].getArea());
		hap+=arr[i].getArea();
	}
	 System.out.println("총면적:"+hap);
	}

}
	
	
	
	
	
	
	
	
	
