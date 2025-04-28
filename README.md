# 🎩 KioskProject

🪄 **키오스크 프로젝트**

- 📌 객체지향 개념학습, 데이터를 구조적으로 관리하며 프로그램 설계

## 🖥️ 개발 프로세스(환경)

### ⛏️IDE :
- `Intellij`

### 📌 Java :
- **JDK 17버전 사용**

### 🔁 Version Control :
- `GitHub`


<br>
<hr>


##  ✅ 요구사항

### [LV1️⃣] 기본적인 키스오스크 프로그래밍

- 🎈 입력처리(Scanner)와 간단한 흐름 제어(조건문, 반복문)


- 🎈 햄버거 메뉴 출력 및 선택


```

[//]: # (구현)
 
[ SHAKESHACK MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 종료      | 종료
0 <- // 0을 입력
프로그램을 종료합니다.
```

<br>


### [LV2️⃣] 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기

- 🎈 햄버거 메뉴를 `MenuItem` , `List`를 통해 관리

  - 개별 음식 항목을 관리하는 클래스 , 필드 : `이름`, `가격`, `설명` 

```java
public static void main(String[] args) {
    // List 선언 및 초기화
    // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
		
    // Scanner 선언
		
    // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
    // 숫자를 입력 받기
    // 입력된 숫자에 따른 처리
    // 프로그램을 종료
    // 선택한 메뉴 : 이름, 가격, 설명
}
```

<br>

### [LV3️⃣] 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기

- 🎈 `main` 함수에서 관리하던 전체 순서 제어를 `Kiosk` 클래스를 통해 관리


- 🎈 `Kiosk`클래스 생성

  - 📍 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스

  - 📍 `MenuItem`을 관리하는 리스트가 필드로 존재
  
  - 📍 `start` 메서드를 생성하여 반복문 로직을 관리
  
  - 📍 `List<MenuItem> menuItems`는 Kiosk 클래스 **생성자**를 통해 값을 할당
  
    - 🍭 `Kiosk` 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줌  

- 🎈 `0`을 입력하면 프로그램이 뒤로가기, 종료 되도록 설계   


<br>
    
### [LV4️⃣] 객체 지향 설계를 적용해 음식 메뉴와 주문 내역을 클래스 기반으로 관리하기

- 🎈 `Menu` 클래스 생성 -> (CategoryMenu)
  - 📍 `MenuItem` 클래스를 관리하는 클래스 (HamburgerMenu, BeverageMenu)
  - 📍 ex) 버거메뉴, 음료메뉴 등 각 카테고리 내에 여러 `MenuItem`을 포함
  - 📍 **상위 개념의 `카테고리 이름` 필드 사용**
  - 📍 메뉴 카테고리 이름을 반환하는 메서드 구현
 
```java
public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
		
	// Kiosk 객체 생성
	// Kiosk 내 시작하는 함수 호출
}

public class Kiosk {

	start() {
	// 스캐너 선언
	// 반복문 시작
	
	// List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
			
	// 숫자 입력 받기
			
	// 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
	// List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?
		
	// Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
			
	// 숫자 입력 받기
	// 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
	// menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.
		}

}

public class Menu {
	// MenuItem 클래스를 List로 관리
		
	// List에 들어있는 MenuItem을 순차적으로 보여주는 함수
	// List를 리턴하는 함수
		
	// 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}

public class MenuItem {
	// 이름, 가격, 설명 필드 선언하여 관리
		
	// 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}
```
<br>


```

[//]: # (구현)

[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료
1 <- // 1을 입력

[ BURGERS MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
2 <- // 2를 입력
선택한 메뉴: SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거

[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료
0 <- // 0을 입력
프로그램을 종료합니다.
```

### [LV5️⃣]

- 🎈 캡슐화 적용하기 
  - `MenuItem`, `Menu`, `Kiosk` 클래스의 필드에 직접 접근하지 못하도록 설정 

### [LV6️⃣]

### [LV7️⃣]
