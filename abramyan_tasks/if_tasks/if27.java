<<<<<<< HEAD:abramyan_tasks/if_tasks/if27.java
package if_tasks;

=======
>>>>>>> origin/main:if/if27.java
import java.util.Scanner;

public class if27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        int x = scanner.nextInt();

        if(x < 0){
            System.out.println("0");
        } else if((x >= 0 && x < 1) || (x >= 2 && x < 3)){
            System.out.println("1");
        } else if((x >= 1 && x < 2) || (x >= 3 && x < 4)){
            System.out.println("-1");
        }
    }
}
