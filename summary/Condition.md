# 조건문
> ## 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나  
> ## **조건에 따라 다른 문장이 수행되도록 함**

## 목차
### [1. 조건문의 종류](#조건문의-종류)
### [2. if문](#if문)
### [3. if ~ else문](#if--else문)
### [4. if ~ else if ~ else문](#if--else-if--else문)
### [5. switch문](#switch문)
### [Ex. else와 default의 차이점](#ex-elseec9980-defaultec9d98-ecb0a8ec9db4eca090-1)
#  
</br>

## 조건문의 종류
1. ### if문
    ```java
    if([조건식]) {
        [수행될 코드];
    } else if([조건식2]) {
        [수행될 코드];
    } else {
        [수행될 코드];
    }
    ```
2. ### switch문
    ```Java
    switch([식]) {
    case [식 결과1] :
        [수행될 코드];
        break;

    case [식 결과2] :
        [수행될 코드];
        break;
    
    default :
        [수행될 코드];
    }
    ```  
    </br>

## if문

```Java
if([조건식]){
    [수행될 코드];
}
```
> ### **조건식**의 결과 값이 **true**면 if문 내부 코드가 수행됨.   
> ### **false**면 수행되지 않음.
- ### **if** 예시
    ```Java
    int num = 3;

    if(num % 2 == 0){   // 1번 if
        System.out.printf("%d는 짝수 입니다.\n", num);
    }

    if(num % 2 != 0){   // 2번 if
        System.out.println("%d는 홀수 입니다.\n", num);
    }
    
    // [출력]
    // 3은 홀수 입니다.
    ```
- ### 동작 과정
    1. 1번 if문의 **조건식** `num % 2 == 0` 을 확인
        ```Java
        3 % 2 == 1; // 조건식 num % 2 == 0 의 결과 : false 
        ```
    2. 1번 if문의 조건식의 결과가 `false` 이므로 내부 코드 `System.out.printf("%d는 짝수 입니다.\n", num);` 실행되지 않음

    3. 2번 if문의 **조건식** `num % 2 != 0` 을 확인
        ```Java
        3 % 2 == 1; // 조건식 num % 2 != 0 의 결과 : true
        ```
    4. 2번 if문의 조건식의 결과가 `true` 이므로 내부 코드 `System.out.println("%d는 홀수 입니다.\n", num);` 가 실행됨  
    </br>

## if ~ else문
```Java
if([조건식]) {
    [true일 때 수행되는 코드];
} else {
    [false일 때 수행되는 코드];
}
```
> ### 조건식의 결과 값이 **true**면 if 내의 코드가 수행  
> ### **false**면 else 내의 코드가 수행

- ### **if ~ else** 예시
    ```Java
    int num = 2;

    if(num % 2 == 1) {  // 1번 if
        System.out.printf("%d은/는 홀수 입니다.\n", num);
    } else {    // 1번 else
        if(num == 0) {  // 2번 if
            System.out.println("0 입니다.");
        } else {    // 2번 else
            System.out.printf("%d은/는 짝수 입니다.\n", num);
        }
    }
    ```
- ### 동작 과정
    1. 1번 if문의 **조건식** `num % 2 == 1` 을 확인
        ```Java
        2 % 2 == 0 // 조건식 num % 2 == 1의 결과 : false
        ```
    2. 1번 if문의 결과가 `false` 이므로 1번 else문 내부 코드 진입
    
    3. 2번 if문의 **조건식** `num == 0` 을 확인
        ```Java
        num == 2 // 조건식 num == 0의 결과 : false
        ```
    4. 2번 if문의 결과가 `false` 이므로 2번 else문 내부 코드 `System.out.printf("%d은/는 짝수 입니다.\n", num);` 실행  
    </br>

## if ~ else if ~ else문
```Java
if([조건식1]) {
    [조건식1 true일 떼 수행];
} else if([조건식2]) {
    [조건식2 true일 때 수행];
} else {
    [모두 false 일 때 수행];
}
```
> ### 조건식1의 결과 값이 **true**면 if문 내 코드 수행
> ### 조건식2의 결과 값이 **true**면 else if 내 코드 수행
> ### **모두 false**면 else 내 코드 수행
>> ***if**는 true, false와 **상관 없이 조건절 실행***  
>> ***if ~ else if ~ else**는 조건문이 true면 **이후 조건은 실행하지 않음***

- ### **if ~ else if ~ else** 예시
    ```Java
    int month = 8;
    String season = "";

    if(month == 12 || month == 1 || month == 2){ // 1
        season = "겨울";
    } else if (month < 6) { // 2
        season = "봄";
    } else if (month < 9) { // 3
        season = "여름";
    } else if (month < 12) { // 4
        season = "가을";
    } else { // 5
        season = "해당하는 계절이 없습니다.";
    }
    ```
- ### 동작 과정
    1. 1번 **조건식** `month == 12 || month == 1 || month == 2` 확인
        ```Java
        month == 8 // 조건식 month == 12 || month == 1 || month == 2 의 결과 : false
        ```
    2. if문 **조건식**에서 `false` 이므로 내부 코드 `season = "겨울"` 은 실행되지 않고 다음 **조건식** `month < 6` 확인
        ```Java
        month == 8 // 조건식 month < 6 의 결과 : false
        ```
    3. else if문 **조건식** `month < 6` 의 결과가 `false` 이므로 내부 코드 `season = "봄";`은 실행되지 않고 다음 **조건식** `month < 9` 확인
        ```Java
        month == 8 // 조건식 month < 9 의 결과 : true
        ```
    4. else if문 **조건식** `month < 9` 의 결과가 `true` 이므로 내부 코드 `season = "여름";`을 실행

    5. 조건식에서 `true` 가 나왔으므로 다음 **조건식(4번)** `month < 6`,  else문은 **실행되지 않고 if문 종료**  
    </br>

## switch문
```Java
switch(num % 5) {
case 1:
    team = "1조"; break;
case 2:
    team = "2조"; break;
case 3:
    team = "3조"; break;
case 4:
    team = "4조"; break;
case 5:
    team = "5조"; break;
default:
    team = "다시";
}
```

> ### 식 하나로 많은 경우의 수를 처리할 때 사용
> ### 식의 결과는 **정수**, **문자**, **문자열**
> ### **식의 결과 값과 일치하는 case문으로 이동**
> ### `break` 를 만날 때까지 다음 `case` 실행
> ### default문은 일치하는 case문이 없을 때 수행(== [**else**](#if--else문))

- ### **switch** 예시
    ```Java
    int month = 9;
    String season = "여름";
    switch (month)
    case 3: season = "봄"; 
    case 4: season = "봄"; 
    case 5: season = "봄"; break;

    case 6: season = "여름";
    case 7: season = "여름";
    case 8: season = "여름"; break;

    case 9: season = "가을";
    case 10: season = "가을";
    case 11: season = "가을"; break;

    case 1: season = "겨울";
    case 2: season = "겨울";
    case 12: season = "겨울"; break;

    default: season = "해당하는 계절이 없습니다.";
    ```
- ### 동작 과정
    1. switch 괄호안에 변수 확인 `month == 9`

    2. 변수 `month` 와 값이 같은 `case 9:` 로 이동, *`case 9:` 이전 코드들은 스킵*

    3. `break` 를 만날 때 까지 모든 `case` 수행
        ```Java
        // 실행되는 코드
        case 9: season = "가을";
        case 10: season = "가을";
        case 11: season = "가을"; break;

        // 변수는 한개의 값만 저장 할 수 있으므로 
        // season이라는 변수안에 "가을" 이라는 값이 계속 덮어씌워짐
        ```
- ### 다양한 작성
    > #### 위 예시 코드에선 `break` 를 만나기 전의 모든 `case` 들이 똑같은 일을 수행하고 있다.
    > 이 경우에 아래의 방법으로 작성 가능하다.

    - **code 1**

        ```Java
        int month = 9;
        String season = "여름";

        switch (month)
        case 3:  
        case 4: 
        case 5: season = "봄"; break;

        case 6: 
        case 7: 
        case 8: season = "여름"; break;

        case 9:
        case 10:
        case 11: season = "가을"; break;

        case 1: 
        case 2:
        case 12: season = "겨울"; break;

        default: season = "해당하는 계절이 없습니다.";
        ```
    - **code 2**
        ```Java
        int month = 9;
        String season = "여름";

        switch (month)
        case 3:  case 4: case 5: season = "봄"; break;
        case 6: case 7: case 8: season = "여름"; break;
        case 9: case 10: case 11: season = "가을"; break;
        case 1: case 2: case 12: season = "겨울"; break;

        default: season = "해당하는 계절이 없습니다.";
        ```  
        </br>

## Ex. **else**와 **default**의 차이점
> ### if ~ else if ~ else 는 앞 조건식의 결과가 true가 나와 내부코드가 실행되면 다음 else if 와 else가 **절대 실행되지 않지만**  
> ### default는 조건에 맞는 case가 존재해 내부코드가 실행 되더라도 **`break`** 가 존재하지 않으면 무조건 실행된다.

- ### **`default`** 의 실행 방식
    ```Java
    int num = 2;
		
	switch(num % 2) {
	case 0:
		System.out.println("짝수 입니다.");
	default:
		System.out.println("break를 만나지 않으면 상관없이 수행됩니다.");
	}

    // 출력 결과
    // 짝수 입니다.
    // break를 만나지 않으면 상관없이 수행됩니다.
    ```
    1. switch의 식 `num % 2` 의 결과는 **0**으로 같은 결과를 가지고 있는 `case 0:` 으로 이동
    2. 내부코드 `System.out.println("짝수 입니다.");` 를 실행하고 `break`를 만나지 않았으므로 다음 코드 `default`로 이동
    3. `default`의 내부코드 `System.out.println("break를 만나지 않으면 상관없이 수행됩니다.");` 수행