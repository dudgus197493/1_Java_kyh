# 변수 (Variable)

> #### **메모리**(RAM)에 값을 **기록**하기 위한 공간(박스)

- 공간(박스)에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.

- 값(Data)의 **형태**와 **크기**에 따라서 변수의 형태(**자료형**)은 달라져야 한다.

## 변수 사용의 목적

#### 1. 가독성 향상 및 코드 길이의 감소

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



#### 2. 유지 보수성 향상

*example 1* 코드에서 데이터 10을 5로 바꾸려면 **n번**(코드상에 10이 들어가는 갯수) 고쳐 써야 한다.

```Java
System.out.println(2 * 3.141592653589793 * 5);
System.out.println(3.141592653589793 * 5 * 5);
System.out.println(3.141592653589793 * 5* 5 * 20);
System.out.println(4 * 3.141592653589793 * 5 * 5);
```



변수를 쓴다면 **n번**의 수정을 단 **한번**의 변경으로 수정할 수 있다.

### ` int r = 5;`  



#### 3. 재사용성의 증가

한번 만든 변수는 **계속** 사용 할 수 있다.





## 변수의 데이터 저장 단위

> #### 저장 공간이 제한적이기 때문에 저장 크기에 대한 기준과 CPU가 데이터를 처리할 때 일정한 기준 필요




- #### 비트(bit)

  - 컴퓨터가 나타내는 **데이터의 최소 저장 단위**로서 **2진수 값 하나**를 저장할 수 있는 **메모리공간 **을 의미



- #### 바이트(byte)

  - **데이터 처리** 또는 **문자의 최소 단위** 로서 8개의 비트가 모여 하나의 바이트가 구성됨



![비트와 바이트](https://velog.velcdn.com/images/hshs0409/post/6346fdee-9f2a-4532-a114-3a2f2018ea5d/image.png)



## 변수의 데이터 저장 단위
> #### 메모리 공간에 데이터를 저장할 수 있는 공간을 할당하는 것



- #### 선언 방법

  - **자료형** + **변수명** + **;**



- #### 선언 예시

  ```java
  // 논리형 변수 선언		   // 정수형 변수 선언
  boolean isTure;				byte bNum;
  							short sNum;
  							int iNum;
  							long lNum;
  // 문자형 변수 선언            // 실수형 변수 선언
  char ch;					float fNum;
  							double dNum;
  // 문자열 변수 선언
  String str;					
  ```

  

- #### 변수 저장 가능 범위

![변수 저장 가능 범위](https://t1.daumcdn.net/cfile/tistory/99297E505A966DD619)



## 변수의 명명 규칙

#### 1. 대소문자가 구분되며 길이 제한이 없다.









