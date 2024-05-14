import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size=10;
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < size;i++ ){
            int value = random.nextInt(100);
            randomList.add(value);

        }
        System.out.println(randomList);
        List<Integer> evenNumber = filter(randomList, n-> n % 2 ==0);
        List<Integer> oddNumber = filter(randomList, n-> n % 2 !=0);
        System.out.println(evenNumber);
        System.out.println(oddNumber);

    }
}