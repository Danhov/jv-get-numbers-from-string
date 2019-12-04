package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     *
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     *
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.</p>
     */

    //text.charAt(i) >= 48 && text.charAt(i) <= 57
    public int[] getAllNumbers(String text) {
        int[] numbers = new int[text.length()];
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            StringBuilder sb = new StringBuilder();
            /*if ( (text.charAt(i) >= 48 && text.charAt(i) <= 57)
                    || (text.charAt(i) == 45 && text.charAt(i+1) >= 48
                    && text.charAt(i+1) <= 57)) {*/
            while (text.charAt(i) >= 48 && text.charAt(i) <= 57
                    || (text.charAt(i) == 45 && text.charAt(i + 1) >= 48
                    && text.charAt(i + 1) <= 57)) {
                sb.append(text.charAt(i));
                if (i + 1 >= text.length()) {
                    break;
                } else {
                    i++;
                }
            }
            if (!sb.toString().equals("")) {
                numbers[counter] = Integer.parseInt(sb.toString()) * 2;
                counter++;
            }
            //}

        }
        return Arrays.copyOf(numbers, counter);
    }

}
