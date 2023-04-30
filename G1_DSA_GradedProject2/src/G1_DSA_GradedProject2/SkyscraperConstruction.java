package G1_DSA_GradedProject2;

import java.util.Collections;
import java.util.Stack;
import java.util.Scanner;


public class SkyscraperConstruction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the total number of floors in the building: ");
        int totalFloor = input.nextInt();

        int[] n = new int[totalFloor];
        for (int i = 0; i < totalFloor; i++) {
            System.out.print("Enter the floor size given on day " + (i + 1) + ": ");
            n[i] = input.nextInt();
        }

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n.length; i++) {
            Boolean flag = true;
            System.out.println();
            System.out.print("Day " + (i + 1) + ": ");
            stack.push(n[i]);
            Collections.sort(stack);

            while (flag) {
                if (totalFloor == stack.peek()) {
                    System.out.print(stack.pop() + " ");
                    totalFloor--;
                    if (stack.isEmpty())
                        flag = false;
                } else
                    flag = false;
            }
        }
        input.close();
    }
}
