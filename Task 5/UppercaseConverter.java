import java.util.*;
import java.util.stream.*;

public class UppercaseConverter {
    public static void main(String[] args) {
        // Initial stream with mixed-case strings
        Stream<String> streamName = Stream.of("apple", "mango", "orange");

        // Convert to uppercase using map and collect into a List
        List<String> uppercaseList = streamName
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println(uppercaseList);
    }
}
