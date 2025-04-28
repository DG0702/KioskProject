package lv5;

import java.util.List;

public class CategoryMenu <T extends MenuItem>{

    // 속성(필드) -> 캡슐화
    private int number;
    private String categoryName;
    private List<T> categoryList;

    // 생성자
    CategoryMenu(int number, String categoryName, List<T> categoryList) {
        this.number = number;
        this.categoryName = categoryName;
        this.categoryList = categoryList;
    }

    // 카테고리 번호
    public int getNumber() {
        return number;
    }

    // 카테고리 이름
    public String getCategoryName() {
        return categoryName;
    }
    
    // 카테고리 목록(메뉴)
    public List<T> getCategoryList() {
        return categoryList;
    }

    // 카테고리별 메뉴 출력 (메뉴판)
    public void getCategory(){
        for(T categoryListMenu : categoryList){
            System.out.println(categoryListMenu.getMenu());
        }
    }

    // 선택한 카테고리 메뉴 출력 (고른 메뉴)
    public void getMenu(int menuNum){
        System.out.println(getCategoryList().get(menuNum -1).getMenu());
    }
    
    

}
