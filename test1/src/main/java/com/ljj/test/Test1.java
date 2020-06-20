package com.ljj.test;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(getValue(1));
    }

    static int getValue(int i){
        int result = 0;
        switch (i){
            case 1:
                result = result+i;
            case 2:
                result = result+2*i;
            case 3:
                result = result+3*i;

        }
        System.out.println("111111111111111111111111");
        return result;
    }

}
