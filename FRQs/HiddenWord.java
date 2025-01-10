package FRQs;

public class HiddenWord {

    private String hiddenWord;

public HiddenWord(String hiddenWord) {
    this.hiddenWord = hiddenWord;
}

public String getHint(String guess) {
    String hint = "";
    for (int i = 0; i < hiddenWord.length(); i++) {
        String guessCurrent = guess.substring(i, i+1);
        String hiddenCurrent = hiddenWord.substring(i, i+1);
        if (guessCurrent.equals(hiddenCurrent)) {
            hint += guessCurrent;
        } else if (hiddenWord.indexOf(guessCurrent) != -1) {
            hint += "+";
        } else {
            hint += "*";
        }
    }
    return hint;
}
}
    
