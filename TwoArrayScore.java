package day06_objeck;

import java.util.Scanner;

public class TwoArrayScore {//public ����������
static Scanner sc=new Scanner(System.in);//static��  ��� ��ü�� �����ؼ� ���°� ,class�ȿ� ��
int [][] arr=new int[50][7];
int row=0;
public void showMenu() {//�޴�
	System.out.println("�����ϼ���");
	System.out.println("1.���� �Է�");
	System.out.println("2.��ü����/����");
	System.out.println("��>>");
}
public void inputData() {//�����Է�
	System.out.println("�����Է� ����>>");
	System.out.println("�й�");
	int yearNum=sc.nextInt();
	System.out.println("����");
	int kor=sc. nextInt();
	System.out.println("����");
	int Math=sc. nextInt();
	System.out.println("����");
	int eng=sc.nextInt();

	arr[row][0]=yearNum;//�й�
	arr[row][1]=kor;//����
	arr[row][2]=Math;//����
	arr[row][3]=eng;//����
	arr[row][4]=kor+Math+eng;//����
	arr[row][5]=arr[row][4]/3;//���
	arr[row][6]=1;//����
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
		
		
	

public void veiwData() {//��ü����
	rankMethod();//���� �޼ҵ�
	System.out.println("��������");
	System.out.println("�й�\t����\t����\t����\t����\t���\t����");
	for(int i=0;i<arr.length;i++) {
	//for(int i=0;i<arr.row; i++) {	//�̷��� ���ų� if������ ���� break; �ᵵ��
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
		manager.showMenu();	//�޴�����
	int num=sc.nextInt();{
	 			switch(num){
				case 1:manager.inputData();break;
				case 2:manager.veiwData();
				System.exit(0);
				default:System.out.println("�Է¿���");
				}

	
	
	
		}
		}
	}
}		
		
		
		
		
