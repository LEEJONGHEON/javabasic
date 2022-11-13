package org.example.encap;

import org.example.inter.Danceable;

public abstract class Dancer implements Danceable {
    String crewName; // 팀 이름
    Grade grade; // 등급
    String myName; // 내 이름

    double height; // 키

    //Alt+Enter 단축키
    //Alt+Insert 단축키
    //Ctrl+shift+T : 테스트생성
    // 기본 생성자
//    public Dancer() {
//
//    }

    // 생성자
    public Dancer(String crewName, Grade grade, String myName) {
        this.crewName = crewName;
        this.grade = grade;
        this.myName = myName;
    }

    // 스트레칭
    private void stretch() {
        System.out.println(myName + " 몸을 풉니다.");
    }

    // 유연성
    private void moreFlexible() {
        System.out.println(myName + " 다리 찢기.");
    }

    public void setHeight(double height) {
        if (height <= 130 || height >= 250) {
            this.height = 160;
            return;
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "crewName='" + crewName + '\'' +
                ", grade=" + grade +
                ", myName='" + myName + '\'' +
                ", height=" + height +
                '}';
    }
}
