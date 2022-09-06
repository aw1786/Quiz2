package com.sh.function.run;

import java.util.Scanner;

/**
 * 문제 3]
 - 메소드명 : public void opSample3(){}
 - 구현 내용 : 
  1. 정수 변수 선언
  2. 키보드로 부터 정수 하나 입력받음
  3. 입력받은 정수가 양수이면 "양수다." 출력
     양수가 아니면 "양수가 아니다." 출력


[문제 4]
 - 메소드명 : public void opSample4(){}
 - 구현 내용 :
   1. 정수 변수 선언
   2. 문자열 변수 선언
   3. 키보드로 부터 정수를 하나 입력 받음    
   4. 입력받은 정수가 짝수이면 "짝수다" 를 문자열변수에 기록하고,
     짝수가 아니면 "홀수다"를 문자열변수에 기록하고 
    문자열변수 값 출력함
   <짝수의 조건>
    어떤 수를 2로 나눈 나머지가 0과 같으면 짝수임.
 *
 *
 */

public class Example {
	
	public void opSample3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		
		System.out.println(a > 0 ? "양수다" : "양수가 아니다");
	}

	public void opSample4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int b = sc.nextInt();
		
		String str = b % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(str);
	}
	
	
	
	
	
	
}
