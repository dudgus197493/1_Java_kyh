# 객체 지향 프로그래밍(Object Oriented Programming)
> ### 현실에 존재하는 독립적이면서 하나로 취급되는 사물이나 개념
> ### 객체 지향 언어에서 객체의 개념은 클래스에 정의된 내용대로 메모리에 할당된 결과물(Object)

### 객체 지향 3 + 1대 특징
1. #### 캡슐화(Encapsulation)
2. #### 상속(Inheritance) + 추상화(Abstraction)
3. #### 다형성(Polymorphism)

### **현실**에서 객체(Object)란?
> #### 자신의 **속성(값, data)**과 **기능(동작, 행동)**이 다른 것들 과 구분되어 식별 가능한 것

### **자바**에서 객체(Object)란?
> #### 클래스에 정의된 내용대로 **new 연산자**를 통해 **메모리 영역에 생성**된 것
- #### 객체(instance)의 할당
> ##### new 연산자와 생성자를 사용하여 객체 생성 시 Heap메모리 영역에 서로 다른 자료형의 데이터가 연속으로 나열/할당된 객체 공간
> ##### 배열의 메모리구조에서 *배열도 객체다.*
![new 연산자를 통한 객체 생성](images/배열%20메모리%20구조2.png) 

### 객체 지향 언어란?
> #### 현실 세계는 사물이나 개념처럼 독립되고 구분되는 **각각의 객체**로 이루어져 있음
> #### 발생하는 **모든 사건등른 객체간의 상호작용**.
> 이 개념을 컴퓨터로 옮겨 놓아 만들어낸 것이 **객체지향 언어**

### 객체와 인스턴스의 차이점


### 추상화(abstraction)
> ### **유연성**을 확보하기 위해 구체적인 것은 제거한다는 의미
> ### 프로그램에서 **필요한 공통점을 추출**하고, **불필요한 부분을 제거**하는 과정

#### 추상화 예시
- ##### 우리나라 국민을 추상화 한다면
  - 주민등록번호
  - 이름
  - 성별
  - 주소
  - 전화번호
  - 나이  

  -> *국민이라면 가지는 공통점을 추려냄*
#### 프로그래밍 언어를 사용한 추상화
> ##### 변수명(데이터 이름)과 자료형(데이터 타입)정리
|**항목**|**변수명**|**자료형(type)**|
|:--:|:--:|:--:|
|주민등록번호|pNo|String|
|이름|name|String|
|성별|gender|char|
|주소|address|String|
|전화번호|phone|String|
|나이|age|int|
```Java
// 자바 코드에서
public class Nation {
    private String pNo;      // 주민등록 번호
    private String name;     // 이름
    private char gender;     // 성별
    private String address;  // 주소
    private String phone;    // 전화번호
    private int age;         // 나이
}
```  
</br>

### 캡슐화(Encapsulation)
> #### 추상화를 통해 추린 **속성**, **기능**을 하나로 묶어 관리
> #### 클래스 외부에서 **데이터의 직접 접근제한을 원칙**
> #### 간접적으로 데이터에 접근할 수 있는 메서드를 클래스 내부에 작성

- #### 캡슐화 원칙
    1. 클래스의 **멤버 변수**에 대한 **접근 권한은 private을 원칙**으로 함
    2. 클래스의 멤버 변수에 대한 연산처리를 목적으로 하는 **멤버 메서드는 클래스 내부에 작성**
    3. **멤버 메서드**는 외부에서 간접 접근이 가능하도록 **public**으로 설정
    ```Java
    // 캡슐화 원칙을 지킨 클래스
    public class ExampleClass{
        private String name;    // 접근제한자를 private로 설정
        private int age;

        public void introduce(){
            System.out.println("이름은 " + name + " 나이는 " + age); // 멤버 메서드는 클래스 내부에 작성하고 접근제한자는 public으로 설정
        }
        // 외부에서 필드에 접근 할 수 있도록 메서드 구현
        public void setNanme(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    ```  
    </br>

### 접근제한자
> #### 다른 클래스에서 해당 클래스로 접근할 수 있는 범위를 제한하는 키워드
> #### [클래스](#클래스-접근제한자), [필드](#필드-접근제한자), 메서드 각각 붙을 수 있는 접근제한자가 다르다  
</br>


## 클래스(class)
> ### 객체의 특성(속성, 기능)에 대한 정의를 한 것 *ex) 제품의 설계도, 빵 틀*
> ### 클래스 작성 시 **반드시** [추상화](), [캡슐화]()가 적용되어야 함

### 클래스의 등장 배경
|변수|1개의 자료형</br>1개의 데이터|
|:--:|:--:|
|배열|1개의 자료형</br>여러 개의 데이터|
|구조체|여러 개의 자료형</br>여러 개의 데이터|
|클래스|여러 개의 자료형</br>여러 개의 데이터</br>여러 개의 기능|

### 클래스 선언
```Java
// [] 은 선택 사항(생략 가능)
[접근제한자] [예약어] class ExampleClass{
    [접근제한자] [예약어] 자료형 변수명;
    [접근제한자] [예약어] 자료형 변수명;
    // ------------> 속성값 설정

    [접근제한자] 생성자명() { }

    [접근제한자] 반환형 메서드명(매개변수) {
        // 기능 정의
    }
}

// 위 규칙을 따른 예제 클래스
public class Member {
    // 필드 : 객체의 속성
    private String name;
    private int age;

    // 생성자(메서드)
    public Member() { }

    // 메서드 : 객체의 기능
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
```  
</br>

### 클래스 접근제한자
|**구분**|**같은 패키지 내**|**전체**|
|:--:|:--:|:--:|
|`public`|O|O|
|`default`|O||
```Java
// 하나의 클래스 파일 안에 두개의 public 클래스는 존재할 수 없다.
public class ExamClass1 {
    // ....
}
class ExamClass2 {
    // ....
}
```  
</br>

## 필드(Field)

### 필드 표현식
```Java
// [] 는 선택 사항(생략 가능)
[접근제한자] [예약어] class 클래스명 {
    [접근제한자] [예약어] 자료형 변수명 [= 초기값];
}

// 위 규칙을 지킨 필드 작성
public class Academy {
    public int temp1;
    protected int temp2;
    /*(default)*/int temp3; // 접근제한자 생략 시 (default)
    private int temp4;      // 필드를 작성 할때 캡슐화의 원칙(직접 접근 제한)을 위해 보통 private을 사용함.
}
```

### 필드 접근제한자
|**구분**|**해당 클래스 내부**|**같은 패키지 내**|**후손 클래스 내**|**전체**|
|:--:|:--:|:--:|:--:|:--:|
|`public`|O|O|O|O|
|`protectd`|O|O|O||
|`(default)`|O|O|||
|`private`|O||||  
</br>

### 필드 예약어 - static
> #### 같은 타입의 여러 객체가 **공유할 목적**의 필드
> #### 프로그램 start시에 **정적 메모리(static) 영역**에 자동 할당
```Java
public class ExClass {
    private static int examNum;
}
```

- #### `static`의 메모리 구조
    ![static 메모리 구조](images/인스턴스%20생성%20메모리%20구조.png)
    - `static` 변수는 참조변수다.  
        **->** Static 메모리공간에 존재하는 Student.schoolName의 주소값을 Student객체 각각의 schoolName 변수가 참조하고 있다.
    - `static` 메모리는 공유 영역이다.
        ```Java
        Student std1 = new Student();
        Student std2 = new Student();

        std1.schoolName = "KH대학교";

        System.out.println(std1.schoolName);
        System.out.println(std2.schoolName);

        // 출력 결과
        // KH대학교
        // KH대학교
        // std1의 schoolName필드값만 바꿨지만 
        // std1의 schoolName의 Static 메모리 주소를
        // std2의 필드도 공유하고 있기 때문에 std2의 값이 바뀐다.
        ```