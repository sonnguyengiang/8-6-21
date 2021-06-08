import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        int choose = -1;
        Scanner scanner = new Scanner(System.in);
        while (choose != 0) {
            System.out.println("menu");
            System.out.println("1: Draw the square");
            System.out.println("2: ve tam giac");
            System.out.println("3: ve tam gac nguoc");
            System.out.println("enter");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    for (int i = 0; i <= 6; i++) {
                        System.out.println("* * * * * *");
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5 ; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1 ; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice!");
            }
        }
    }
}
