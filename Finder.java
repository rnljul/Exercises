/*
Поиск элемента в массиве
*/

package Study.Finder;

public class Finder {

    public static int findIdx(int[] arr, int el) {

        if (arr != null) {

            int leftVal = 0;
            int rightVal = arr.length;
            int middleVal;

        while (leftVal <= rightVal) {

                middleVal = leftVal + (rightVal - leftVal)/2;

                if (el == arr[middleVal]) return middleVal;
                else if (el < arr[middleVal]) {
                    rightVal = middleVal-1;
                }
                else if (el > arr[middleVal]) {
                    leftVal = middleVal+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] myArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(findIdx(myArr, myArr[i]));
        }
    }
}
