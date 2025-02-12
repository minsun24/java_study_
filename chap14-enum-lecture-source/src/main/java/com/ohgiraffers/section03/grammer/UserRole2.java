package com.ohgiraffers.section03.grammer;

public enum UserRole2 {
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String DESCRIPTION;

    // 값을 부여하면서 초기화해줄 경우, 생성자 작성 필수
    UserRole2(String description) {
        DESCRIPTION = description;
    }

    public String getDescription() {
        return DESCRIPTION;
    }



}
