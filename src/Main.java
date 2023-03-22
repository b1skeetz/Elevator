import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Type amount of floors: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if(amount > 5){
            Program program = new Program(amount);
            program.start();
        }
        else{
            System.out.println("Actually, you don't need one");
        }
    }
}