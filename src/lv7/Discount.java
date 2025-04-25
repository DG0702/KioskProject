package lv7;

public enum Discount {
    VETERAN(1),
    SOLDIER(2),
    STUDENT(3),
    GENERAL(4);


    // 속성
    private int number;

    // 생성자
    Discount(int number){
        this.number = number;
    }

    // 할당된 값 가져오기 -> (1,2,3,4)
    public int getNumber(){
        return number;
    }
    
    // 입력 받은 숫자 -> Discount 타입으로 변경
    public static Discount getDiscount(int discount){
        for(Discount dc : values()){
            if(dc.getNumber() == discount){
                return dc;
            }
        }
        throw new IllegalArgumentException("번호를 선택해주세요");
    }

}


