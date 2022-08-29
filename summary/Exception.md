# 예외 처리 (Exception Handling)
## 목차
### 1. [프로그램 오류](#1-프로그램-오류)
- [오류의 종류](#오류의-종류)
- [오류 해결 방법](#오류-해결-방법)
### 2. [예외 확인](#예외-확인)
### 3. [예외 클래스 계층 구조](#예외-클래스-계층-구조)
- [Unchecked Exception](#unchecked-exception)
- [Checked Exception](#checked-exception)
### 4. [try ~ catch ~ finally](#try--catch--finally)
### 5. [예외 처리 방법](#예외-처리-방법)
### 6. [Exception과 오버라이딩](#exception과-오버라이딩)  
</br>

## 프로그램 오류
> ### 프로그램 수행 시 치명적 상황이 발생하여 비정상 종료 상황이 발생한 것(프로그램 에러)

- ### 오류의 종류
    1. 컴파일 에러 
        - 프로그램의 실행을 막는 소스 코드상의 문법 에러. *소스 코드 수정으로 해결.*
        ```Java
        int num
        // Syntax error, insert ";" to complete BlockStatements
        // 문장 마지막에 ;를 적지 않아 발생한 문법 오류
        ```
    2. 런타임 에러
        - 프로그램 실행 중 발생하는 에러. *주로 if문 사용으로 에러 처리*
        ```Java
        int a = 5;
        int b = 0;
        System.out.println(a / b); // 실행전 컴파일러가 잡아내지 못함
        // [실행]
        //  java.lang.ArithmeticException: / by zero

        ```
    3. 시스템 에러
        - 컴퓨터 오작동으로 인한 에러, *소스 코드 수정으로 해결 불가*
- ### 오류 해결 방법
  > **소스 코드 수정**으로 해결 가능한 에러를 **예외(Exception)**라고 함
  > 이러한 예외 상황 **(예측 가능한 에러)** 구문을 처리 하는 방법인 **예외 처리**를 통해 해결

## 예외 확인
- ### Exception 확인하기
    - [Java API Document](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html)에서 해당 클래스에 대한 생성자나 메서드를 검색하면 그 메서드가 어떤 Exception을 발생시킬 가능성이 있는지 확인 가능.
    - 발생하는 예외를 **미리 확인하여** 상황에 따른 예외 처리 코드를 작성할 수 있음  
  </br>

## 예외 클래스 계층 구조
> ### Exception과 Error 클래스 모두 Object 클래스의 **자손**이며 모든 예외의 최고 조상은 **Exception** 클래스
> #### Checked Exception : 반드시 예외 처리해야 함
> #### Unchecked Exception : 반드시 처리 해주지 않아도 됨
![예외 클래스 상속 계층도](https://1.bp.blogspot.com/-CIIzK5WbWVw/XkY-sIRRxzI/AAAAAAAAhT8/RsxzdirDy4QQrArHXjAOZE3EWsX-RuzBgCLcBGAsYHQ/s1600/a.jpg)

- ### Unchecked Exception 
> #### 선택적으로 예외처리구문을 작성해도 되는 예외
> #### RuntimeException 클래스
> **Unchecked Exception**으로 주로 *프로그래머의 부주의로 인한 오류*인 경우가 많기 때문에 예외 처리보다는 **코드를 수쟁**헤애 하는 경우가 많음
- #### RuntimeException 후손 클래스
  - ArithmeticException
    > 0으로 나누는 경우 발생  
    > if문으로 나누는 수가 0인지 검사
    ```Java
    int a = 5;
    int b = 0;
    System.out.println(a / b);
    // java.lang.ArithmeticException: / by zero

    // 코드 수정으로 해결
    if (b!=0) {
        System.out.println(a / b);
    }
    ```

  - NegativeArraySizeException
    > 배열 크기를 음수로 지정한 경우 발생  
    > 배열 크기를 0보다 크게 지정해야 함
    ```Java
    int[] arr = null;
    System.out.print("배열 크기 입력 : ")
    int size = sc.nextInt();
    arr = new int[size];
    // 음수 입력 시 
    // java.lang.NegativeArraySizeException: -1
    // 코드 수정으로 해결
    if (size > 0 ){
        arr = new int[size];
    }
    ```

  - ArrayIndexOutOfBoundsException
    > 배열의 index범위를 넘어서 참조하는 경우
    ```Java
    int[] arr = new int[4];
    for(int i =0; i < 6; i++) {
        arr[i] = i + 1;
    }
    // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    // 코드 수정으로 해결
    for(int i =0; i<arr.length; i++){
        arr[i] = i + 1;
    }
    ```

  - NullPointerException 
    > Null인 참조 변수로 객체 멤버 참조 시도 시 발생
    > 객체 사용 전 참조 변수가 null인지 확인
    ```Java
    Student std = null;

    std.introduce();
    //  java.lang.NullPointerException: Cannot invoke "codeTest.Student.introduce()" because "std" is null

    // 코드 수정으로 해결
    if(std != null) {
        std.introduce();
    }
    ```
  - ClassCastException 
    > Cast연산자 사용 시 타입 오류  
    > **instanceof** 연산자로 객체타입 확인 후 cast연산
    ```Java
    public static void main(String[] args) {
        executeSpark(new Car());
        executeSpark(new Spark());
        executeSpark(new Truck());
    }
    public void executeSpark1(Car c){
        ((Spark)c).dc();
        // java.lang.ClassCastException: class codeTest.Car cannot be cast to class codeTest.Spark
    }
    // 코드 수정으로 해결
    public void executeSpark2(Car c) {
        if(c instanceof Spark) {
            ((Spark)c).dc();
        }
    }
    ```  

  - InputMismatchException
    > Scanner를 사용하여 데이터 입력 시  
    > 입력 받는 자료형이 불일치할 경우 발생
    ```Java
    System.out.print("정수 입력 : ");
    int input = sc.nextInt();
    // 정수 입력 : 일
    // java.util.InputMismatchException
    // try ~ catch로 해결
    ```

- ### Checked Exception
  > 반드시 예외 처리 구문을 작성 해줘야 하는 클래스
  > try ~ catch문으로 감싸 예외 처리


## try ~ catch ~ finally
- ### try : 
  - **Exception 발생할 가능성이 있는 코드**를 안에 기술

- ### catch : 
  - try 구문에서 Exception 발생 시 해당하는 Exception에 대한 처리 기술
  - 여러 개의 Exception 처리가 가능하나 Exception간의 **상속 관계** 고려

- ### finallty :
  - Exception 발생 여부와 관계없이 꼭 처리해야 하는 로직 기술
  - 중간에 `return`을 만나도 finally구문은 실행
  - `System.exit()`를 만나면 무조건 프로그램 종료
  - 주로 java.io 나 java.sql 패키지의 메소드 처리 시 이용(*자원 반환 메서드*)

```Java
// SampleCode 
System.out.print("정수 입력 : ");
try {
    int input = sc.nextInt();
    System.out.println("입력한 정수 : " + input);
} catch(InputMismatchException e) {
	e.printStackTrace();
	System.out.println("정수를 입력해주세요.");
} finally {
	System.out.println("프로그램 종료");
}
```

```Java
// 여러개의 예외 처리시 주의점
System.out.print("정수 입력 : ");
try {
    int input = sc.nextInt();
    System.out.println("입력한 정수 : " + input);
} catch(InputMismatchException e) { // 예외 상속 계층이 낮은 것부터 검사해야 한다.
	e.printStackTrace();
	System.out.println("정수를 입력해주세요.");
} catch(Exception e) {
    e.printStackTrace();
    System.out.println("예외가 발생했습니다.");
} finally {
	System.out.println("프로그램 종료");
}
```


## 예외 처리 방법
### 1. Exception이 발생한 곳에서 직접 처리
- 예외가 발생할 수 있는 자리에 `try ~ catch ~ final`를 사용하여 바로 처리

### 2. Exception 처리를 자신을 호출한 메서드에게 위임
- 메서드 선언 시 `throws Exception`명을 추가하여 **호출한 상위 메서드에게 처리 위임**
- 계속 위임하면 main() 메서드까지 위임 (*main()에서도 처리되지 않는 경우 프로그램 비정상 종료*)
- 발생한 예외를 한번에 모아 처리할 때 사용
```Java
public static void main(String[] args) {
    try {
        methodA();
    }catch(IOException e) {
        e.printStackTrace(); 
    //     java.io.IOException
	// at codeTest.testCode.methodC(testCode.java:29)
	// at codeTest.testCode.methodB(testCode.java:26)
	// at codeTest.testCode.methodA(testCode.java:23)
	// at codeTest.testCode.test1(testCode.java:17)
	// at codeTest.testCode.main(testCode.java:12)

    } finally {
        System.out.println("프로그램 종료");
    }
}
public static void methodA() throws IOException {
    methodB();
}
public static void methodB() throws IOException {
    methodC();
}
public static void methodC() throws IOException {
    throw new IOException(); // 강제 IOException 발생
}
```

## Exception과 오버라이딩
> ### 오버라이딩 시 `throws`하는 Exception의 개수와 상관없이 처리 범위가 같거나 후손 이여야 함
> *Exception 클래스는 상속이 될 수록 상위 클래스보다 예외의 내용이 더 상세하기 기술됨.(자식 클래스)*

```Java
// Sample Code
public class Parent {
    public void method() throws IOException {

    }
}
class ChildA extends Person{
	@Override
    // Exception은 IOException의 부모
	public void method() throws Exception{ // [에러] Exception Exception is not compatible with throws clause in Person.method()
		
	}
}
class ChildB extends Person {
	@Override
    // EOFException은 IOException의 후손
	public void method() throws EOFException{
		
	}
}
```
  
  

