import java.util.Arrays;

public class MaximumUnitsonaTruck {
    public static void main(String [] args){
        int [][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        System.out.println(maximumUnits(boxTypes, truckSize));
    }
    /*
    Leetcode Question - 1710, Link - https://leetcode.com/problems/maximum-units-on-a-truck/
    Logic -
        1. We can sort the boxTypes array in descending order based on the number of units per box.
        2. We can then iterate through the sorted array and keep adding the number of units to the total until we reach the truckSize.
        3. If the number of boxes is less than or equal to the truckSize, we can add all the boxes to the truck and reduce the truckSize accordingly.
        4. If the number of boxes is greater than the truckSize, we can add only the number of boxes that can fit in the truck and set the truckSize to zero.   

    Time Complexity - O(nlogn), where n is the length of the boxTypes array.
    Space Complexity - O(1)
    */
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int s=0, i=0;
        while(truckSize !=0 && i<boxTypes.length){
            if(boxTypes[i][0]<=truckSize){
                s += (boxTypes[i][0]*boxTypes[i][1]);
                truckSize -= boxTypes[i][0];
            }else{
                s += (truckSize*boxTypes[i][1]);
                truckSize = 0;
            }
            i++;
        }
        return s;
    }
}
