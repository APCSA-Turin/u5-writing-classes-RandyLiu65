package FRQs;

public class Vocab {
    /* The controlled vocabulary for a Vocab object.
     */
    private String[] theVocab;
    
    public Vocab(String[] vocab) {
      theVocab = vocab;
    }
    
    /* Searches for a string in theVocab. Returns true if its String 
       parameter str is an exact match to an element in theVocab and
       returns false otherwise.
     */
    public boolean findWord(String str) {
      /* implementation not shown */
      for (String word : theVocab) {
        if (word.equals(str)) {
          return true;
        }
      }
      return false;
    
    }

    public String[] getTheVocab() {
        return theVocab;
      }
      
    
    /* Counts how many strings in wordArray are not found in theVocab,
      as described in part (a).
  
  
      PRECONDITION: wordArray contains no duplicates
     */
    public int countNotInVocab(String[] wordArray) {
      /* to be implemented in part (a) */
      int count = 0;
      for (int v = 0; v < wordArray.length; v++) {
          if (!(findWord(wordArray[v]))) {
              count++;
          }
      }
      return count;
    }

    
    /* Returns an array containing strings from wordArray not found in
      theVocab, as described in part (b).
  
  
      PRECONDITION: wordArray contains no duplicates
     */
    public String[] notInVocab(String[] wordArray) {
      /* to be implemented in part (b) */
    int num = countNotInVocab(wordArray);
    int num2 = wordArray.length;
    String newArray[] = new String[num];
    for (int i = 0; i < num; i++) {
        for (int j = 0; j < num2; j++) {
            if (!(findWord(wordArray[j]))) {
                String tempArray[] = new String[num2];
                for (int k = 0; k < num2; k++) {
                    if (k != j) {
                        tempArray[k] = wordArray[k];
                    }
                    
                }
                newArray[i] = wordArray[j];
                num2--;
            }
        }
    }
    return newArray;
    }
  
}
