package org.example.poly;

import org.example.encap.Dancer;
import org.example.inherit.IdolDancer;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PerformanceTeam {

    private List<Dancer> dancers = new ArrayList<>();

    // 팀원 추가하기
    // 리팩토링 Shift+F6
    public void addDancer(Dancer dancer) {
        dancers.add(dancer);
        System.out.println(dancer + "가 추가됨");
    }
}
