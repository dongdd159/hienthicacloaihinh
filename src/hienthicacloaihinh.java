import java.util.Scanner;
public class hienthicacloaihinh {
    public static void main(String[] args) {
        int choice=-1;
        Scanner input = new Scanner(System.in);
        while(choice!= 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle botton-left");
            System.out.println("3. Print the square triangle top-left");
            System.out.println("4. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i=0;i<3;i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.printf("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    for (int i=0;i<5;i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.printf("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    for (int i=0;i<5;i++){
                        for (int j=5;j>i;j--){
                            System.out.printf("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    for (int i=0;i<6;i=i+2){
                        for (int n=3;n>i;n=n-2){
                            System.out.printf(" ");
                        }
                        for (int j=0;j<=i;j++){
                            System.out.printf("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }


        }
    }

}
