import java.util.*;
import java.util.stream.*;

public class stringFilter {
    public static void main(String[] args) {
        // List with some empty and non-empty strings
        List<String> listStrings = Arrays.asList("javascript", "", "html", "", "java");

        // Filter out empty strings
        List<String> nonEmptyList = listStrings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Print the final filtered list
        System.out.println(nonEmptyList);
    }
}
