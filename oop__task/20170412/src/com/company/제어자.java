package com.company;

public class 제어자 {
    입력 입력;
    처리기 처리기;
    출력 출력;

    public static void main(String[] args) {
        제어자 m = new 제어자();
        m.주_실행();
    }

    public void 주_실행(){
        입력 = new 입력();
        처리기 = new 처리기();
        출력 = new 출력();

        첫번째문제();
        두번째문제();
    }

    void 첫번째문제(){
        System.out.println("숫자두개를 입력해 주세요.");
        입력.숫자입력();
        int x = 입력.getX();
        int y = 입력.getY();

        처리기.숫자설정(x, y);
        int 합 = 처리기.덧셈();
        int 뺌 = 처리기.뺄셈();
        int 곱 = 처리기.곱셈();
        int 나머지 = 처리기.나머지();
        int 큰 = 처리기.두수비교();

        출력.수설정(x, y, 합, 뺌, 곱, 나머지, 큰);
        출력.입력값출력();
        출력.사칙연산();
        출력.큰값출력();
    }

    void 두번째문제(){
        System.out.println("주문내용을 정식 ,갈비탕 ,비빔밥 순으로 입력해주세요.");
        입력.메뉴입력();
        int 정식수 = 입력.정식수();
        int 갈비탕수 = 입력.갈비탕수();
        int 비빔밥수 = 입력.비빔밥수();

        처리기.음식설정(정식수, 갈비탕수, 비빔밥수);
        int 총가격 = 처리기.get총가격();

        출력.음식설정(정식수, 갈비탕수, 비빔밥수, 총가격);
        출력.메뉴출력();
        출력.총가격출력();
    }
}