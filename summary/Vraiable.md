# 변수 (Variable)

> ## **메모리**(RAM)에 값을 **기록**하기 위한 공간(박스)
> 공간(박스)에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.  
> 값(Data)의 **형태**와 **크기**에 따라서 변수의 형태(**자료형**)은 달라져야 한다.

## 목차
### [1. 변수 사용의 목적](#변수-사용의-목적)
### [2. 변수의 데이터 저장 단위](#변수의-데이터-저장-단위)
### [3. 변수의 선언](#변수의-선언)
### [4. 변수의 명명 규칙](#변수의-명명-규칙)
### [5. 값 대입과 리터럴](#값-대입과-리터럴)
### [6. 변수의 초기화](#변수의-초기화)
### [7. 상수란?](#상수란)
### [8. 형변환](#형변환casting)  
#  
</br>



## 변수 사용의 목적

### 1. 가독성 향상 및 코드 길이의 감소

- 변수 미사용

  ```Java 
  // example 1
  System.out.println(2 * 3.141592653589793 * 10);
  System.out.println(3.141592653589793 * 10 * 10);
  System.out.println(3.141592653589793 * 10 * 10 * 20);
  System.out.println(4 * 3.141592653589793 * 10 * 10);
  ```
  
- 변수 사용

  ``` java
  // example 2
  double pi = 10;
  int r = 10;
  int h = 20;
  
  System.out.println(2 * pi * r);
  System.out.println(pi * r * r);
  System.out.println(pi * r * r * h);
  System.out.println(4 * pi * r * r);
  ```



### 2. 유지 보수성 향상

*example 1* 코드에서 데이터 10을 5로 바꾸려면 **n번**(코드상에 10이 들어가는 갯수) 고쳐 써야 한다.

```Java
System.out.println(2 * 3.141592653589793 * 5);
System.out.println(3.141592653589793 * 5 * 5);
System.out.println(3.141592653589793 * 5* 5 * 20);
System.out.println(4 * 3.141592653589793 * 5 * 5);
```



변수를 쓴다면 **n번**의 수정을 단 **한번**의 변경으로 수정할 수 있다.

```Java
int r = 5;
``` 



### 3. 재사용성의 증가

한번 만든 변수는 **계속** 사용 할 수 있다.  
<br>






## 변수의 데이터 저장 단위

> ### 저장 공간이 제한적이기 때문에 저장 크기에 대한 기준과 CPU가 데이터를 처리할 때 일정한 기준 필요




- ### 비트(bit)

  - 컴퓨터가 나타내는 **데이터의 최소 저장 단위**로서 **2진수 값 하나**를 저장할 수 있는 **메모리공간 **을 의미



- ### 바이트(byte)

  - **데이터 처리** 또는 **문자의 최소 단위** 로서 8개의 비트가 모여 하나의 바이트가 구성됨



![비트와 바이트](https://velog.velcdn.com/images/hshs0409/post/6346fdee-9f2a-4532-a114-3a2f2018ea5d/image.png)  
<br>




## 변수의 선언
> ### 메모리 공간에 데이터를 저장할 수 있는 공간을 할당하는 것



- ### 선언 방법

  - **자료형** + **변수명** + **;**



- ### 선언 예시

  ```java
  // 논리형 변수 선언       // 정수형 변수 선언
  boolean isTure;         byte bNum;
                          short sNum;
                          int iNum;
                          long lNum;
  // 문자형 변수 선언      // 실수형 변수 선언
  char ch;                float fNum;
                          double dNum;
  // 문자열 변수 선언
  String str;					
  ```

  

- ### 변수 저장 가능 범위

![변수 저장 가능 범위](https://t1.daumcdn.net/cfile/tistory/99297E505A966DD619)  
<br>
  




## 변수의 명명 규칙

### 1. 대소문자가 구분되며 길이 제한이 없다.
  ```Java
  int asdlfkhasdlfkhasldkfhlsdkfhalsdkfhasldkfha;
  ```  
### 2. **예약어**를 사용하면 안 된다.
  ```Java
  // int int;     컴파일러 에러(Syntax error on token "int", invalid VariableDeclarator)
  // int true;
  // int String;
  // int false;
  ```  
   - #### 주요 예약어
  ![자바 주요 예약어](https://lh4.googleusercontent.com/7WmYBGSVstAyyzGBzNa76_9TN_QX6dV1WssAIhBoaauBUpG2HVGIFsK8CgGuWCKHWDFj7Ao_HTGrqLe70f8V9zNdVlaRjioC5auB33v-or5KEOwIzznDgblInFk0By-MAGl7g3Xy)
### 3. 숫자로 **시작**하면 안된다.
  ```Java
  int age1;
  // int 1age;    컴파일러 에러(Syntax error on token "1", delete this token)
  ```  
### 4. 특수문자는 '**$**', '**_**' 만을 허용한다.
  ```Java
  double $dNum;     // $는 내부클래스 사용 시 자동으로 붙는 기호 (직접 사용 x)
  float _fNum;      // _는 상수 단어 구분 외에는 사용 x
  int iNum_1$;      // 선언은 가능하나 바람직하지는 않다.
  // long LongNum!  // 컴파일러 에러
  ```  
### 5. 여러 단어로 선어된 변수 이름은 단어의 첫 글자를 **대문자**로 적는 것을 관례로 한다.
  > 단, **첫** 글자는 소문자
  ```Java
  int userAge;        // 카멜 표기법
  String userName;
  String userEmail;
  Stromg userAddress;
  ```  
### 참고 사항 - 변수명은 언어 제한이 없다.
 > 단, 코드 공유시 **깨짐**이 있을 수 있으므로 권장 x
  ```Java
  int 정수1;
  boolean 참거짓;
  String 凸;
  ```  
<br>
  
## 값 대입과 리터럴
- ### 값 대입
  > 생성한 변수(저장 공간)에 값을 대입하는 것
  ```Java
  int age;
  age = 10;
  System.out.println(age);    // 10
  
  age = 20
  System.out.println(age);    // 20 (변수는 한 개의 데이터만 보관, 마지막에 대입한 값만 보관)
  ```  
- ### 리터럴
  > 변수에 대입되는 값 **자체**
    #### int i = [ **100** ]

  - #### 다양한 **리터럴**(원시 타입) 표기법
    ```Java
    shorts s = 32767;     char c = 'A';
    int i = 100;          String str = "ABC";
    long l = 10000L;
    float f = 0.123f;
    double d = 3.14;
    ```
- ### 문자열
  - #### 문자열 표현
    > #### 컴퓨터에서 **"기차"**, **"출력하세요"** 등과 같이 **단어**나 **문장**을 문자열이라고 표현
    > #### **""** 로 묶여 있으면 문자열로 인식하며 Java에서는 **String** 객체를 이용하여 저장

  - #### 문자열 초기화
    ```Java
    String str1 = "단어"
    String str2 = "문장도 됩니다!"
    String str3 = new String("초기화");
    ```  
  </br>  
<br>

## 변수의 초기화
> ### 변수를 사용하기 전에 처음으로 값을 저장하는 것  
> <details><summary>지역변수는 반드시 초기화 해야 된다.</summary><div markdown="1">
> 필드에서 선언된 변수는 값을 할당하지 않아도 자동으로 자료형에 대한 초기값을 갖지만, 지역 변수는 자동으로 초기화가 안된다.
> </div></details>

- ### 선언 후 초기화
  ```Java
  int age;
  age = 100;
  ```
- ### 선언과 동시에 초기화
  ```Java
  int age = 100;
  ```  
<br>

## 상수란?
> ### 수학에서는 변하지 않는 값 의미
> ### 컴퓨터(Java)에서는 **한 번만** 저장(기록)할 수 있는 메모리 의미
- ### 상수 선언 방법
  ```Java
  // 변수명 대문자로 표기
  final int AGE;

  // 여러단어면 _로 구분
  final int CONSTANT_NUMBER = 100000000;

  // CONSTANT_NUMBER = 0;   // 처음 초기화 이후 다시 값을 대입하면 컴파일러 에러
  ```
- ### 상수 사용 예시
  ```Java
  final int UP = 10;
  final int DOWN = -10;
  final int INIT = 0;

  int num2 = INIT;
  System.out.println(num2);

  num2 = num2 + UP;
  System.out.println(num2);

  num2 = num2 + DOWN * 3;
  System.out.println(num2);
  ```  
  </br>


## 형변환(casting)
> ### 값(Data)의 **자료형**을 **바꾸는 것** (boolean 제외)

- ### 컴퓨터의 값 처리 원칙
  1. **같은 종류** 자료형만 대입 가능
  2. **같은 종류** 자료형만 계산 가능
  3. 계산의 결과도 같은 종류의 값이 나와야 함  
  #### -> 이러한원칙이 지켜지지 않은 경우에 형변환이 필요함

 - ### 형변환 예시
  > #### 형변환 하고자 하는 값과 자료형의 표현 범위 차이에 따라 형변환 방법이 나뉨
  > ##### (자동 형변환, 강제 형변환)

        123456789(int)    ->     123456789.0(double)

        'A'(char)         ->     65(int)

        3.14f(float)      ->     3(int)
- ### 자동 형변환
  > #### **컴파일러**가 자동으로 값의 범위가 **작은** 자료형을 값의 범위가 **큰** 자료형으로 변환

  ![자동 형변환 방향](https://t1.daumcdn.net/cfile/tistory/990313335A10F46F16)

  - #### 자동 형변환 확인
    ```Java
    int num1 = 300;
    double num2 = 1.1;

    // int result = num1 + num2;				// Typmismatchcannot convert from double to int
    //              300  +  1.1 
    //              300.0 + 1.1 -> 자료형이 더 num2의 자료형double로 자동 형변환됨
    // double자료형인 num1 + num2의 결과값을 작자료형인 int형 변수에 저장을 시도하니 컴파일에러
    double result = num1 + num2;
    System.out.println(result);                 /301.1 출력
    ```

- ### 강제 형변환
    > #### 값의 범위가 **큰** 자료형을 값의 범위가 **작은** 자료형을 변환  
    > #### 강제 형변환 시 **데이터 손실**이 발생할 수 있음 -> 데이터의 변형, 손실을 감수하고 강제 변환

  - #### 데이터 손실
    ![데이터 손실](https://t1.daumcdn.net/cfile/tistory/99925F3359FE6B4815)
    




  - #### 강제 형변환 확인
      ```Java
      double temp = 3.14;
      // int result = temp;						// double -> in 자동형변환 불가 컴파일러 에러
			
      int result = (int)temp;						// 데이터 손실  감수하고 강제 형변환
      System.out.println("result : " + result);	// 3.14 ->  실수를 (정수로 강제 형변환시 소숫점 이하 버림처리)
			
      int temp2 = 290;
      byte result2 = (byte)temp2;					// int -> byte 강 형변환
      System.out.println(result2);
      ```
  


    

        
    

  



















