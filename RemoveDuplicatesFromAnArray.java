import java.util.*;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9, 7, 1};

        int[] uniqueArr = Arrays.stream(arr).distinct().toArray();

        System.out.println("Using Streams: " + Arrays.toString(uniqueArr));
        System.out.println("Length of unique elements: " + uniqueArr.length);
    }
}


