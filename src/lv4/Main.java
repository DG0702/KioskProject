package lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // 추가할 리스트 작성
    private static final List<CategoryMenu<MenuItem>> categoryMenus = new ArrayList<>();
    private static final List<MenuItem> hamburgerMenus = new ArrayList<>();
    private static final List<MenuItem> beverageMenus = new ArrayList<>();


    // main 메서드
    public static void main(String[] args) {
        
        // 카테고리에 메뉴 추가
        initializeCategoryMenus();

        // 햄버거 추가
        initializeHamburgerMenus();

        // 음료 추가
        initializeBeverageMenus();

        // 키오스크에 카테고리 추가
        Kiosk kiosk = new Kiosk(categoryMenus);

        kiosk.start();
    }


    // 카테고리 메뉴 추가 메서드
    private static void initializeCategoryMenus() {
        // 카테고리에 메뉴 추가
        categoryMenus.add(new CategoryMenu<>(1,"Burgers", hamburgerMenus));
        categoryMenus.add(new CategoryMenu<>(2,"Drinks", beverageMenus));
    }


    // 햄버거 메뉴 추가 메서드
    private static void initializeHamburgerMenus() {
        // 햄버거 추가
        hamburgerMenus.add(new HamburgerMenu(1,"ShackBurger ", 6.9 , "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        hamburgerMenus.add(new HamburgerMenu(2,"SmokeShack ", 8.9 , "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        hamburgerMenus.add(new HamburgerMenu(3,"Cheeseburger ", 6.9 , "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        hamburgerMenus.add(new HamburgerMenu(4,"Hamburger ", 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    // 음료 메뉴 추가 메서드
    private static void initializeBeverageMenus() {
        // 음료 추가
        beverageMenus.add(new BeverageMenu(1,"코카콜라",2.5,"시원한 탄산 코카콜라"));
        beverageMenus.add(new BeverageMenu(2,"사이다",2.0,"사이다는 역시 천연 사이다~~"));
        beverageMenus.add(new BeverageMenu(3,"환타",1.5,"환타는 역시 오렌지 ~~"));
        beverageMenus.add(new BeverageMenu(4,"펩시",1.5,"신선한 탄산음료 펩~시"));
    }
}
