package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class StreetDancer extends Dancer {

    // 부모와 자식 동시생성 서로 주소 link
    public StreetDancer(String crewName, Grade grade, String myName) {
        super(crewName, grade, myName);
    }

    @Override
    public void dance() {
        System.out.println("빙글빙글");
    }
}
