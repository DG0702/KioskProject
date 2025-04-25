package lv6;

import java.util.List;

public class CategoryMenu <T extends  MenuItem> {

    // 속성
    private int number;
    private String categoryName;
    private List<T> categoryList;
//    private List<T> shoppingCart;

    // 생성자
    CategoryMenu(int number, String categoryName, List<T> categoryList){
        this.number = number;
        this.categoryName = categoryName;
        this.categoryList = categoryList;
    }

    // 카테고리 번호
    public int getNumber(){
        return number;
    }
    
    // 카테고리 이름
    public String getCategoryName(){
        return categoryName;
    }

    // 카테고리 리스트
    public List<T> getCategoryList(){
        return categoryList;
    }


//    // 장바구니 리스트
//    public List<T> getShoppingCart(){
//        return shoppingCart;
//    }



    // 카테고리별 메뉴 출력
    public void getCategory(){
        for(T categoryListMenu : categoryList){
            System.out.println(categoryListMenu.getMenu());
        }
    }

    // 선택한 카테고리에서 메뉴 출력
    public void getMenu(int menuNum){
        System.out.println(getCategoryList().get(menuNum - 1).getMenu());
    }

//    // 선택한 카테고리에서 메뉴 선택
//    public void addItem(int menuNum){
//        getShoppingCart().add(getCategoryList().get(menuNum - 1));
//    }

//    public T addItem(T item){
//        return
//    }


}
