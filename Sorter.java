/*
Сортировка элементов массива по возрастанию
*/

package Study.Sorter;

public class Sorter {

    private static void sortArray(int[] Array) {

        if (Array != null) {
            int temp;
            for (int j = Array.length; j > 0; j--) {
                for (int i = 0; i < Array.length-1; i++) {
                    if (Array[i] > Array[i + 1]) {
                        temp = Array[i];
                        Array[i] = Array[i + 1];
                        Array[i + 1] = temp;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] myArray = {15, 0, 6, 3, 3, 7, 2, 8, 9};

        sortArray(myArray);
        for(int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
    }
}