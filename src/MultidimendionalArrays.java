public class MultidimendionalArrays {
    public static void main(String[] args){
        int[] number = {1,2,3};//одномерный массив
        System.out.println(number[1]);
        int[][] matrice ={{1,2,6,3,9},//двухмерный массив
                            {4,5,6,5},//сначала строки, потом стоблец
                             {7,8,}};
       /* System.out.println(matrice[2][2]);

        String[][] strings = new String[2][3];
        strings[1][1] = "Hello";
        System.out.println(strings[1][1]);*/

        for(int i=0; i<matrice.length; i++){  //иницилизация массива
            for(int j=0; j<matrice[i].length;j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
