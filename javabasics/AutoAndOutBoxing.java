import java.util.ArrayList;
import java.util.*;
public class AutoAndOutBoxing
{
    public static void main(String [] args)
    {
        List<Integer> list = new ArrayList<>();//autoboxing

        list.add(10);

        Integer num = list.get(0); //unboxing
        System.out.println(num);
    }
}