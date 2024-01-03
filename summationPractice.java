package methodes;

import java.util.ArrayList;
import java.util.List;

public class summationPractice {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(15);
        num.add(10);

        System.out.println(sumN(num));
    }

    public static int sumN(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Main []";
    }
}