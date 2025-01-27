package StaticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tmpAge = list.get(i).getAge();
            if (tmpAge > max) {
                max = tmpAge;
            }
        }
        return max;
    }
}
