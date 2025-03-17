package ui;

import java.util.Scanner;
import model.Algorithms;
import java.util.ArrayList;

public class Main {

    private Scanner sc;
    private Algorithms Algorithm;

    Main() {
        sc = new Scanner(System.in);
        Algorithm = new Algorithms();
    }

    public static void main(String[] args) {
        Main myApp = new Main();
        myApp.run();
    }

    public void run() {

        int option;
        boolean flag = true;

        while(flag) {

            System.out.println("\nEnter the number of the algorithm you want to test:\n\n" +
                    "1. Values that appear more than once.\n" +
                    "2. Is it a palindrome?\n" +
                    "3. How many bits 1 there are?\n" +
                    "4. Enter -1 to exit.\n");


            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    RepeatingValues();
                    break;
                case 2:
                    isPalindrome();
                    break;
                case 3:
                    numberOfBits1();
                    break;
                case -1:
                    flag = false;
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }

        }

    }


    public void RepeatingValues() {

        ArrayList<Integer> values = new ArrayList<>();

        System.out.println("How many numbers you want to enter: ");
        int numNumbers = sc.nextInt();

        System.out.println("Enter the values below:\n");

        for(int i = 0; i < numNumbers; i++) {
            values.add(sc.nextInt());
        }

        System.out.println( Algorithm.repeatingValues(values) );

    }

    public void isPalindrome() {

        System.out.println("Enter the word to verify if is a palindrome: ");

        StringBuilder sb = new StringBuilder();

        for (char c : sc.nextLine().toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }

        System.out.println(Algorithm.isPalindrome(sb.toString()));

    }

    public void numberOfBits1() {

        System.out.println("Enters the bit string: ");
        String bitString = sc.nextLine();

        System.out.println(Algorithm.numberOfBits1(bitString));

    }
}
