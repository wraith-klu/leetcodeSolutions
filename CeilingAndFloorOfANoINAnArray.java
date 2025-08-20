public class CeilingAndFloorOfANoINAnArray {
    public static void main(String[] args) {
        int[] num = {2,4,6,8,10,12,14,16,18,20};
        int target = 19;
        
        int ceiling = findCeiling(num, target);
        System.out.println("Index of the Ceiling no : "+ceiling);
        System.out.println("Ceiling no : " +num[ceiling]); // Print the ceiling value

        int floor = findFloor(num, target);
        System.out.println("Index of the Floor no : "+floor);
        System.out.println("Floor no : " + num[floor]); // Print the floor value
    }
    static int findCeiling(int[] num, int target) { // Smallest element in an array which is (target<= element)
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                return mid; // Found exact match
            } else if (num[mid] < target) {
                start = mid + 1; // Move right
            } else {
                end = mid - 1; // Move left
            }
        }
        return start;
    }
    static int findFloor(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                return num[mid]; // Found exact match
            } else if (num[mid] < target) {
                start = mid + 1; // Move right
            } else {
                end = mid - 1; // Move left
            }
        }
        return end; // Return the largest number less than target
    }
}
