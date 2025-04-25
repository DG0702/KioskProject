package lv7;

import lv6.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 추가할 리스트 작성
        List<CategoryMenu> categoryMenus = new ArrayList<>();
        List<HamburgerMenu> hamburgerMenus = new ArrayList<>();
        List<BeverageMenu> beverageMenus = new ArrayList<>();
        List<DesertMenu> desertMenus = new ArrayList<>();


        // 카테고리에 메뉴 추가
        categoryMenus.add(new CategoryMenu<>(1,"Burgers",hamburgerMenus));
        categoryMenus.add(new CategoryMenu<>(2,"Drinks",beverageMenus));
        categoryMenus.add(new CategoryMenu<>(3,"Deserts",desertMenus));


        // 햄버거 추가
        hamburgerMenus.add(new lv7.HamburgerMenu(1,"ShackBurger ", 6.9 , " 토마토, 양상추, 쉑소스가 토핑된 치즈버거" ));
        hamburgerMenus.add(new lv7.HamburgerMenu(2,"SmokeShack ", 8.9 , " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" ));
        hamburgerMenus.add(new lv7.HamburgerMenu(3,"Cheeseburger ", 6.9 , " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" ));
        hamburgerMenus.add(new lv7.HamburgerMenu(4,"Hamburger ", 5.4 , " 비프패티를 기반으로 야채가 들어간 기본버거" ));

        // 음료 추가
        beverageMenus.add(new lv7.BeverageMenu(1,"코카콜라",2.5,"시원한 탄산 코카콜라"));
        beverageMenus.add(new lv7.BeverageMenu(2,"사이다",2.0,"천연 사이다~~"));
        beverageMenus.add(new lv7.BeverageMenu(3,"환타",1.5,"환타는 역시 오렌지 ~~"));
        beverageMenus.add(new lv7.BeverageMenu(4,"펩시",1.5,"신선한 탄산음료 펩~시"));

        // 디저트 추가
        desertMenus.add(new lv7.DesertMenu(1,"초코케이크" , 6.0,"달달하고 맛있는 초코 케잌"));
        desertMenus.add(new lv7.DesertMenu(2,"치즈케이크" , 7.0,"고급 치즈를 사용한 치즈 케잌"));
        desertMenus.add(new lv7.DesertMenu(3,"딸기케이크" , 6.0,"상큼한 딸기 케잌"));
        desertMenus.add(new lv7.DesertMenu(4,"우유케이크" , 5.0,"부드러운 우유 케잌"));



        // 키오스크에 카테고리 추가
        Kiosk kiosk = new Kiosk(categoryMenus);

        kiosk.start();

    }
}
