<<<<<<< HEAD:abramyan_tasks/if_tasks/if29.java
package if_tasks;

=======
>>>>>>> origin/main:if/if29.java
import java.util.Scanner;

public class if29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        int x = scanner.nextInt();

        if(x % 2 == 0 && x > 0){
            System.out.println("четное положительное число");
        } else if(x % 2 == 0 && x < 0){
            System.out.println("четное отрицательное число");
        } else if(x % 2 != 0 && x > 0){
            System.out.println("нечетное положительное число");
        } else{
            System.out.println("нечетное отрицательное число");
        }
    }
}
