import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorList {
    public List<Integer> generate(int length) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            res.add(new Random().nextInt(1,100));
        }
        return res;
    }

}
