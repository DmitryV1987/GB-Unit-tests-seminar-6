import java.util.List;

public class NumberListUtils {

    public static final double calculateAverage(List&lt;Double&gt; numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List of numbers must not be null or empty");
        }

        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static final String compareAverages(List&lt;Double&gt; list1, List&lt;Double&gt; list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 &gt; average2) {
            return ("Первый список имеет большее среднее значение");
        } else if (average2 &gt; average1) {
            return ("Второй список имеет большее среднее значение");
        } else {
            return ("Средние значения равны");
        }
    }
}
