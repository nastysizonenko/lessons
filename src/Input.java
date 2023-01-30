import java.util.Scanner;

public class Input {
    public static void main(String[] args){
      //  String s = new String("ne");//создание объекта с помощью new
        Scanner st = new Scanner(System.in);//System.in входной поток
        System.out.println("Input ...");
        String string = st.nextLine();//nextLine() читает одну строчку чего-то, ввод строки
      //  System.out.println("Input...");
        int x = st.nextInt();//ввод числа
        System.out.println(": "+ string + x);
    }
}
