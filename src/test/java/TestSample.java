import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSample {
    ServiseList serviseList;
    GeneratorList generatorList;


    @BeforeEach
    void setUp() {
        serviseList = new ServiseList();
        generatorList = new GeneratorList();
    }

    @Test
    void testCalculateAverage() {    //проверка среднего значения
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        double average = serviseList.calculateAverage(list);

        assertEquals(2.0, average);
    }

    @Test
    void testCompareAverages() {   //проверка сравнения списков
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        String result = serviseList.compareAverages(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }


    @Test
    void testGenerate() {
        List<Integer> list = generatorList.generate(55);

        assertEquals(55, list.size());
        for (int num : list) {
            Assertions.assertTrue(num >= 1 && num <= 100);
        }
    }
}