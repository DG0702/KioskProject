package lv4;

import java.util.List;

public class CategoryMenu {

    // 속성
    private int number;
    private String categoryName;
    List<HamburgerMenu> hamburgerMenus;

    // 생성자
    CategoryMenu(int number,String categoryName, List<HamburgerMenu> hamburgerMenus) {
        this.number = number;
        this.categoryName = categoryName;
        this.hamburgerMenus = hamburgerMenus;
    }

    // getter
    public List<HamburgerMenu> getHamburgerMenus() {
        return hamburgerMenus;
    }

    // 카테고리 번호
    public int getNumber() {
        return number;
    }

    // 카테고리 이름
    public String getCategoryName(){
        return categoryName;
    }


    // 카테고리별 메뉴 출력
    public void getCategory(){
        for(HamburgerMenu hamburgerMenu : hamburgerMenus) {
            System.out.println(hamburgerMenu.getMenu());
        }
    }

    // 선택한 메뉴 출력
    public void getMenu(int choice){
        System.out.println(getHamburgerMenus().get(choice-1).getMenu());
    }









}
