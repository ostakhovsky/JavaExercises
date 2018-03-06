package chapter4;

import java.util.Arrays;
import java.util.Scanner;


public class Encription {
  /*
  ex. 4.38
  “Your application should read a four-digit integer entered by the user and encrypt it as follows:
  Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10.
  Then swap the first digit with the third, and swap the second digit with the fourth.
  Then print the encrypted integer. Write a separate application that inputs an encrypted four-digit integer and decrypts it
  (by reversing the encryption scheme) to form the original number. ”

Excerpt From: Paul Deitel. “Java™ How To Program (Early Objects), Tenth Edition.” iBooks.
   */

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 4 digit number");
    int number = scanner.nextInt();
    int encypted;

    if (Integer.toString(number).length() != 4) {
      System.out.println("Incorrect length");
    } else {
      encypted =encrypt(toArr(number));
      System.out.println(encypted);
      System.out.println(decrypt(encypted));
    }
  }

  private static String toStr(int[] arr) {
    int res = 0;
    for (int i=0; i< arr.length;i++){
      res+= arr[i] * Math.pow(10,i);
    }
    return String.valueOf(res);
  }

  private static int decrypt(int encypted) {
    return 0;
  }

  private static int encrypt(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int current = arr[i];
      current = (current + 7) % 10;
      arr[i] =  current;
    }

    int temp = arr[2];
    arr[2] = arr[0];
    arr[0] = temp;
    temp = arr[3];
    arr[3] = arr[1];
    arr[1] = temp;

    return Integer.parseInt(toStr(arr));
  }

  private static int[] toArr(int number) {
    int len = Integer.toString(number).length();
    int[] arr = new int[len];

    for (int i = len - 1; i >= 0; i--) {
      arr[i] = number % 10;
      number = number / 10;
    }
    return arr;
  }
}