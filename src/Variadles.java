public class Variadles {
    public static void main(String [] args){
        int myInt;//целочисленные значения, 32 битное число
        myInt = 34;
        short myShort =32767;//для маленьких значений,16 битное число(-32768 до 32767)
        long myLong = 95995;//для больших,64 бита

        double myDouble = 5886.54;//хранит 64 бита
        float myFloat = 4.5f;//вмещает 32 бита информации,нужно в конце ставить f

        char c = 'a';//символьный тип, пишется в ковычках''
        boolean b = true;//логический тип, true and false

        byte myByte = 127; //вмешает 8 битов или 1 байт(-128 до 127)

        System.out.println(myInt);
    }
}
