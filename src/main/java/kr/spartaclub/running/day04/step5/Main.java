package kr.spartaclub.running.day04.step5;

import kr.spartaclub.running.day04.step4.exception.IdolNotFoundException;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        IdolRepository repo = new IdolRepository();

        System.out.println("==== 위험한 방식 ====");

        Idol idol1 = repo.findByNameLegacy("김종국");

//        System.out.println(idol1.toString()); // 위험

        System.out.println("==== 안전한 방식 ====");

        Optional<Idol> safeIdol = repo.findByNameOptional("karina");
        safeIdol.ifPresent(idol -> System.out.println(idol.toString()));


        System.out.println("============");

        Idol idol2 = repo.findByNameOptional("wonyoung2")
                .orElse(new Idol("연습생", "무소속"));

        System.out.println("idol2 = " + idol2);

        System.out.println("==========");

        Idol idol3 = repo.findByNameOptional("karina2")
                .orElseThrow(
                        () -> new IdolNotFoundException("아이돌을 못찾았습니다.")
                );

        System.out.println("idol3 = " + idol3);

    }
}
