import java.util.Scanner;

public class TotalMainCross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = scanner.nextInt();

        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = (int) Math.round(Math.random()*99);
            }
        }

        System.out.println("Elements of array: ");
        for (int i = 0; i < row; i++) {
            System.out.print("{\t");
            for (int j = 0; j < row; j++) {
                System.out.printf("%02d \t",arr[i][j]);
            }
            System.out.println("}");


        }
        System.out.println("Total of Main cross is: "+ totalMainCross(arr));

    }
    public static int totalMainCross(int[][] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total+= arr[i][i];
        }
        return total;
    }

}
