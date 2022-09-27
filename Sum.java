import java.util.Scanner;
public class Sum{

    public static void rowsum(int a[][]) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                sum = sum + a[i][j];
            }
            System.out.println("Row sum is" + " " + sum);
            sum = 0;
        }


    }


    public static void columnsum(int a[][]) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                sum = sum + a[j][i];
            }


            System.out.println("Column sum is" + " " + sum);
            sum = 0;
        }


    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int a[][] = new int[4][4];
        System.out.println("Enter elements");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = x.nextInt();
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        rowsum(a);
        columnsum(a);


    }
}