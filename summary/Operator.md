# 연산자(Operator)
> ## 프로그램의 **산술식**이나 **연산식**을 표현하고 처리하기 위해 제공되는 다양한 기호

## 목차
### [1. 연산자 종류와 우선 순위](#연산자-종류와-우선순위)
### [2. 산술 연산자](#산술-연산자)
### [3. 증감 연산자](#증감-연산자)
### [4. 비교 연산자](#비교-연산자)
### [5. 논리 연산자](#논리-연산자)
### [6. 논리 부정 연산자](#논리-부정-연산자)
### [7. 복합 대입 연산자](#복합-대입-연산자)
### [8. 삼항 연산자](#삼항-연산자)
## 연산자 종류와 우선순위
  ![연산자 종류와 우선순위](https://t1.daumcdn.net/cfile/tistory/997A014D5A90B9B00D)  
  </br>



## 산술 연산자
> ### 일반 수학과 동일한 연산 방법, 우선 순위.
> ### *단, **%는 나누기의 나머지 값을 구하는 연산***

- ### 연산자 예시
  ```Java
  int a = 10, b = 20, c = 0;
  c = a + b;
  c = a - b;
  c = a * b;
  c = a / b;
  c = a % b;
  ```
  */ 연산시 **[형변환](/Vraiable.md)에 유의 해야 함***  
  </br>

## 증감 연산자(++, --)
> ### 피연산자의 **값에 1을 더하거나 빼는 연산자**로 위치에 따라 결과 값이 다르게 나타남  
> 전위 연산 : 먼저 연산 후 다른 연산 실행
> 후위 연산 : 다른 연산 우선 실행 후 연산 

- ### 전위 연산자 예시
  ```Java
  int a = 10;
  int b = ++a;
  System.out.printf("%d, %d", a, b);  // 11. 11
  ```
  1. 변수 a에 10 대입
      ```Java
      int a = 10;
      ```
  2. a변수의 값 1 증가
      ```Java
      ++a;
      ```
  3. b변수에 a의 값(11) 대입
      ```Java
      int b = a;
      ```
- ### 후위 연산자 예시
  ```Java
  int a = 10;
  int b = a++;
  System.out.printf("%d, %d", a, b);  // 11. 10
  ```
  1. 변수 a에 10 대입
      ```Java
      int a = 10;
      ```
  3. b변수에 a의 값(10) 대입
      ```Java
      int b = a;
      ```
  2. a변수의 값 1 증가
      ```Java
      a++;
      ```  
      </br>

## 비교 연산자
> ### 데이터가 **같은지, 다른지 비교**할 때 쓰이며 항상 결과값은 **논리 값(true,false)**으로 나타남.
> a == b : a와 b가 **같으면** true  
> a != b : a와 b가 **다르면** false  
> *기본형 boolean과 참조형을 제외하고 나머지 자료형에 모두 사용 가능*

- ### 연산자 예시
  ```Java
  int a = 10;
  int b = 20;

  a == b  // a와 b가 같으면 true, 다르면 false
  a != b  // a와 b가 다르면 true, 같으면 false
  a > b   // a가 b 초과면 true, 아니면 false
  a < b   // a가 b 미만이면 true, 아니면 false
  a >= b  // a가 b 이상이면 true, 아니면 false;
  a <= b  // a가 b 미만이면 true, 아니면 false;

  if(a < b) {}

  int result = a > b ? a++ : b++;

  for(int a = 0; a <= b; a++) {}

  while( a >= b) {}
  ```  
  </br>

## 논리 연산자
> ### 논리 값 두 개를 비교하는 연산자  
> **&&** : 두 피연산자가 **모두** true일 때 true 반환(AND)  
> **||** : 두 피연산자 중 **하나만** true여도 true 반환(OR)  

|a|b|a && b| a ll b|
|:--:|:--:|:--:|:--:|
|true|true|true</br>b값 추정 **가능**|true</br>b값 추정 **불가능**|
|true|false|false</br>b값 추정 **가능**|true</br>b값 추정 **불가능**
|false|true|false</br>b값 추정 **불가능**|true</br>b값 추정 **가능**|
|false|false|false</br>b값 추정 **불가능**|false</br>b값 추정 **가능**|  
- ### 논리 연산자 예시
  1. **&&(AND)** : ~와, 그리고, ~이고, ~이면서, ~부터 ~까지, ~사이
      ```Java
      int a = 101;

      // a 는 100 이상 이면서 짝수인가?
      boolean result1 = a >= 100;
      boolean result2 = a % 2 == 0;
      System.out.println("a는 100 이상이면서 짝수인가? : " + (result && result)); // false

      int b = 5;

      // b는 1부터 10사이의 정수인가?
      boolean result3 = b >= 1;
      boolean result4 = b <= 10;
      System.out.println("b는 1부터 10사이의 정수인가? : ", (result3 && result4)); // true
      ```
  2. **||(OR)** : 또는, ~거나, ~이거나
      ```Java
      int a = 10;
      // a는 홀수 이거나 10을 초과한 수인가?
      System.out.println("a는 홀수 이거나 10을 초과한 수인가? : ");
      System.out.println(a % 2 == 1 || a > 10); // false

      int b = 20;
      // b는 1 부터 100 사이 숫자 또는 음수인가?
      System.out.println("b는 1 부터 100 사이 숫자 또는 음수인가? : ")
      boolean result = (1 <= b && b <= 100) || b < 0; // true
      System.out.println(result);
      ```
</br>

## 논리 부정 연산자
> ### 논리 값을 부정하여 **반대 값으로 변경**  
> 제어문을 활용할 때 많이 쓰임

- 논리 부정 연산자 예시
  ```Java
  boolean bool1 = true;
  boolean bool2 = !bool1;
  System.out.println(bool2); // false
  ```  
  </br>

## 복합 대입 연산자
> ### 다른 연산자와 대입 연산자가 결합한 것으로  
> **자기 자신과 연산 후 연산 결과를 자기 자신에게 누적 대입**  

    a += 10 -------------------- a = a + 10
    a -= 10 -------------------- a = a - 10
    a *= 10 -------------------- a = a * 10
    a /= 10 -------------------- a = a / 10
    a %= 10 -------------------- a = a % 10
> ### 증감 연산과 비슷해 보이지만 **증감연산자(++, --)는 1씩 증가 대입 연산자는 원하는 값을 증가시키고 그 변수에 저장** 가능  

- ### 복합 대입 연산자 예시
  ```Java
  int a = 10;
			
  a++;
  System.out.println("a를 1 증가 : "  a);              // 11
			
  a += 4;												// a = a + 4 								
  System.out.println("a를 4 증가 : " + a);			// 15
			
  a -= 10;											// a = a - 10
  System.out.println("a를 10 감소 : " + a);			// 5
			
  a *= 3;												// a = a * 3
  System.out.println("a를 3배 증가 : " + a);			// 15
			
  a /= 6;												// a = a / 6;
  System.out.println("a를 6으로 나눴을 때의 몫 : " + a);	// 2
			
  a %= 2;												// a = a % 2;
  System.out.println("a를 2로 나눴을 때의 나머지  " + a); // 0
  ```
</br>

## 삼항 연산자
> ### [조건식] ? [식1] : [식2];  
> 조건식의 **결과 값에 따라 연산을 처리하는 방식**으로 **결과 값이 참(true)일 경우 식1, 거짓일(false) 경우 식2 수행**  
> 삼항 연산자 안에 **삼항 연산자를 중첩하여 쓰는 것도 가능**

- ### 삼항 연산자 예시
  ```Java
  int result1 = a > b ? a++ : b--;
  int result2 = a < b ? a++ : (b == 0 ? a-- : b++);

  // 0, 홀, 짝 구분
  int num = 3;
  String result = num == 0 ? "0" : num % 2 == 0 ? "짝수" : "홀수";
  System.out.println(result); // 홀수
  ```