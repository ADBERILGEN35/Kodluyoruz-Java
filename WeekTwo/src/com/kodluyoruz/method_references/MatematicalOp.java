package com.kodluyoruz.method_references;

public class MatematicalOp implements MathematicalOperation {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
