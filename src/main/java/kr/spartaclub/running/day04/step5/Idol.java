package kr.spartaclub.running.day04.step5;

public class Idol {

    private String name;
    private String team;

    public Idol(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return """
                안녕하세요! %s 그룹의 %s입니다.
                """.formatted(team, name);
    }
}
