package Study.BigNumber;

public class BigNumber {

    private String lNumber = ""; // первое слагаемое

    public BigNumber(String lNumber) {
        this.lNumber = lNumber;
    }

    // Метод, с помощью которого получаем последнее число слагаемого. Он сейчас не готов.
    // Договаривались, что будет один метод, который позволяет это сделать. Трудность в том, что у нас одно слагаемое
    // типа String, а другое - типа BigNumber. Как из слагаемого типа BigNumber получить последнее число?
    // Вообще, как сделать этот метод?
    private static int getDigitByIdx (int idx, String lNumber, BigNumber rNumber) {
        int lastDigit = Integer.parseInt(lNumber.substring(idx-1, idx));
        idx--;
        if (idx < 0) return -1;
        return lastDigit;
    }


    public BigNumber plus (BigNumber rNumber) {

        int lDigit = 0; // Последнее число первого слагаемого
        int rDigit = 0; // Последнее число второго слагаемого
        int shift = 0; // Сдвиг
        int digitSum; // Сумма lDigit и rDigit
        int digit;
        String result = "";

        while (lDigit != -1 || rDigit != -1) {

            lDigit = getDigitByIdx(lNumber.length(), lNumber, null); // получить последнее число первого слагаемого
            rDigit = getDigitByIdx(, null, rNumber); // получить последнее число второго слагаемого

            digitSum = (lDigit - '0') + (rDigit - '0') + shift; // сумма последних чисел плюс сдвиг

            digit = digitSum%10; // результат сложения: последняя цифра
            shift = (digitSum - digit%10)/10; // сдвиг: 1 или 0

            result = digit + result; // полученная сумма
        }

        return result; // как перевести в BigNumber или есть другой способ?
    }
}