package if_tasks;

import java.util.Scanner;

public class if22 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();

        if(x > 0 && y > 0){
            System.out.println("1 четверть");
        } else if(x < 0 && y > 0){
            System.out.println("2 четверть");
        } else if(x < 0 && y < 0){
            System.out.println("3 четверть");
        } else {
            System.out.println("4 четверть");
        }
    }
}
