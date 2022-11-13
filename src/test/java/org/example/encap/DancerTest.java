package org.example.encap;

import org.example.inherit.*;
import org.example.poly.PerformanceTeam;
import org.junit.jupiter.api.Test;

class DancerTest {

    @Test
    void danceTest() {
        //Ctrl+P : parameter 표시
        //Ctrl+Alt+V : 변수생성
        //캡슐화 : 외부에서 내부로직를 접근해서, 데이터의 잘못된 조작을 막고, 올바른 동작을 유도
        //정보은닉 : 정보은닉이 되어있지않으면, 외부에서 필드값 변경이 일어나도, 오류를알수없으므로, 객체의 오류가 발생할수있음
//        Dancer dancer = new Dancer("테스트크루", Grade.HIGH, "이종헌");
//
//        dancer.dance();
//        dancer.setHeight(2222);
//        System.out.println("dancer = " + dancer);
    }

    @Test
    void idolTest() {
        IdolDancer jungguk = new IdolDancer("bts", Grade.HIGH, "정국");
        jungguk.dance();

        StreetDancer streetDancer = new StreetDancer("을지로크루", Grade.MIDDLE, "테스트");
        streetDancer.dance();

        System.out.println("jungkuk : "+jungguk);
    }

    @Test
    void teamTest() {

        PerformanceTeam team = new PerformanceTeam();

        Dancer kim = new IdolDancer("동방신기", Grade.HIGH, "영웅재중");
        team.addDancer(kim);

        Dancer test = new StreetDancer("을지로크루", Grade.MIDDLE, "테스트");

        team.addDancer(test);

    }
}