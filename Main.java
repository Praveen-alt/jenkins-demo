package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

   public static void main(String[] args) {
    
   //problem 1 
   //Given a list of integers, use the Stream API to filter out only the even numbers and print them.
  /*  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
   numbers.stream().filter(a->a%2==0).forEach(b->System.out.print(b+" ")); */

   //Problem 2
   //Given a list of integers, use the Stream API to square each number and collect the results into a new list.
  /*  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   List<Integer> b =numbers.stream().map(a->a*a).collect(Collectors.toList());
    System.out.println(b);
    */

    //Problem 3
   // Given a list of strings, use the Stream API to concatenate them into a single string with each word separated by a space.
   /* List<String> words = Arrays.asList("Java", "is", "fun");
   String c =words.stream().collect(Collectors.joining(" "));
   System.out.println(c); */

   //Problem 4
   //Given a list of integers, use the Stream API to find the maximum value.
  /*  List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 1);
     int a = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
     System.out.println(a); */

     //Problem 5
     //Given a list of strings, use the Stream API to count how many of the words have more than 3 characters.
     /* List<String> words = Arrays.asList("cat", "dog", "elephant", "lion");
     long c = words.stream().filter(a->a.length()>3).count();
     System.out.println(c); */

     //Problem 6

    // Given a list of strings, use the Stream API to convert each string to uppercase 
    //and join them into a single string separated by commas.
    /* List<String> words = Arrays.asList("java", "python", "javascript");
    String c = words.stream().map(s->s.toUpperCase()).collect(Collectors.joining(","));
    System.out.println(c); */

    //problem 7

    //Given a list of integers with duplicates, use the Stream API to remove duplicates 
    //and sort the list in ascending order.
   /*  List<Integer> numbers = Arrays.asList(5, 3, 7, 3, 5, 1, 9, 7);
    numbers.stream().distinct().sorted().forEach(s->System.out.print(s+" ")); */


    //Problem 8
    //Given a list of strings, use the Stream API to group them by their length into a 
    //map where the key is the length and the value is a list of strings of that length.

    /* List<String> words = Arrays.asList("cat", "dog", "elephant", "bat", "rat");
   Map<Integer, List<String>> c = words.stream().collect(Collectors.groupingBy(String::length));
   System.out.println(c); */

   //problem 9

   //Given a list of integers, use the Stream API to find the average of their squares.
 /*   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
  // double c =numbers.stream().map(n->n*n).collect(Collectors.summarizingInt(Integer::intValue)).getAverage();
  double c = numbers.stream().map(n->n*n).mapToInt(Integer::intValue).average().orElseThrow(NoSuchElementException::new);
   System.out.println(c); */

   //problem 10

   //Given a list of strings, use the Stream API to collect them into 
   //a map where the key is the string and the value is its length.

   /* List<String> words = Arrays.asList("apple", "banana", "cherry");
     Map<String, Integer> d = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
    System.out.println(d);
 */
//Problem 11
    //Given a list of strings, use the Stream API to find the first 
    //string that contains a specific substring

    List<String> strings = Arrays.asList("hello", "world", "test1", "example", "test2");
    String sp = strings.stream().filter(s->s.contains("test")).findFirst().orElse("No such Element");
    System.out.println(sp);
}
}