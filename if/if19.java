import java.util.Scanner;

public class if19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        System.out.print("d: ");
        int d = scanner.nextInt();

        if(a == b && b == c && d != a){
            System.out.println("4");
        } else if(a == b && b == d && c != a){
            System.out.println("3");
        } else if(a == c && d == c && b != a){
            System.out.println("2");
        } else {
            System.out.println("1");
        }
    }
}
