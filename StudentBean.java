package day06_objeck;

public class StudentBean {
		String name;
		int kor,eng,math;
		int rank=1;
	public StudentBean(String name,int kor,int eng,int math) {
			this.name=name;
			this.kor=kor;
			this.eng=eng;
			this.math=math;
		}
	
	public int getTotal() {
		return kor+eng+math;
	}


 public double  getavg() {
	return(kor+eng+math)/3;
}
	public void setRank(int rank) {
		this.rank+=rank;

	}

}		
		

	


