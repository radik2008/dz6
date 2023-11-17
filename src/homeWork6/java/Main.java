import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        GeneratorList generator = new GeneratorList(); //объект другого класса принцип ООП
        ServiseList listUtil = new ServiseList();   //объект другого класса принцип ООП


        List<Integer> list1 = generator.generate(6); //создаем список1
        List<Integer> list2 = generator.generate(5); //создаем список2

        System.out.println("list3 = " + list1); //выводим список1
        System.out.println("list2 = " + list2); //выводим список2


        System.out.println(listUtil.compareAverages(list1, list2));  //применяем метод
    }
}
