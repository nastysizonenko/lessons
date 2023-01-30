import java.util.Scanner;

public class Switch {//оператор, для многих условий
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age...");
        int age = scanner.nextInt();
        switch (age){//строковые и числовые значения
            case 0://перебераем значения
                System.out.println("You 0");
                break;
            case 7:
                System.out.println("You 7");
                break;
            case 18:
                System.out.println("You 18");
                break;
            default:
                System.out.println("error");
        }
    }
}
