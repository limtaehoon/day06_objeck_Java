package day06_objeck;	

public class Taecher {
StudentBean[]arr= new StudentBean[50];
	int cnt;//멤버변수 int 초기값 0 이라서 굳이 0안해줘도됨
	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.성적 입력");
		System.out.println("2.전체보기");
		System.out.println("3.종료");
		System.out.println("택>>");
	}
	public void inputData() {
		System.out.println("성적입력 시작>>");
		System.out.println("이름");
		String name=ScoreMain.sc.next();
		System.out.println("국어");
		int kor=ScoreMain.sc.nextInt();
		System.out.println("영어");
		int eng=ScoreMain.sc.nextInt();
		System.out.println("수학");
		int math=ScoreMain.sc.nextInt();
		//배열에 StudentBean 객체넣기
	arr[cnt]=new StudentBean(name,kor,eng,math);
	cnt++;
	}
	public void rankMethood() {
		for(int i=0;i<cnt-1;i++) {
			for(int j=i+1;j<cnt;j++) {
				if(arr[i].getTotal()>arr[j].getTotal()) {
					arr[j].setRank(1); //arr[i]의 rank에 1을 더한다
				}
				else if(arr[i].getTotal()<arr[j].getTotal()) {
					arr[i].setRank(1); //arr[i]의 rank에 1을 더한다
				}
			}
		}
	}
	public void viewData() {
		rankMethood();
		System.out.println("---학생성적 보기");
		System.out.println("이름\t총점\t평균\t석차");
		int sum=0;//지역변수는 반드시 초기값을 줘야된다 초기값생략하면 오류남
		for(int i=0;i<cnt;i++) {
			sum+=arr[i].getTotal();
			System.out.print(arr[i].name+"\t");	
			System.out.print(arr[i].getTotal()+"\t");
			System.out.print(arr[i].getavg()+"\t");
			System.out.print(arr[i].rank+"\n");
		
		
		
		}
		
		System.out.println("학급총점:"+sum);
		
		System.out.println("학급평점"+sum/cnt);
	}
		
		
}

	