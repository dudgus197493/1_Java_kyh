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
|`private`|O| | | |  

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

### 필드 예약어 - final
> #### 하나의 값만 계속 저장해야 하는 변수에 사용하느 예약어
```Java
public class ExClass {
    private final int EXAM_VALUE1 = 100;    // 상수 표기와 동일

    private int examValue2;
}
```

### 필드 - 클래스 초기화 블럭
> #### 인스턴습 블럭( `{ }` ) - 인스턴스 변수를 초기화 시키는 블럭, 객체 생성시 마다 초기화
> #### static(클래스) 블럭(`static{ }`) - static 필드 초기화 시키는 블럭, 프로그램 시작 시 한 번만 초기화
```Java
public class ExClass {
    private static int EXAM_VALUE = 10;
    private String examStr;
    static {
        EXAM_VALUE = 20;
    }
    {
        examStr = "초기화 블럭 실행";
        // EXAM_VALUE = 30; // static 변수를 instance 초기화 블럭에서도 초기호 가능
                         // 하지만 인스턴스 생성 시마다 Static영역에 변수 초기화 -> 성능 낭비
    }
}
```

### 필드 - 초기화 순서
- 클래스 변수  

        JVM 기본값  ->  명시적 초기값  ->  클래스 초기화 블럭 초기값
- 인스턴스 변수

        JVM 기본값  ->  명시적 초기값  ->  인스턴스 초기화 블럭 초기값  ->  생성자를 통한 초기값  
</br>

## 생성자(Constructor)
> ### 객체가 **new** 연산자를 통해 **Heap** 메모리 영역에 할당될 때 객체 안에서 만들어지는 **필드 초기화 + 생성 시 필요한 기능 수행**
> 생성자는 **일종의 메서드**로 전달된 초기값을 받아서 객체의 필드의 기록

### 기본 생성자
> 작성하지 않은 경우, 클래스 사용 시 **컴파일러가 자동으로 기본 생성자 생성**
```Java
public class Member {
    private String memberId;
    private String memberPw;
    private String memberPhone;
    private int memberAge;

    // 기본 생성자 : 매개변수가 없는 생성자
    public Member() {
        // 생성자 사용 목적
        // 1. 필드 초기화
        memberId = "member01";
        memberPw = "pass01!";
        memberPhone = "010-1234-5678";
        memberAge = 25;

        // 2. 객체 생성 시 수행해야 되는 기능
        System.out.println("Member 객체가 생성되었습니다.");

        // 한번 만들어둔 생성자를 계속 재사용 -> 코드길이 감소, 재사용성 증가
    }
}
```

### 매개변수 생성자
> 객체 생성 시 전달받은 값으로 객체를 초기화 하기 위해 사용  
> **매개변수 생성자 작성 시 컴파일러가 기본 생성자를 자동으로 생성해주지 않음**  
> 상속에서 사용 시 반드시 기본 생성자를 작성  
> [오버로딩](/inheritance.md)을 이용하여 작성
```Java
public class Member {
    private String memberId;
    private String memberPw;
    private String memberPhone;
    private int memberAge;

    public Member(String memberId, String memberPw, String memberPhone, int memberAge) {
        // 필드명과 매개변수명이 같을 경우
        // 필드명 앞에 this.를 붙여 필드명이라는 것을 명시한다.
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberPhone = memberPhone;
        this.memberAge = memberAge;
    }
    public Member(String memberId, String memberPw){
        // ...
        // 매개변수 생성자는 오버로딩하여 사용 가능하다.
    }
}
```
- 매개 변수 생성자 작성 시 ***컴파일러가 기본 생성자를 작성해주지 않음*** (위 코드에서)

    ```Java
    public static void main(String[] args) {
        Member member = new Member(); // [에러] The constructor Member() is undefined
    }
    ```

### this
> 모든 인스턴스의 메서드에 숨겨진 채 존재하는 참조변수 (인스턴스 생성 시 자신의 시작 주소값을 저장한 참조변수)  
> 함수 실행 시 전달되는 객체의 주소를 자동으로 받음
```Java
public class ThisClass {
    private String name;
    public ThisClass() { }
    public thisClass(String name ) {
        // 필드의 name과 매개변수 name을 this참조변수를 통해 구분함
        this.name = name;
    }
}
```
### this()
> 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용   
> ***반드시 첫 번째 줄에 선언해야 함***
```Java
public class Student {
    private String name;
    private int grade;
    private int classRoom;

    public Student() {
        // 기본 생성자의 필드 초기화를 this()를 이용하여
        // 이미 만들어진 
        this("홍길동", 3);
    }
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    // 생성자 오버로딩시에도 사용
    // 중복코드 제거
    public Student(String name, int grade, int classRoom) {
        this(name, grade);
        this.classRoom = classRoom;
        // this(name, grade); [에러] Constructor call must be the first statement in a constructor
    }
}
```  
</br>

## 메서드(Method)
> ### 전달 값(매개변수)이 없는 상태로 호출 or 값을 전달하여 호출
> ### 함수 내에 작성된 연산 수행
> ### 수행 후 반환 값 / 결과 값(return)은 있거나 없을 수 있음
```Java
[접근제한자] [예약어] 반환형 메서드명 ([메개변수]) {
    // 기능 구현
}
// 위 규칙을 지킨 작성예시
public void introduce() {
    System.out.println("이것은 메서드 입니다.");
}
```
### 메서드 - 접근제한자
|**구분**|**클래스**|**패키지**|**자손 클래스**|**전체**|
|:--:|:--:|:--:|:--:|:--:|
|public|O|O|O|O|
|protected|O|O|O||
|(default)|O|O|||
|private|O||||

