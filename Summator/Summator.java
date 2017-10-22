package Study.Summator;

public class Summator {

    String bigInteger = ""; // первое слагаемое
    private String newBigInteger = ""; // результат

    public String sum (String term) {

        int lastIdxBI = bigInteger.length(); // последний индекс bigInteger
        int lastIdxT = term.length(); // последний индекс term
        Integer result = 0; // результат сложения
        Integer temp = 0;

        // Здесь привести слагаемые к одной длине
        // Пока проверяю с учетом, что длины равны изначально

        while (lastIdxBI > 0) {

            result = Integer.parseInt(bigInteger.substring((lastIdxBI-1),lastIdxBI))
                    + Integer.parseInt(term.substring((lastIdxT-1),lastIdxT)) + temp; // считаем сумму чисел с конца строк
            // плюс кол-во десятков, полученных из предыдущего сложения (если есть)

            newBigInteger += result.toString().charAt(result.toString().length()-1); // записываем результат сложения
            // (последнее число суммы). Таким способом запись с конца, потребуется перевернуть строку

            if (result.toString().length() > 1) {
                temp = Integer.parseInt(result.toString().substring(result.toString().length()-2,result.toString().length()-1));
            } else temp = 0; // запоминаем кол-во десятков от суммы (если есть)

            lastIdxT--;
            lastIdxBI--;
        }

        StringBuffer resultat = new StringBuffer(newBigInteger).reverse(); // записать в 20-й строке сразу результат

        return resultat.toString();
    }
}
