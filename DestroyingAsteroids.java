import java.util.Arrays;

class DestroyingAsteroids {
    public static void main(String[] args) {
        int[] asteroids = {5, 10, 1};
        int mass = 6;
        boolean canDestroy = canDestroyAsteroids(asteroids, mass);
        System.out.println("Can destroy all asteroids: " + canDestroy);
    }
    /*
    LeetCode Problem : 2126, Link: https://leetcode.com/problems/destroying-asteroids/
    Logic:
        > Sort the asteroids array in ascending order.
        > Initialize a variable s to store the current mass of the spaceship, starting with the initial mass.
        > Iterate through the sorted asteroids array:
            - If the current mass s is less than the size of the asteroid, it means we cannot destroy that asteroid, so we return false.
            - Otherwise, we can destroy the asteroid, and we add its size to our current mass s.
        > If we successfully iterate through all asteroids without returning false, it means we can destroy all asteroids, so we return true.   

    Time Complexity: O(n log n) due to the sorting step, where n is the number of asteroids. The iteration through the asteroids takes O(n).
    Space Complexity: O(1) if we ignore the space used by the sorting algorithm, or O(n) if the sorting algorithm used is not in-place. 
    
    Note:-
        Arrays.sort() in Java uses a dual-pivot quicksort for primitive types, which is an in-place sorting algorithm, 
        so the space complexity can be considered O(1) in this case.
    */

    public static boolean canDestroyAsteroids(int[] asteroids, int mass) {
        Arrays.sort(asteroids);
        long s = mass;
        for(int i : asteroids){
            if(s<i){
                return false;
            }else{
                s += i;
            }
        }
        return true;
    }
}