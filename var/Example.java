package com.sh.var;

import java.util.Scanner;

/**
 * [변수 연습문제]
 => 패키지 생성 : com.sh.var
 => 실행용 클래스 생성 : TestMain.java
     >> main() 메소드 포함 : 각 문제별 메서드 실행 테스트함
 => 기능제공용 클래스 생성 : Example.java

[연습 1]
 => 메소드명 : public void example1(){}
 => 실행내용 : 정수 두 개를 입력받아, 두 수의 합, 차, 곱
        나누기한 몫과 나머지 출력
 => 입력예
    첫번째 정수 : 23
    두번째 정수 : 7
 => 출력예          계산식
    더하기 결과 : 30  --> (값1 + 값2)
    빼기 결과 : 16   --> (값1 - 값2)
    곱하기 결과 : 161 --> (값1 * 값2)
    나누기한 몫 : 3   --> (값1 / 값2)
    나누기한 나머지 : 2  --> (값1 % 값2)

[연습 2]
 => 메소드명 : public void example2(){}
 => 실행내용 : 가로, 세로 값을 실수형으로 입력받아
    사각형의 면적과 둘레를 계산하여 출력
    계산공식 - 면적 : 가로 * 세로
        둘레 : (가로 + 세로) * 2
 => 입력예
    가로 : 13.5
    세로 : 41.7
 => 출력예
    면적 : 562.95
    둘레 : 110.4


[연습 3]
 => 메소드명 : public void example3(){}
 => 실행내용 : 영어 문자열 값을 키보드로 입력받아
    각 자리의 문자를 출력
 => 입력예
    문자열(3글자이상)을 입력하시오 : apple
 => 출력예 (3개까지만 출력해 봄)
    첫번째 문자 : a
    두번째 문자 : p
    세번째 문자 : p

 *
 */

public class Example {
	public void example1( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 :");
		int a = sc.nextInt();
		System.out.print("두번째 정수 :");
		int b = sc.nextInt();
		
		System.out.println("더하기 결과 :" + (a + b));
		System.out.println("빼기 결과 :" + (a - b));
		System.out.println("곱하기 결과 :" + a * b);
		System.out.println("나누기한 몫 :" + a / b);
		System.out.println("나누기한 나머지 :" + a % b);
		
		}
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 :");
		double c = sc.nextDouble();
		System.out.print("세로 :");
		double d = sc.nextDouble();
		
		System.out.println("면적 :" + (c * d));
		System.out.println("둘레 :" + (c + d) * 2);
	
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오 :");
		String str = sc.next();
		
		System.out.println("첫번째 문자 :" + str.charAt(0));
		System.out.println("두번째 문자 :" + str.charAt(1));
		System.out.println("세번째 문자 :" + str.charAt(2));
		System.out.println("네번째 문자 :" + str.charAt(3));
		System.out.println("다섯번째 문자 :" + str.charAt(4));

		
		
	}
	
	
	
	
	
	
	
}
