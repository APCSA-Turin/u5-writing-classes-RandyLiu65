package FRQs;
public class AdditionPattern {

private int num;
private int plus;

public AdditionPattern(int num, int plus) {
    this.num = num;
    this.plus = plus;
}

public int currentNumber() {
    return num; 
}

public void next() {
    num += plus;
}

public void prev() {
    if (!(num - plus < 0)) {
        num -= plus;
    }
}

}
