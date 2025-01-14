package U4FRQ_Practice;

public class FRQSolutions {
    public FRQSolutions() {}

    public void printNums(int value, int numRounds) {
        //your code here
            int num = (int) (Math.random() * 10);
            for (int i = 0; i < numRounds; i++) {
                while (num != value) {
                    num = (int) (Math.random() * 10);
                    System.out.print(num);
                }
                num = (int) (Math.random() * 10);
                System.out.println("");
            }
    }

    public String longestStreak(String str) {
        //your code here
        String currentLongestChar = str.substring(0, 1);
        String currentChar;
        int currentLongestStreak = 1;
        int currentStreak = 1;
        for (int i = 1; i < str.length(); i++) {
            currentChar = str.substring(i, i + 1);
            if (currentChar.equals(str.substring(i - 1, i))) {
                currentStreak++;
                if (currentStreak > currentLongestStreak){
                    currentLongestStreak = currentStreak;
                    if (!currentChar.equals(currentLongestChar)){
                        currentLongestChar = currentChar;
                    }
                }
            } else {
                currentChar = str.substring(i, i + 1);
                currentStreak = 1;
            }
        }
        if (currentStreak > currentLongestStreak) {
            currentLongestStreak = currentStreak;
        }
    
    return currentLongestChar + " " + currentLongestStreak;
    }
      
}
    