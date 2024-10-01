package hcyclewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Javastreams {
    public static void main(String[] args)
    {
        regular();
    }
    public static void regular()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Adam");
        names.add("Alok");
        names.add("divya");
        names.add("Ashish");
        names.add("Wasim");

        Long cnt = names.stream().filter(s-> s.startsWith("A")).count();
        System.out.println(cnt);

        long d = Stream.of("Adam", "Alok", "Divya", "Ashish", "Wasim").filter(s->s.endsWith("m")).count();
        System.out.println(d);

        names.stream().filter((s->s.length()>4)).limit(2).forEach(s->System.out.println(s));

        Stream.of("Adam", "Alok", "Divya", "Ashish", "Wasim").map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        List<String> name = Arrays.asList("Adam", "Alok", "Divya", "Ashish", "Wasim");
        name.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        Stream<String> newName = Stream.concat(name.stream(), names.stream());
        boolean flag = newName.anyMatch(s->s.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assert.assertTrue(flag);

    //    List<String> nameLst = newName.collect(Collectors.toList());

       List<Integer> intLst = Arrays.asList(1, 2, 3, 4, 3, 4, 1);
       intLst.stream().distinct().sorted().forEach(s->System.out.println(s));
       List<Integer> intLst1 = intLst.stream().distinct().sorted().collect(Collectors.toList());
       System.out.println(intLst1.get(2));


    }

}
