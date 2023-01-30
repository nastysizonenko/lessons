public class WhileLoops {
        //Цикл While, выполняеться пока условие() равно true
    public static void main(String[] args){
        boolean tf = 5>5;
        boolean ft = 5==5;//операция сравнения
        System.out.println(tf+" "+ ft);

        int value = 0;
        while (value<5){
            System.out.println("Hello "+ value);
            value = value+1;
            System.out.println(value);

        }

    }
}
