package com.ohgiraffers.section03.reference;

public class Member {
    private String memId;

    public Member() {
        System.out.println("기본 생성자 호출됨");
    }

    public Member(String memId) {
        System.out.println("String 매개변수 있는 생성자 호출됨");
        this.memId = memId;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }


    @Override
    public String toString() {
        return "Member{" +
                "memId='" + memId + '\'' +
                '}';
    }
}
