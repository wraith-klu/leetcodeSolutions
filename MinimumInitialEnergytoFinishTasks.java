import java.util.Arrays;

// LeetCode 1665, Link: https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/

public class MinimumInitialEnergytoFinishTasks {
    public static void main(String[] args) {
        int[][] tasks = {{1, 7}, {2, 8}, {3, 9}, {4, 10}, {5, 11}, {6, 12}};
        int ans = minimumEffort(tasks);
        System.out.println("Minimum initial energy required to finish all tasks = " + ans);
    }

    /*Logic:
        > Sort tasks based on the difference (actual energy - minimum energy) in descending order
        > This way, we prioritize tasks that require more energy than they provide
        > Iterate through the sorted tasks and calculate the minimum initial energy required
    */

    public static int minimumEffort(int[][] tasks) {
        // Sort tasks based on the difference (actual energy - minimum energy) in descending order
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int initialEnergy = 0; // Minimum initial energy required
        int currentEnergy = 0; // Current energy level

        for (int[] task : tasks) {
            int actualEnergy = task[0];
            int minimumEnergy = task[1];

            // If current energy is less than the minimum energy required for the task
            if (currentEnergy < minimumEnergy) {
                // Increase initial energy to meet the requirement
                initialEnergy += (minimumEnergy - currentEnergy);
                currentEnergy = minimumEnergy; // Update current energy to the minimum required
            }

            // Perform the task and update current energy
            currentEnergy -= actualEnergy;
        }

        return initialEnergy;
    }
}
