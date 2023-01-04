package cars.service.carService.support;

import cars.service.carService.car.Car;
import org.springframework.data.relational.core.sql.In;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Test {
    int add(int i, int j){
        return i+j;
    }
    public static void main(String[] args) {
        String s1 = "nowy String";
        String s2 = "nowy String";
        String s3 = new String("nowy String");
        String s4 = new String("nowy String");
        String s5 = new String("nowy String");

//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));
//        System.out.println(s3 == s4);
//        System.out.println(s3.equals(s4));


//        1. true
//            2. true
//            3. false
//            4. true
//            5. false
//            6. true
        //---------------------------------------------------------

        System.out.println(swap("dsadas.;';'./;>{ttfdgsd"));
    }

    public static int sum(int a) {
        int sum = 0;
        for (int i = 0; i < a + 1; i++) {
            sum += i;
        }
        return sum;
    }

    public static long sumSilnia(int a) {
        long sum = 1;
        for (int i = 1; i < a + 1; i++) {
            if (sum * i <= 0) {
                throw new IllegalArgumentException("Number is to big for long");
            }
            sum *= i;
        }
        return sum;
    }

    public static String swap(String word) {
        String[] array = word.split("");
        StringBuilder numbers = new StringBuilder("");
        int digit = 0;

        for (int i = 0; i < array.length; i++) {
            switch (word.toUpperCase(Locale.ROOT).charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    digit = 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    digit = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    digit = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    digit = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    digit = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    digit = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    digit = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    digit = 9;
                    break;
            }
            numbers.append(digit);
            digit = 0;
        }
        return numbers.toString();
    }
}
