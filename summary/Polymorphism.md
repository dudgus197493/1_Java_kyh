# 다형성(Porymorphism) : 다양한 모양을 지닐 수 있는 성질
> ### **다양한 형태를 갖는다**
> ### 하나의 행동으로 여러 가지 일을 수행
> ### 상속을 이용하여 **부모 클래스 타입 참조변수** 하나로 상속 관계에 있는 여러 타입의 **자식 객체를 참조** 할수 있는 기술
```Java
Car c1 = new Truck(); // Truck이 Car의 형태도 갖음
```
  
  </br>

## 목차
### 1. [클래스 형변환(업캐스팅, 다운캐스팅)](#클래스-형변환)
### 2. [바인딩](#바인딩)
### 3. [instanceof](#instanceof-연산자)
### 4. [추상클래스](#추상-클래스)
### 5. [인터페이스](#인터페이스)
### 6. [추상클래스와 인터페이스 정리](#추상클래스와-인터페이스-정리)
### Ex. [추가적인 추상클래스와 인터페이스 특징](#추가적인-추상클래스와-인터페이스-특징)
  
  </br>

## 클래스 형변환
- ### 업 캐스팅(Up Casting)
    > 상속 관계에 있는 클래스 간에 **부모타입 참조형 변수** -> **모든 자식 타입 객체의 주소** 참조 가능
    ```Java
    // Truck 클래스는 Car클래스의 후손
    Car c  new Truck();
    // Truck 클래스에서 Car클래스형으로 바뀜

    // ＊자식 객체의 주소를 저장한 부모타입 참조 변수는 **부모의 멤버만 참조 가능 
    c.loading(); // [에러] Truck의 메서드 실행 불가
    ```
    
    ![메모리위에서의 다형성중 업캐스팅](images/다형성%20메모리%20구조.png) 
- ### 다운 캐스팅(Down Casting)
    > 자식 객체의 주소를 받은 부모 참조형 변수가 자식의 멤버 참조 시  
    > **부모 타입**의 참조형 변수 -> **자식 타입** 으로 ***형변환***(*반드시 자식 타입을 명시하여 형변환*)
    ```Java
    // Truck 클래스는 Car클래스의 후손
    Car c = new Truck();

    // c.loading() -> 부모타입 참조변수로는 부모의 멤버밖에 참조할수 없기에 자식의 메서드 실행 불가
    ((Truck)c).loading();   // 다운캐스팅을 통해 자식의 멤버 참조 가능

    Truck t = (Truck)c;     // 다른 변수에 저장(얕은복사) 하면서도 다운 캐스팅 가능

    // ＊클래스 간의 형 변환은 반드시 상속 관계인 클래스 끼리만 가능
    ((Person)c).introduce(); // 다운 캐스팅 불가능
    ```

### 다형성의 적용 예시
- #### 객체배열과 다형성
```Java
Car[] carArr = new Car[3];
carArr[0] = new Spark();
carArr[1] = new Truack();
carArr[2] = new Car();
```
> 다형성을 이용하여 상속 관계에 있는 하나의 부모 클래스 타입의 배열 공간에  **여러 종류의 자식 클래스 객체** 저장 가능

- #### 매개변수와 다형성
    ```Java
    public execute() {
        printCar(new Truck());
        printCar(new Car());
        printCar(new Spark());
    }

    public void printCar(Car c) { // Car 타입 참조변수 c로 자식 객체들을 저장함(업 캐스팅)
        System.out.println(c); // 각자 오버라이딩된 toString 메서드 실행
    }
    ```
    - ***만약 다형성이 없다면***
        > 해당 클래스에 대한 출력 메서드를 따로 만들어야 함
        ```Java
        public void printTruck(Truck c){
            System.out.println(c);
        }
        public void printSpark(Spark c){
            System.out.println(c);
        }
        ```  
        </br>

## 바인딩
> ### 함수 호출 시 호출된 부분을 해당 함수의 정의와 연결짓는 것
> ### 메모리 관점에서 함수의 정의가 위치한 메모리 주소로 연결되는 것
> ### **실제 실행**할 메소드 코드와 **호출하는 코드**를 연결 시키는 것
```Java
// Truck은 Car의 후손 클래스이며 toString()을 오버라이딩함
Car c = new Truck();

c.toString();           // String edu.kh.poly.ex1.model.vo.Car.toString()
                        // 실제 이클립스 안내 문구도 Car의 toString()을 연결함

                        // [출력 내용]
                        // Truck입니다. -> 실행중 참조변수 c가 실제 가리키는 객체타입을 검사하여 오버라이딩된 메서드를 연결한다.
Track t = new Truck();
t.loading();            // 동적바인딩이 아님
                        // 생성된 인스턴스와 참조하는 타입이 같아 저장되어있는 함수를 실행한 것 뿐
```
- ### 정적 바인딩
  - 프로그램이 실행되기 전 ***컴파일 단계*에서 메소드와 메소드 호출부를 연결**

- ### 동적 바인딩
  - 컴파일 시 정적 바인딩된 메소드를 ***실행할 당시*의 객체 타입을 기준으로 바인딩** 되는 것

## instanceof 연산자
> ### 참조하는 객체의 타입을 검사
> ### 참조하는 객체가 특정 타입을 상속 받았는지 검사
> ***return true/false***

```Java
public void execute() {
    printCar(new Truck());
    printCar(new Car());
    printCar(new Spark());
}

public void example1(Car c) {  // 업캐스팅을 이용해 매개 변수를 받음
    if(c instanceof Spark) {  // instanceof를 이용해 c가 Spark를 참조하거나 상속 받았다면
        ((Spark)c).discountOffer();  // 다운 캐스팅 후 Spark고유의 메서드 호출 
    } else if(c instanceof Truck) {  // 검사 해서
        ((Truck)c).loading();  // Truck고유의 메서드 호출
    } else {
        System.out.println("부모 Car 타입입니다.");
    }
}

// instanceof 를 검사할 때 상속계층의 아래층부터 검사해야 한다.
public void example2(Car c) {
    if(c instanceof Car) {  
        System.out.println("부모 Car 타입입니다.");
    } else if(c instanceof Truck) { 
        ((Truck)c).loading(); 
    } else {
        ((Spark)c).discountOffer(); 
    }    
    // Truck과 Spark의 주소가 매개변수로 주어져도 
    // System.out.println("부모 Car 타입입니다."); 된다.
}
```  
</br>



## 추상 클래스
- ### 추상 클래스(abstract class)
    > #### **몸체 없는 메서드를 포함한 클래스 (미완성 설계도)**
    > *추상 클래스일 경우 클래스 선언부에 `abstract` 키워드 사용
    ```Java
    /*[접근제한자]*/ abstract class ExampleClass {
        // ....
    }
    ```
- ### 추상 메서드(abstract method)
    > #### **몸체 없는 메서드**
    > *상속 시 반드시 구현해야 하는, 오버라이딩이 **강제화**되는 메서드*
    ```Java
    /*[접근제한자]*/ abstract void exampleMethod();
    ```

### 추상 클래스 특징
1. 미완성 클래스(`abstract` 키워드 사용)
    - 자체적으로 **객체 생성 불가** -> ***반드시 상속하여 객체 생성***
        ```Java
        // Animal은 추상 클래스 (setType이라는 메서드를 가지고 있음)
        Animal animal = new Animal(); // Cannot instantiate the type Animal

        Fish f1 = new Fish();
        f1.setType("어류"); // 자식 클래스를 통해 인스턴스를 생성하여 Animal의 메서드 호출
        ```
2. `abstract` 메서드가 포함된 클래스는 반드시 `abstract`클래스
    - `abstract` 메서드가 없어도 `abstract` 클래스 선언 가능 -> *객체 생성 제한*
3. 클래스 내에 일반 변수, 메서드 포함 가능
4. 객체 생성은 안되지만 참조형 변수 타입으로는 사용 가능(*업 캐스팅*)
    ```Java
    // 추상 클래스는 부모타입의 참조변수로 사용 가능
    Animal a1 = new Fish();
    Animal a2 = new Person(); 
    // 추상 클래스로 업 캐스팅 가능
    ```

### 추상 클래스 장점
- 상속 받은 자식에게 공통된 멤버 제공.
- 일부 기능의 구현을 **강제화**(공통적이나 자식 클래스에 따라 재정의 되어야 하는 기능)
    ```Java
    // Animal은 breath를 추상메서드로 가지고있는 추상 클래스
    Animal[] arr = new Animal[3];

    arr[0] = new Person();
    arr[1] = new Person();
    arr[2] = new Fish();
    for(int i = 0; i<arr.length; i++){
        arr[i].breath();
    }

    // 일반 클래스의 상속은 부모의 메서드를 선택적으로 오버라이딩 하기 때문에 후손클래스가 breath()를 갖고 있지 않을 경우가 있지만
    // 추상클래스는 후손클래스가 자신의 추상메서드를 무조건 오버라이딩하게 만들기 때문에 위 코드에서 절대 오류가 나지 않음
    ```  
    </br>





## 인터페이스
> ### **상수형 필드**와 **추상 메서드**만을 작성할 수 있는 추상 클래스의 변형체
> 메서드의 통일성(접점)을 부여하기 위해 추상 메서드만 따로 모아놓은 것
> *상속 시 인터페이스 내에 정의된 모든 추상메서드 구현해야함*
```Java
// [] : 암묵적으로 약속 (컴파일러가 자동적으로 포함)
/*[접근제한자]*/ interface ExInterface {
    // 상수도 멤버로 포함 가능
    [public static final] int EX_VALUE = 0;

    // 추상 메소드만 선언 가능
    [public abstract] int exMethod();
    // public abstract가 생략되기 때문에
    // 오버라이딩 시 반드시 public 표기해야 함
}
```
- 추상클래스와의 차이
  - **접점**이라는 의미 추가
  - 클래스 선언부 변경(`class` -> `interface`)
  - 필드/메서드 작성법이 고정  
  </br>

### 인터페이스 특징
1. 모든 인터페이스의 메소드는 묵시적으로 `public abstract`
2. 변수는 묵시적으로 `public static final`
3. 객체 생성은 안되나 참조형 변수로는 가능(다형성, 업 캐스팅)

### 인터페이스 장점
1. 다형성을 이용하여 **상위 타입 역할**(자식 객체 연결) -> [인터페이스도 업 캐스팅 가능](#업-캐스팅up-casting)
2. 인터페이스 구현 객체에 공통된 기능 구현 강제화 -> [구현 객체간의 일관성 제공](#추상-클래스-장점)[*추상클래스의 오버라이딩 강제화와 동일*]
3. 공동 작업을 위한 인터페이스 제공  
</br>

## 추상클래스와 인터페이스 정리
|**구분**|**추상 클래스**|**인터페이스**|
|:--:|:--:|:--:|
|상속|단일상속|다중상속|
|구현|`extends` 사용|`implements` 사용|
|추상 메소드|`abstract` 메서드 **0**개 이상|**모든** 메서드는 `abstract`|
|`abstract`|명시적 사용|묵시적으로 `abstract`|
|객체|객체 생성 불가|객체 생성 불가|
|용도|참조 타입|참조 타입|

## 추가적인 추상클래스와 인터페이스 특징
- ### 클래스 상속
  - 부모가 **완성한** 기능을 자식이 물려 받아 사용(자식기능 + 부모기능 == 객체의 크기가 확장)
  - 인스턴스 생성 시 부모 인스턴스가 내부에 생성 됨

- ### 인터페이스 상속
  - 부모가 이름만 있는 미완성 기능을 물려줌(자식이 이름만 있는 메서드를 물려받아 오버라이딩 해서 완성)
  - 인스턴스 생성 시 부모 인스턴스가 내부에 생성되지 않음