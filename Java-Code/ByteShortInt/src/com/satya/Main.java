package com.satya;

public class Main {

    public static void main(String[] args) {
	// int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myIValue = myMinValue+myMaxValue;
    //byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myBValue = (byte) (myMinByteValue+myMaxByteValue);
    //short hs a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short mySValue = (short) (myMinShortValue+myMaxShortValue);
    //long hs a width of 64
        long myMinlongValue = -9223372036854775808L;
        long myMaxlongValue = 9223372036854775807L;
        long myLValue = 5000+10*(myBValue+myIValue+mySValue)+myMinlongValue+myMaxlongValue;
    System.out.println("myNewLongValue = "+myLValue);
    }
}
