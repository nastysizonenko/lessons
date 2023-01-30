import java.util.Scanner;
//do while сначала проверяет инструкции, а потом выполняет условие
public class DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Input 5");
            value =scanner.nextInt();
        } while (value!=5);
        System.out.println("we input 5");

        /*System.out.println("Input 5");
        int value = scanner.nextInt();
        while (value!=5){
            System.out.println("Input 5");
            value = scanner.nextInt();
        }
        System.out.println("We input 5");*/
    }
}
