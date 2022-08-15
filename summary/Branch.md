# 분기문
> ## 프로그램의 흐름을 조건에 따라서 분기시킴
## 목차
### 1.
### 2.
  
#
## break
```Java
for(int i = 1;; i++) {
    System.out.println(i +" 출력"); //메인 코드

    if(i >= 5 ) { // 탈출 코드
        break;
    }
}
```
> ### 반복문에서는 break문 자신이 포함된 **가장 가까운** 반복문을 빠져나가는 구문

- ### 동작 과정  
    1. 초기식 `int i = 1` 확인

    2. 조건식이 없으므로 메인 코드 수행
        ```Java
        System.out.println(i +" 출력");

        if(i >= 5) {
            break;
        }
        ```

    3. 탈출 코드 조건식 `i >= 5` 확인
        ```Java
        i == 1 // 조건식 i >= 5 결과 : false        
        ```

    4. 증감식 `i++` 실행 후 탈출 코드 조건식이 `true` 가 나올 때까지 2번, 3번, 4번 반복

    5. 탈출 코드 조건식이 `true` 가 나오면 즉시 반복문 탈출

- ### 중첩 반복문 break
    ```Java
    for(int i = 1; i<= 5; i++) {
        System.out.println(i +" 출력");
        for(int j = 1; j <= 5; j++);
            System.out.println(i +" 출력");
            if(j == 3) {
                break;
            }
        if(i == 3) {
            break;
        }
    }
    ```


