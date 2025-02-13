<<<<<<< HEAD:abramyan_tasks/if_tasks/if18.java
package if_tasks;

=======
>>>>>>> origin/main:if/if18.java
import java.util.Scanner;

public class if18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        if(a == b && c != a){
            System.out.println("3");
        } else if(a == c && b != a){
            System.out.println("2");
        } else{
            System.out.println("1");
        }
    }
}
