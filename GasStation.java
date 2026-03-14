//https://leetcode.com/problems/gas-station/description/

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int result = canCompleteCircuit(gas, cost);
        System.out.println(result);
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int tank = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++) {
            int currentGas = gas[i] - cost[i];
            totalGas += currentGas;
            tank += currentGas;
            if(tank < 0) {
                tank = 0;
                start = i + 1;  // start from next station
            }
        }
        return totalGas < 0 ? -1 : start;
    }
}