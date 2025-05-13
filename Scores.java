public class Scores
{
    public static void main(String[] args)
    {
        // Declare and initialize the scores array
        int[] scores = {80, 95, 82, 67, 100};
        
        // Print the original scores
        for (int score : scores) {
            System.out.println(score);
        }
        
        // Print a blank line
        System.out.println();
        
        // Update the 3rd and last scores
        scores[2] = 72;  // Update the 3rd score (index 2) to 72
        scores[4] = 95;  // Update the last score (index 4) to 95
        
        // Print the updated scores
        for (int score : scores) {
            System.out.println(score);
        }
    }
}