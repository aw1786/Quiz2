package com.sh.cast.practice;

import java.util.Scanner;

/**
 * [형변환 실습]
 - 새 패키지 추가 : com.sh.cast.practice
 - 실행 테스트용 클래스 : TestCasting (main() 포함 : 아래의 메소드 실행 테스트)
 - 기능 제공용 클래스 : CastingSample (각 문제별 메소드 추가함)

[실습 1]
public void printUniCode(){}
 - 키보드로 문자하나를 입력받아, 그 문자의 유니코드(아스키코드)를 출력되게 함
 - 입력예 : 
    문자 입력 : A
 - 출력예 : 
    A is unicode : 65

[실습2]
public void calculatorScore(){}
 - 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 계산해서 출력함
 - 총점과 평균은 정수형으로 처리함
 - 입력예 : 
    국어 : 90.0
    영어 : 90.0
    수학 : 90.0
 - 출력예 : 
    총점 : 270
    평균 : 90
 *
 */

public class CastingSample {
	
	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 :");
		String str =sc.next();
		
		System.out.println(str +" is unicode :" + (int)str.charAt(0) );
		
		
	}

	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
		double a = sc.nextDouble();
		
		System.out.print("영어 :");
		double b = sc.nextDouble();
		
		System.out.print("수학 :");
		double c = sc.nextDouble();
		
		System.out.println("총점 :" + (int)(a + b + c));
		System.out.println("평균 :" + (int)(a + b + c) / 3);
		
		
		
		
		
	}
		
	
	
}
