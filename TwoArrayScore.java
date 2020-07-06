package day06_objeck;

import java.util.Scanner;

public class TwoArrayScore {//public 접근제어자
static Scanner sc=new Scanner(System.in);//static은  모든 객체가 공유해서 쓰는것 ,class안에 씀
int [][] arr=new int[50][7];
int row=0;
public void showMenu() {//메뉴
	System.out.println("선택하세요");
	System.out.println("1.성적 입력");
	System.out.println("2.전체보기/종료");
	System.out.println("택>>");
}
public void inputData() {//성적입력
	System.out.println("성적입력 시작>>");
	System.out.println("학번");
	int yearNum=sc.nextInt();
	System.out.println("국어");
	int kor=sc. nextInt();
	System.out.println("수학");
	int Math=sc. nextInt();
	System.out.println("영어");
	int eng=sc.nextInt();

	arr[row][0]=yearNum;//학번
	arr[row][1]=kor;//국어
	arr[row][2]=Math;//영어
	arr[row][3]=eng;//수학
	arr[row][4]=kor+Math+eng;//총점
	arr[row][5]=arr[row][4]/3;//평균
	arr[row][6]=1;//석차
	 row++;
}
public void rankMethod() {
	for(int i=0;i<row-1;i++) {
		for(int j=i+1;j<row;j++) {
		if(arr[i][4]>arr[j][4]) {
			arr[j][6]++;
		}else {
			arr[i][6]++;
		}
	}		
}		
}	
		
		
	

public void veiwData() {//전체보기
	rankMethod();//석차 메소드
	System.out.println("성적보기");
	System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
	for(int i=0;i<arr.length;i++) {
	//for(int i=0;i<arr.row; i++) {	//이렇게 쓰거나 if문으로 쓰고 break; 써도됨
		if(arr[i][0]==0)break;
	for(int j=0;j<arr[i].length; j++ ) {
	System.out.print(arr[i][j]+"\t");
 }
	System.out.println();
	}	
}	


public static void main(String[] args) {
	TwoArrayScore manager =new TwoArrayScore();
	while(true) {
		manager.showMenu();	//메뉴보기
	int num=sc.nextInt();{
	 			switch(num){
				case 1:manager.inputData();break;
				case 2:manager.veiwData();
				System.exit(0);
				default:System.out.println("입력오류");
				}

	
	
	
		}
		}
	}
}		
		
		
		
		
