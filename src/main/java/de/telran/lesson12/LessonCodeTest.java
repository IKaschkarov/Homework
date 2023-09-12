package de.telran.lesson12;

public class LessonCodeTest {

    public static void main(String[] args) {
        CheckNumbers checks = new CheckNumbers();

        int userNumber1 = 10;
        boolean actualResult1 = checks.isEven(userNumber1);
        boolean expectedResult1 = true;

        if (actualResult1 == expectedResult1) {
            System.out.println("Test 1 is OK!");
        } else {
            System.out.println("Test 1 is FAIL!");
            System.out.println("Expected result: " + expectedResult1 + ", but received: " + actualResult1);
        }


        int userNumber2 = 9;
        boolean actualResult2 = checks.isEven(userNumber2);
        boolean expectedResult2 = false;

        if (actualResult2 == expectedResult2) {
            System.out.println("Test 2 is OK!");
        } else {
            System.out.println("Test 2 is FAIL!");
            System.out.println("Expected result: " + expectedResult2 + ", but received: " + actualResult2);
        }


    }

}
