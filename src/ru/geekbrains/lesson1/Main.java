package ru.geekbrains.lesson1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));

        int[] inputArray = new int[8];
        fillInArrayWithProgression(inputArray);
        System.out.println(Arrays.toString(inputArray));

        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationOnSix(myArray);
        System.out.println(Arrays.toString(myArray));

        int[][] square = new int[5][5];
        System.out.println();
        fillInDiagonalsWithOnes(square);

        int[] minMaxArray = {1, 5, 18, 34, 84, 2, 52, 26};
        System.out.println(Arrays.toString(minMaxArray));
        printMinAndMax(minMaxArray);

        int[] balanceArray = {1, 2, 1, 1, 1, 1};
        System.out.println(Arrays.toString(balanceArray));
        boolean isBalanced = hasBalance(balanceArray);
        System.out.println(isBalanced);

        int[] rightShiftArray = { 1, 4, 6, 7, 10};
        System.out.println(Arrays.toString(rightShiftArray));
        rightShift (rightShiftArray);
        System.out.println(Arrays.toString(rightShiftArray));
    }

        static void fillInArrayWithProgression (int[] inputArray) {
            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] = i * 3;
      }
    }

        static void multiplicationOnSix (int[] myArray) {
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = (myArray[i] < 6) ? (myArray[i] * 2) : (myArray[i]);
                }
            }

        static void fillInDiagonalsWithOnes (int[][] square) {
            for (int i = 0; i < square.length; i++) {
                square[i][i] = 1;
                square[i][square[i].length - 1 - i] = 1;
            }
        }

        static void printMinAndMax (int[] minMaxArray) {
            int min = minMaxArray[0];
            int max = minMaxArray[0];
            for (int i = 1; i < minMaxArray.length; i++) {
                if (min > minMaxArray[i]) {
                    min = minMaxArray[i];
                }
                if (max < minMaxArray[i]) {
                    max = minMaxArray[i];
                }
            }
            System.out.println("Minimum: " + min + " Maximum: " + max);
        }

        static boolean hasBalance (int[] balanceArray) {
            int leftSum = 0;
            for (int i = 0; i < balanceArray.length; i++) {
                leftSum += balanceArray[i];

                int rightSum = 0;
                for (int j = (i + 1); j < balanceArray.length; j++) {
                    rightSum += balanceArray[i];
                }
                if (leftSum == rightSum) {
                    return true;
                }
            }
            return false;
        }

        static void rightShift (int[] shiftArray) {
            int buffer = shiftArray[0];
            shiftArray[0] = shiftArray[shiftArray.length - 1];
            for (int j = 1; j < (shiftArray.length - 1); j++) {
                shiftArray[shiftArray.length - 1] = shiftArray[shiftArray.length - j - 1];
            }
            shiftArray[1] = buffer;
        }
    }