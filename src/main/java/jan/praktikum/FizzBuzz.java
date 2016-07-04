package jan.praktikum;

/**
 * Created by Praktikant on 04.07.2016.
 */
public class FizzBuzz {
    public static String fizzBuzz() {
        String value= "1 2 Fizz";
        System.out.println(value);
        return value;
    }

    public String numberChange(int i) {
        if(i%3==0&&i%5==0) {
            return"FizzBuzz";
        }

        if(i%3==0) {
            return"Fizz";
        }

        if(i%5==0) {
            return"Buzz";
        }
        return ""+ i;
    }
}
