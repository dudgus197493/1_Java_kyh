# 반복문
> ## 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 특정 문장들을 반복해서 수행하도록 함  
## 목차
### [1. 반복문의 종류](#반복문의-종류)
### [2. for문](#for문)
### [3. 중첩 반복문](#중첩-반복문) 
### [4. while문](#while문) 
### [5. do ~ while문](#do--while문)
#  
</br>

## 반복문의 종류
1. ### for문  
	```Java
	for([초기식]; [조건식]; [증감식];) {
		[수행될 코드]
	}
	```
	
2. ### while문
	```Java
	while([조건식]) {
		]수행될 코드];
		[증감식 or 분기문];
	}
	```  
</br>

## for문
```Java
// example
for(int i = 0; i < 5; i++){
	System.out.println(i + " 출력");
}
```
- ### for문 동작 방식  
	

	1. **초기식** 확인
  
		```Java
		int i = 0;
		```

	2. 조건식 확인후 결과값이 **true**면 코드블록 수행  

		```Java
		i < 5;
		```

	3. 조건식이 **true**면 실행될 코드 [***false**면 이 단계를 **생략***]   

		```Java
		System.out.println(i + "출력");
		```

	4. 증감식 수행  

		```Java
		i++;
		```

	5. 2번 조건식 확인으로 돌아가 조건식이 **false**일 때까지 2, 3, 4번 **반복**   

- ### 실행 결과
	|i|i <= 5|출력|
	|:--:|:--:|:--:|
	|1|true|1 출력|
	|2|true|2 출력|
	|3|true|3 출력|	
	|4|true|4 출력|
	|5|true|5 출력|
	|6|false|break   
</br>

## 중첩 반복문
```Java
for(초기값1; 조건식1; 증감식1) {		//1번 반복문
	수행될 코드1;
	for(초기값2; 조건식2; 증감식2) {	//2번 반복문
		수행될 코드2;
	}
	수행될 코드3;
}
```


- ### 동작 과정
	1. 1번 반복문 조건식의 결과가 **true**일 경우 수행될 코드1 수행

	2. 1번 반복문 내부 코드를 수행하다가 2번 반복문을 만나면 조건식 검사, 결과가 **true**면 수행될 코드2 수행

	3. 2번 반복문을 다 수행한 후 남은 1번 반복문의 수행될 코드 3 수행

	4. 1번 반복문 조건식의 결과가 **false**가 나올 때까지 1, 2, 3 **반복**  

	</br>

- ### 중첩 반복문의 예시
	```Java
	for(int i = 1; i <= 5; i++){ // 1번
		for(int j = 1; j <= 5; j++){ // 2번
			System.out.print(j + " 출력");
		}
		System.out.println(); 	// 줄 바꿈
	}
	```  
- ### 결과
	|i  \  j|1|2|3|4|5|6|2번 for 탈출 후|
	|--:|:--:|:--:|:--:|:--:|:--:|:--:|:--:|
	|1|1 출력|2 출력|3 출력|4 출력|5 출력|**false**(break)|줄 바꿈|
	|2|1 출력|2 출력|3 출력|4 출력|5 출력|**false**(break)|줄 바꿈|
	|3|1 출력|2 출력|3 출력|4 출력|5 출력|**false**(break)|줄 바꿈|
	|4|1 출력|2 출력|3 출력|4 출력|5 출력|**false**(break)|줄 바꿈|
	|5|1 출력|2 출력|3 출력|4 출력|5 출력|**false**(break)|줄 바꿈|
	|**false(break)**|  
</br>

## while문
```Java
int i = 1;
while (i <= 5) {
	System.out.println(i + " 출력");
	i++;
}
```
- ### 동작 과정
	1. 반복문 진입 전 **조건을 벗어나기 위해 필요한 변수** 선언
		```Java
		int i = 1;
		```

	2. while문 조건식 `i <= 5` 검사
		```Java
		i == 1 // 조건식 i <= 5 : true
		```

	3. 조건식 결과가 `true`가 나왔으니 내부 코드 실행
		```Java
		System.out.println(i + " 출력"); // 메인 코드
		i++; // 반복문을 탈출하기 위한 조건식 or 증감식
		```
	4. 조건식 결과가 `false`가 나올 때까지 2번, 3번 반복

- ### 실행 결과
	| **i** | i <= 5 | 출력 |
	|:--:|:--:|:--:|
	|1|true|1 출력|
	|2|true|2 출력|
	|3|true|3 출력|
	|4|true|4 출력|
	|5|true|5 출력|
	|6|false|**break**|  
	</br>

## do ~ while문
> ### do ~ while문은 while문과 다르게  조건문이 true가 아니더라도 **무조건 한 번 이상 수행**
```Java
int i = 1;
do {
	System.out.println(i + " 출력");
	i++;
} while(i <= 5);
```
- ### 동작 과정
	1. 반복문 진입 전 **조건을 벗어나기 위해 필요한 변수** 선언
		```Java
		int i = 1;
		```

	2. `do { }` 내부코드 수행
		```Java
		System.out.println(i + " 출력");	// 메인 코드
		i++;	// 반복문을 탈출하기 위한 조건식 or 증감식
		```

	3. **한번 더 수행할 것인지** 조건식 `i <= 5` 검사
		```Java
		i == 1 // 조건식 i <= 5 : true	
		```
	
	4. 조건식 결과가 `true` 가 나왔으니 do 내부코드 한번더 실행
	
	5. 조건식 결과가 `false`가 나올 때까지 3번, 4번 반복  
	</br>

- ### 실행 결과
	| **i** | 출력 | i++ | i <= 5 |
	|:--:|:--:|:--:|:--:|
	| 1 | 1 출력 | 2 | true |
	| 2 | 2 출력 | 3 | true |
	| 3 | 3 출력 | 4 | true |
	| 4 | 4 출력 | 5 | true |
	| 5 | 5 출력 | 6 | **false(break)** |


