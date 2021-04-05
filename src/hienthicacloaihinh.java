import java.util.Scanner;
public class hienthicacloaihinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the:");
        int menu = scanner.nextInt();
        if (menu == 1){
            for (int i=0;i<3;i++){
                for (int j=0;j<7;j++){
                        System.out.printf("*");
                }
                System.out.println("\n");
            }
        }else if (menu == 2){
            for (int i=0;i<5;i++){
                for (int j=0;j<=i;j++){
                        System.out.printf("*");
                }
                System.out.println("\n");
            }
        }else if (menu == 3){
            for (int i=0;i<5;i++){
                for (int j=5;j>i;j--){
                    System.out.printf("*");
                }
                System.out.println("\n");
            }
        }else if (menu == 4   ){
            for (int i=0;i<6;i=i+2){
                for (int n=3;n>i;n=n-2){
                    System.out.printf(" ");
                }
                for (int j=0;j<=i;j++){
                    System.out.printf("*");
                }
                System.out.println("\n");
            }
        }

    }

}
