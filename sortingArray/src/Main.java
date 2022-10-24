import java.rmi.UnexpectedException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         int n;
         Scanner input = new Scanner(System.in);
         System.out.print("Dizinin boyutu n: ");
         n = input.nextInt();
         int array[] = new int[n];


         for (int i = 0; i<n; i++) {
             array[i] = input.nextInt();
             System.out.println(+ (i+1) + " 'nci elemanı : " + array[i]);

         }

         Arrays.sort(array);
         System.out.print("Sıralama : ");
         for (int num : array) {
             System.out.print(num + " ");
         }


    }
}