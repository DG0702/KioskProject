package lv7;

import java.util.List;

public class CategoryMenu <T extends MenuItem> {
    // 속성
    private final int number;
    private final String categoryName;
    private final List<T> categoryList;

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

    // 카테고리 리스트
    public List<T> getCategoryList() {
        return categoryList;
    }


    // 카테고리별 메뉴 출력
    public void getCategory() {
        categoryList.stream()
                .map(MenuItem::showMenu)
                .forEach(System.out::println);

    }

    // 선택한 카테고리에서 메뉴 출력
    public void getMenu(int menuNum) {
        System.out.println(getCategoryList().get(menuNum - 1).selectMenu());
    }

}
