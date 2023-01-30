public class Break_Continue {//оператор break для выхода из цикла
    public static void main(String[] args){
        /*int i =0;
        while (true){
            if(i==15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Exit..");*/

        for(int i =0;i<=15; i++){
            if(i%2==0){//%поделить и посмотреть остаток
                continue;//опреатор,после выполнения условия,после котрого ничего дальше  не выплняеться
            }
            System.out.println(" This is "+i);
        }
    }
}
