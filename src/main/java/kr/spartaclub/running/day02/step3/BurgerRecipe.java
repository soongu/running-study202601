package kr.spartaclub.running.day02.step3;

// 햄버거 레시피 명세서
// 레시피가 뭔진 모르겠는데(추상화) 아무튼 그대로 요리해야해

// 람다의 제약사항: 반드시 인터페이스 내부의 추상메서드가 단 1개여야 함!
@FunctionalInterface
public interface BurgerRecipe {
    void cook();
//    String introduce();

    static void foo() {

    }
    default void bar() {

    }
}
