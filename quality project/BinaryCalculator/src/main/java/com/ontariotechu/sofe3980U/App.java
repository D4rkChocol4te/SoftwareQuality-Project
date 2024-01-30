package com.ontariotechu.sofe3980U;

public class App {
    public static void main(String[] args) {
        // Define two binary numbers
        Binary binary1 = new Binary("101010");
        System.out.println("First binary number is " + binary1.getValue());

        Binary binary2 = new Binary("110100");
        System.out.println("Second binary number is " + binary2.getValue());

        // Perform addition
        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Summation: " + sum.getValue());

        // Perform bitwise OR
        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("Bitwise OR: " + orResult.getValue());

        // Perform bitwise AND
        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("Bitwise AND: " + andResult.getValue());

        // Perform multiplication
        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Multiplication: " + multiplyResult.getValue());
    }
}
