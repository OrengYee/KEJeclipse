package projectA05;

public class projectA0502 {

	public static void main(String[] args) {
		int korea = 80;
		int eng = 80;
		int math = 80;
		
		int avg = (korea+eng+math)/3;
		if(avg >= 80) {
			System.out.println("훌륭합니다.");
		}else if(avg >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("다시 도전하세요.");
		

	}
		
		// 국어점수가 80점 이상일때 영어와 수학점수를 출력하시오.
		if(korea >= 80) {
			System.out.println("영어:"+eng+" 수학:"+math);
		}
		
		// 국어점수가 80점 이상이고 영어점수가 60점 이상일때 평균을 출력하시오
		if((korea >= 80) && (eng >=60)) {
			System.out.println("평균점수:"+avg);
		}
		
		// 과학을 변수로 sci 로 추가하고 값을 80으로 설정 후 평균을 구하시오.
		
		int sci = 80;
		avg = (korea+eng+math+sci)/4;
		System.out.println("국어+수학+영어+과학의 평균점수: "+avg);
		
		//새로운 값 
		
		int korea1 = 63;
		int eng1 = 65;
		int math1 = 64;
		int sci1 = 83;
		
		double avg1 = (double)(korea1+eng1+math1+sci1)/4;
		System.out.println("새로운 평균점수: "+avg1);
		
		//두 평균의 합이 130 이상이면 합격이라고 출력하시오
		if((avg+avg1) >= 130) {
			System.out.println("합격입니다.");
		}

  }
	
}
