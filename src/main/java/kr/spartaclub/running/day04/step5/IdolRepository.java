package kr.spartaclub.running.day04.step5;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class IdolRepository {
    private static Map<String, Idol> db = new HashMap<>();

    static {
        db.put("wonyoung", new Idol("장원영", "IVE"));
        db.put("karina", new Idol("카리나", "Aespa"));
    }

    // 1. 고전적인 방식 (값이 없으면 null 리턴)
    // ⚠️ 위험: 사용하는 쪽에서 null 체크를 까먹으면 펑! (NullPointerException)
    public Idol findByNameLegacy(String name) {
        return db.get(name);
    }

    // 2. 요즘 방식 (Optional 리턴)
    // ✅ 안전: "값이 없을 수도 있다"고 명시적으로 알려줌.
    public Optional<Idol> findByNameOptional(String name) {
        // ofNullable: null이면 empty, 아니면 그 값을 감싼 Optional 반환
        return Optional.ofNullable(db.get(name));
    }
}
