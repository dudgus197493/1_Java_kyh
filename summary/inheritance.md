# 상속
> ## 다른 클래스가 가지고 있는 **멤버(필드, 메소드)**들을 새로 작성할있 클래스에서 직접 만들지 않고 **상속**으 받음으로써 새 클래스가 **자신의 멤버처럼** 사용할 수 는 기능
> *자식이 부모의 멤버를 물려받아서 자신의 멤버로 사용*  
> </br>
## 목차
### 1. [상속의 목적](#상속의-목적)
### 2. [상속의 장점](#상속의-장점)
### 3. [상속의 방법 - 표현식](#방법-표현식)
### 4. [단일 상속과 다중 상속](#단일-상속과-다중-상속)
### 5. [상속의 특징](#상속의-특징)
### 6. [super()와 super.](#super와-super-에-대해서)
### 7. [오버라이딩](#오버라이딩overriding)
### 8. [오버로딩](#오버로딩overloading)
### 9. [오버라이딩과 오버로딩](#오버라이딩overriding과-오버로딩overloading)
### 10. [final 예약어](#final-예약어)
### Ex. [접근제어자, 예약어 정리](#대상에-따른-사용-가능한-제어자-예약어-정리)
- ## 상속의 목적
    > ### 클래스의 **재사용**, 연관된 일련의 클래스들에 대한 **공통적인 규약 정의**

- ## 상속의 장점
    ### 1. 보다 **적은 양의 코드**로 새로운 클래스 작성 가능
    ```Java
    // 예제 코드
    class Person{
        private String name;
        private int age;
        private final int LIFE_EXP = 85; // 평균 수명
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    class Student extends Person {
        // private String name;
        // private int age;
        // 여러 메서드 등등....
        private int grade;
        private int classRoom;
        public Student(String name, int age, int grade, int classRoom) {
            // setName(name);
            // setName(age);
            super(name, age);

            this.grade = grade; 
            this.classRoom = classRoom;
        }
    }
    ```
    > #### 상속을 활용하면 같은 속성과 기능을 가진 클래스를 작성할 때 필드와 메서드를 일일이 작성하지 않고, 
    > #### 위 예제에서는 `extends Person` 두 단어로 부모 클래스의 속성과 기능을 가져올 수 있다.

    ### 2. 코드를 공통적으로 관리하기 때문에 **코드의 추가 및 변경 용이**
    > #### 예제코드에서 Person LIFE_EXP 필드의 값을 90으로 바꾸면 Person을 상속하는 모든 클래스의 LIFE_EXP 값이 바뀐다.

    ### 3. 코드의 **중복을 제거**하여 프로그램의 **생산성과 유지보스에 크게 기여**  
    ```Java
    public Student(String name, int age, int grade, int classRoom) {
        // setName(name);
        // setName(age);
        super(name, age);

        this.grade = grade; 
        this.classRoom = classRoom;
    }
    ```
    > #### 이미 만들어진 부모 클래스의 생성자를 재활용하여 필드를 초기화 하는 중복코드를 제거 하였다.
    </br>


- ## 방법 (표현식)
    > ### 클래스 간의 상속 시에는 `extends` 키워드 사용
    ```Java
    public class Student extends Person {}
    // [접근제한자] class 클래스명 extends 클래스명 {}
    ```  
    </br>

 
## 단일 상속과 다중 상속

- ### 단일 상속(Single Inheritance)
    > #### 클래스간의 관계가 **다중 상속보다 명확**하고 신뢰성 있는 코드 작성
    > #### 자바에서는 다중 상속 미지원 -> ***단일상속만 지원***
- ### 다중 상속(Multiple Inheritance)
    > #### C++에서 가능한 기능으로 여러 클래스로부터 상속을 받으며 **복합적인 기능**을 가진 클래스를 쉽게 작성 가능
    > #### 서로 다른 클래스로부터 **상속 받은 멤버 간의 이름이 같은 경우** 문제 발생  

    </br>

## 상속의 특징

### 1. 모든 클래스는 **Object클래스의 후손**
> #### Object클래스가 제공하는 메소드를 오버라이딩 하여 메소드 재구현 가능
> *ex) java.lang.String 클래스의 equals()와 toString()*
- #### Object 클래스의 메서드들
    ![Object클래스의 메서드](https://kookyungmin.github.io/image/java_image/java_image_144.png)


### 2. 부모클래스의 생성자, 초기화 블록은 **상속 안 됨**
- #### 자식 클래스 생성 시, **부모 클래스 생성자가 먼저 실행**
    ```Java
    // 예시 코드
    class ExampleRun {
        public static void main(String[] args) {
            B b = new B();
            // 출력
            // A생성자 실행
            // B생성자 실행
        }
    }
    class A {
        private int a;

        public A(){ System.out.println("A생성자 실행"); }
        public A(int a) {
            this.a = a;
        }
    }
    class B extends A {
        private int b;
        public B(){
            // public A(){} 생성자는 상속 되지 않음.
            System.out.println("B생성자 실행");
        }
    }
    ```  

- #### 자식 클래스 생성자 안에서 부모 클래스 생성자 호출을 명시하고 싶으면 **super()** 활용

    ```Java
    public B (int b) {
        super();        // super() 메서드는 가장 먼저 실행 되어야 함
        // super(3)     // 인자를 조절하여 오버로딩된 부모클래스의 생성자 실행 명시 가능
        this.b = b;
    }
    ```

### 3. 부모의 **private** 멤버는 상속은 되지만 **직접 접근 불가**
- #### 자식 객체 생성 시에 부모의 필드 값도 전달 받은 경우, 자식 생성자 안에서 부모의 private 필드에 직접 접근하여 대입 불가
    ```Java
    public B (int a, int b){
        // a = a; 상속받았더라도 private필드에 직접 접근 불가

        super(a);   // super() 생성자 또는
        setA(a);    // getter/setter 사용해 접근
    }
    ```  
    </br>

## super()와 super. 에 대해서
- ### super();
  ```Java
  // 위 예시 코드에서
  class B {
    private b
    public B() {
        super();     // 기본적으로 부모 생성자 포함
        //super(a);  // 인자를 조절해 오버로딩된 부모 생성자 명시 가능
        this.b = b;  // B의 필드 초기화 구문 보다 위에 작성
    }
  }
  ```
  - 부모 객체의 생성자를 호출하는 메서드, 기본적으로 후손 생성자에 부모 생성자 포함
  - 후손 객체 생성 시에는 부모부터 생성이 되기 때문에 후손 클래스 생성자 안에 부모생성자를 호출하는 super()가 **첫줄**에 존재 *부모 생성자가 가장 먼저 실행되어야 하기 때문에 명시적으로 작성 시 반드시 첫 줄에 작성*
  - 매개변수 있는 부모 생성자 호출은 super(매개변수)를 넣으면 됨
- ### super.
  ```Java
  // 위 예시 코드에서
  class B {
    super.getA();   // 부모 클래스의 메서드사용을 명시
    super.setA(a);
    super.a;        // 부모필드에 접근 가능 (접근제한 허용 시)
  }
  ```
  - 상속을 통한 자식 클래스 정의 시 해당 자식 클래스의 부모 객체를 가리키는 참조변수
  - 자식 클래스 내에서 부모 클래스 객체에 접근하여 필드나 메소드 호출 시 사용  
  </br>


## 오버라이딩(Overriding)
```Java
// 예시 코드
class Person {
    public void introduce(){
        System.out.println("Person 클래스 입니다.");
    }
}
class Student extends Person {
    @Override
    public void introduce(){
        System.out.println("Student 클래스 입니다.");
    }
}
main () {
    Person p1 = new Person()
    Student s1 = new Student();
    p1.introduce(); 
    s1.introduce();
    // 출력
    // Person 클래스 입니다.
    // Student 클래스 입니다.
}
```
> ### 자식 클래스가 상속 받은 부모 메소드를 재작성 하는 것
> 부모가 제공하는 기능을 후손이 일부 고쳐 사용하겠다는 의미
> 자식 객체를 통한 실행 시 후손 것이 우선권을 가짐

- ### 특징
  - #### 메소드 헤드라인 위에 반드시 **Annotaion, @Override** 표시
    - **Annotaion이란**
      - 컴파일러에게 해당 코드가 무엇을 의미하는지, 해당 코드를 수행하기 전에 무엇을 해야하는지 등을 알려줌
    - **Annotaion중 *@Override***
      - 컴파일러에게 해당 메서드는 오버라이딩 되었음을 알려줌
      - 오버라이딩이 가능한지, 잘못 작성되지 않았는지 검사
        ```Java
        // 위 예시 코드에서
        @Override
        public void introduc() {    // [에러]개발자의 의도는 오버라이딩이지만 오타가 난것을 컴파일러가 잡아줌
            //....
        }
        @Override
        public void method() {      // [에러]부모클래스에 오버라이딩 가능한 method()가 없음
            //....
        }
        ```
  - #### 접근 제어자를 부모 것보다 같거나 넓은 범위로 변경 가능
    ```Java
    class A {
        protected void method() {};
    }
    class B {
        @Override
        public void method() {};  // 오버라이딩 가능
        @Override
        private void method() {}; // 오버라이딩 불가능
    }
    ```
  - #### 부모 메소드의 예외처리 클래스 처리범위보다 좁은 범위로 예외처리 클래스 수정 가능

- ### 성립 조건
  - 부모 클래스의 메소드와 자식 클래스의 메소드 비교
    1. **메소드 이름** 동일
    2. 매개변수의 **개수, 타입, 순서** 동일
    3. **리턴 타입** 동일
    4. **private 메서드** 오버라이딩 불가  
</br>

## 오버로딩(Overloading)
> ### 한 클래스 내에서 같은 이름의 메소드를 여러 개 정의하는 것
- 성립 조건
  - 같은 메서드 이름
  - 다른 매개변수 선언부(매개변수 타입, 개수, 순서)
- 주의 사항
  - 메소드의 리턴타입은 오버로딩 조건과 관계 없음
    ```Java
    class TestClass{
        public int method() {
            return 0;
        }
        public String method(){
            return null;
        }

        // Duplicate method test() in type TestClass
        // 메서드 중복 선언 에러
    }
    ```  
    </br>
    
## 오버라이딩(Overriding)과 오버로딩(Overloading)
|**오버라이딩(Overrideing)**|**오버로딩(Overloading)**|
|:--:|:--:|
|하위 클래스에서 메소드 정의|같은 클래스에서 메소드 정의|
|메소드 이름 **동일**</br>매개변수 **동일**(개수, 타이, 순서)</br>리턴 타입 **동일**|메소드 이름 **동일**</br>매개변수 **다름**(개수, 타입, 순서)리턴 타입 **상관 없음**|
|자식 메서드의 접근 범위가</br>부모 메서드의 접근 범위보다 **넓거나 같아야 함**|접근 제어자와 **상관 없음**|
|자식 메소드의 예외 수가</br>부모 메소드의 예외 수보다 **적거나</br>범위가 좁아야 함**|예외처리와 **상관 없음**|
</br>


## final 예약어
- ### final 클래스와 final 메서드
    ```Java
    public final class Parent {
        public final void method1(){
            System.out.println("부모의 메서드");
        }
    }
    class Child extends Parent { // The type Child cannot subclass the final class Parent
        @Override
        public void method1(){ // Cannot override the final method from Parent
            System.out.println("자식의 메서드");
        }
    }
    ```
    > ### final 클래스 : 상속이 불가능한 클래스  
    > ### final 메서드 : 상속 시 오버라이딩이 불가능한 메서드  
    </br>

## 대상에 따른 사용 가능한 제어자, 예약어 정리
|대상|사용 가능한 제어자/예약어|
|:--:|:--:|
|클래스|public, (default), final, abstract|
|메서드|모든 접근 제어자, final abstract, static|
|변수|모든 접근 제어자, final, static|
|지역변수|final|
- ### 유의 사항
  - #### 클래스에 abstract와 final 동시에 사용 불가능
  - #### 메서드에 static과 abstract 동시에 사용 불가능
  - #### abstract 메서드의 접근제어자로 private 불가능