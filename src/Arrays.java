public class Arrays {

    public static void main(String[] args){
        int number = 10;//примитивный тип данных        [10]коробка со значением
      /*  char character = 'a';//примитивный тип данных  |
        String s = "Hello";//ссылочный тип               |
        String s1 = new String("Hello");*/
        int[] numbers = new int[5];  //                 numbers-> [массив] ссылочный тип данных
      //  System.out.println(numbers[1]);                //0-1-2-3-4
        for(int i =0;i<numbers.length;i++){//иницилизация массива
            numbers[i]= i*10;
            System.out.println(numbers[i]);
        }
        int[] ar = {1,4,5,6};
        for (int i=0;i<ar.length;i++){//иницилизация массива
            System.out.println(ar[i]);
        }


    }

}
