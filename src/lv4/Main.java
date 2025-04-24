package lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<CategoryMenu> categoryMenu = new ArrayList<>();
        List<HamburgerMenu> hamburgerMenus = new ArrayList<>();

        categoryMenu.add(new CategoryMenu(1,"햄버거", hamburgerMenus));


        hamburgerMenus.add(new HamburgerMenu(1,"ShackBurger ", 6.9 , " 토마토, 양상추, 쉑소스가 토핑된 치즈버거" ));
        hamburgerMenus.add(new HamburgerMenu(2,"SmokeShack ", 8.9 , " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" ));
        hamburgerMenus.add(new HamburgerMenu(3,"Cheeseburger ", 6.9 , " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" ));
        hamburgerMenus.add(new HamburgerMenu(4,"Hamburger ", 5.4 , " 비프패티를 기반으로 야채가 들어간 기본버거" ));

        Kiosk kiosk = new Kiosk(categoryMenu);

        kiosk.start();
    }
}
