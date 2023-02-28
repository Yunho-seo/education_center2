package lclass;
import java.util.Scanner;
public class Student90 {
	   public int no;
	   public String name;
	   
	   public int kor;
	   public int mat;
	   public int eng;
	   
	   public int total;
	   public float average;
	   public char grade;
	   public int ranking;
	   
	   public Student90() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("이름을 입력하시오 : ");
	      this.name = sc.nextLine();
	      System.out.println("국어 점수 : ");
	      this.kor = Integer.parseInt(sc.nextLine());
	      System.out.println("수학 점수 : ");
	      this.mat = Integer.parseInt(sc.nextLine());
	      System.out.println("영어 점수 : ");
	      this.eng = Integer.parseInt(sc.nextLine());
	      total = total_fun();
	      average = avr_fun();
	      grade = grade_check();
	      
	   }
	   public int total_fun() {
	      return this.kor + this.mat + this.eng;
	   }
	   public float avr_fun() {
	      return average = Math.round((double)this.total /3);
	   }
	   public char grade_check() {
	      char hakjum;
	      switch ((int)average/10){
	      case 10: case 9: hakjum = 'A'; break;
	      case 8: hakjum='B'; break;
	      case 7: hakjum ='C'; break;
	      case 6: hakjum ='D'; break;
	      default : hakjum ='F';
	      }
	      return hakjum;
	   }
	   public Student90(String name, int kor, int mat, int eng) {
	      this.name = name;
	      this.kor = kor;
	      this.mat = mat;
	      this.eng = eng;
	      total_calc();
	   }
	   public void total_calc() {
	      total = total_fun();
	      average = avr_fun();
	      grade = grade_check();
	   }
	   // set함수를 생성
	   public void setName(String name) {
	      this.name = name;
	   }
	   // 문제 : 국어 별도로, 수학 별도로, 영어 별도로 값을 set하는 함수를 작성해 보시오.
	   // 검산을 반드시 실행하시오
	   public void setKor(int kor) {
	      this.kor = kor;
	      total_calc();
	   }
	   public void setMat(int mat) {
	      this.mat = mat;
	      total_calc();
	   }
	   public void setEng(int eng) {
	      this.eng = eng;
	      total_calc();
	   }
	   // 기본적으로 자바는 모든 클래스가 Object를 상속 받음
	   // 입출력하는 데이터 모두 문자열이어야 함
	   // 문자열을 요구하는 함수에 클래스가 전달되면 자동으로 작동한다
	   public String toString() { // 오버라이딩(재정의)의 예 // 상속 : 코드 중복을 방지하기 위해서 공통부분을 부모로 정의하고
	                              // 자식이 상속 받아서 기능을 구현 ( 함수 명만 정의하고 바디부분은 정의 하지않는 부분이 있음)
	                              // 이 부분을 자식이 재정의해서 구현하면 자식마다 다른 기능을 구현할 수 있다.
	      return kor +"," + mat + "," + eng;
	   }
	   public String lasttoString() {
	      return no +"  " +name + "  "+ kor + "  " + mat + "   " + eng + "  "   + total + "  " +
	   average + "  " + grade + "  " + ranking;
	   }
	   public String printhead() {
	      return "번호" + "  " + "이름" + "  " + "국어"+ "  "+ "수학" + "  " +
	   "영어" + "  " + "합계" + "  " + "평균" + "  " + "학점" + "  " + "등수";
	      
	   }
}