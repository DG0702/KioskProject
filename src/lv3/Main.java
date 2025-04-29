package lv3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    
    // 메뉴 추가 리스트
    private static List<MenuItem> menuItems = new ArrayList<>();

    // main 메서드
    public static void main(String[] args) {

        // 메뉴 추가
        initializeMenu();

        // 키오스크 객체를 인스턴스화
        Kiosk kiosk = new Kiosk(menuItems);
        
        // 키오스크 실행
        kiosk.start();
    }
    
    
    // 메뉴 추가하는 메서드
    private static void initializeMenu(){
        // 메뉴 추가
        menuItems.add(new lv3.MenuItem(1,"ShackBurger ", 6.9 , " 토마토, 양상추, 쉑소스가 토핑된 치즈버거" ));
        menuItems.add(new lv3.MenuItem(2,"SmokeShack ", 8.9 , " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" ));
        menuItems.add(new lv3.MenuItem(3,"Cheeseburger ", 6.9 , " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" ));
        menuItems.add(new lv3.MenuItem(4,"Hamburger ", 5.4 , " 비프패티를 기반으로 야채가 들어간 기본버거" ));
    }
}
