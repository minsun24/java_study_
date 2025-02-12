package com.ohgiraffers.section04.testapp.stream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* 설명. */
public class MyObjectOutput extends ObjectOutputStream {

    // 보조 스트림 ... 매개변수가 꼭 필요
    public MyObjectOutput(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {

    }
}
