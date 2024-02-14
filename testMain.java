import org.junit.Test;
import static org.junit.Assert. * ;

@Test
    public void testMain() {
        // Проверка работы программы при вводе двух списков одинаковой длины и одинаковых чисел
        int firstList = {1, 2, 3};
        int secondList = {1, 2, 3};
        assertEquals(averageFirstList, averageSecondList, 0.0);

        // Проверка работы программы при вводе двух списков разной длины
        firstList = {1, 2, 3, 4};
        secondList = {4, 5, 6};
        assertNotEquals(averageFirstList, averageSecondList, 0.0);

        // Проверка работы программы при вводе двух списков, содержащих отрицательные числа
        firstList = {-1, -2, -3};
        secondList = {-4, -5, -6};
        assertNotEquals(averageFirstList, averageSecondList, 0.0);

        // Проверка работы программы при вводе двух списков, содержащих только целые числа
        firstList = {1, 2, 3};
        secondList = {7, 8, 9};
        assertNotEquals(averageFirstList, averageSecondList, 0.0);

        // Проверка работы программы при вводе двух списков, содержащих числа разных типов данных
        firstList = {1, "2", 3};
        secondList = {4, 5, "6"};
        assertNotEquals(averageFirstList, averageSecondList, 0.0);
    }
}
