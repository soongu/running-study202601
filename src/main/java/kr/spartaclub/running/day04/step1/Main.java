package kr.spartaclub.running.day04.step1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 리스트를 준비
        List<String> iveMembers
                = List.of("장원영", "안유진", "레이",
                "가을", "리즈", "이서");

        // 10번 멤버를 주세요
        try { // 트라이! 무서워하지말고 시도해봐
            String member = iveMembers.get(10); // 예외발생시 즉시 캐치로 이동
            System.out.println("member = " + member); // 예외발생시 실행 안됨
        } catch (IndexOutOfBoundsException e) { // 너 안죽어 잡아줄게
            System.out.println("그런 멤버는 없어요~");
        }


    }
}
