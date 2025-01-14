package U4FRQ_Practice;

    public class CoinGame {


        private int startingCoins;  // starting number of coins
        private int maxRounds;      // maximum number of rounds played
        private int roundTracker = 1; // ADDED TO ENABLE TESTING
        
        
        public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
        }
         
        /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
            THIS WAS AN "implementation not shown" METHOD IN THE ORIGINAL FRQ,
            BUT IS INCLUDED HERE TO ENABLE TESTING
          */
        public int getPlayer1Move() {
          int result;
          if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
            result = 2;
          } else if (roundTracker == 3) {
            result = 1;
          } else {
            result = 3;
          }
          roundTracker++;
          return result;
        }
         
        /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
          * as described in part (a).
          */
        public int getPlayer2Move(int round) {
        /* COPY/PASTE YOUR SOLUTION TO PART A HERE */
        if (round % 3 == 0) {
            return 3;
        } else if (round % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    
        }
        
        
        /** Plays a simulated game between two players, as described in part
          * (b).
          */
        public void playGame() {
        /* COPY/PASTE YOUR SOLUTION TO PART B HERE */
        int p1 = startingCoins;
        int p2 = startingCoins;
        int rounds = 1;
        while ((p1 >= 3 && p2 >= 3) && (rounds <= maxRounds)) {
    int p1Move = getPlayer1Move(); 
    int p2Move = getPlayer2Move(rounds);
    p1 -= p1Move;
    p2 -= p2Move;
    if ((p1Move - p2Move == 2) || (p2Move - p1Move == 2) || (p1Move - p2Move == 0)) {
    p2++;
    } else {
    p1 += 2;
    }
    rounds++;
    }
    
    if (p1 > p2) {
    System.out.println("player 1 wins");
    } else if (p2 > p1) {
    System.out.println("player 2 wins");
    } else {
    System.out.println("tie game");
    }
    
        }
}