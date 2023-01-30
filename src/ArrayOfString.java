public class ArrayOfString {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        String [] strings = new String[3];
        strings[0]="one";
        strings[1]="two";
        strings[2]="tree";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for(int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }

        for(String x:strings){//цикл for each для перебоа массивов и коллекций  тип данных|название переменной|массив
            System.out.println(x);
        }
        int[] num = {1,3,4};
        int sum = 0;
        for( int num1:num){
                sum= sum + num1;
            System.out.println(sum);
        }
        System.out.println(sum);

        int value =0;
        String s = null; //переменная s  ни на что не ссылается

    }
}
