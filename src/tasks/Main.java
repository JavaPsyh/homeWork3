package tasks;

import tasks.robot.Robot;
import tasks.robot.MoveRobot;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//      3.1
        int[] bigSortedArray = CreatSortedArray
                .creatSortedArray(new int[]{0, 4, 7, 9}, new int[]{1, 2, 4, 6, 8, 1000});
        System.out.print("{");
        for (int i = 0; i < bigSortedArray.length; i++) {
            if (i == bigSortedArray.length - 1) {
                System.out.println(bigSortedArray[i] + "}\n");
            } else {
                System.out.print(bigSortedArray[i] + ", ");
            }
        }

//      3.2
        System.out.println(StringsPerRoles.stringsPerRoles(StringsPerRoles.roles, StringsPerRoles.text));

//      3.3 Robot
        Robot robot = new Robot();
        Random random = new Random();
        int max = 10;
        int min = -10;
        int xT = random.nextInt((max - min) + 1) + min;
        int yT = random.nextInt((max - min) + 1) + min;
        System.out.println("Where was:");
        System.out.println("X " + robot.getX());
        System.out.println("Y " + robot.getY());
        System.out.println(robot.getDirection());
        System.out.println();
        System.out.println("Target:");
        System.out.println("X " + xT);
        System.out.println("Y " + yT);
        MoveRobot.moveRobot(robot, xT, yT);
        System.out.println();
        System.out.println("Where is:");
        System.out.println("X " + robot.getX());
        System.out.println("Y " + robot.getY());
        System.out.println(robot.getDirection());
//      3.4
        EqualsAndHashCodeOverriding object1 = new EqualsAndHashCodeOverriding(3.14, 2.718);
        EqualsAndHashCodeOverriding object2 = new EqualsAndHashCodeOverriding(3.14, 2.718);
        EqualsAndHashCodeOverriding object3 = new EqualsAndHashCodeOverriding(1.618, 1.08);
        EqualsAndHashCodeOverriding object4 = object1;
        System.out.println();
        System.out.println("Is object1 equals to object2? " + object1.equals(object2));
        System.out.println("Is object1 equals to object3? " + object1.equals(object3));
        System.out.println("Is object1 equals to object4? " + object1.equals(object4));
        System.out.println("Is object2 equals to object4? " + object2.equals(object4));
        System.out.println();
        System.out.println("HashCode of object1 is " + object1.hashCode());
        System.out.println("HashCode of object2 is " + object2.hashCode());
        System.out.println("HashCode of object3 is " + object3.hashCode());
        System.out.println("HashCode of object4 is " + object4.hashCode());
//      3.5
        System.out.println(IsStringPalindrome.isStringPalindrome("I don't understand that I can't explained!!!"));
        System.out.println(IsStringPalindrome.isStringPalindrome("1? 2#?, Eh (e) в Америці бухати можна з 21!!!"));
//      3.6
        System.out.println("\nFactorial of number 10 is: " + FactorialOfNumber.factorialOfNumber(10));
//      3.7
        System.out.println();
        String mateAcedemyIsCool = "Mate academy is cool!";
        AsciiCharSequence answer = new AsciiCharSequence(mateAcedemyIsCool.getBytes());
        System.out.println("Sequence - " + answer.toString());
        System.out.println("Length of sequance - " + answer.length());
        System.out.println("Symbol with index 3 - " + answer.charAt(3));
        System.out.println("Subsequence - " + answer.subSequence(1, 5));
        System.out.print("{");
        for (int i = 0; i < mateAcedemyIsCool.length(); i++) {
            if (i != mateAcedemyIsCool.length() - 1) {
                System.out.print(mateAcedemyIsCool.getBytes()[i] + ", ");
            } else {
                System.out.print(mateAcedemyIsCool.getBytes()[i] + "}");
            }
        }
        System.out.println();
//      3.8 package java.filterofcomments;
//      3.9
        System.out.println();
        int number = -25;
        System.out.println("Square root of number " + number + " is: " +
                MathSqRt.mathSqRt(number));
    }
}
