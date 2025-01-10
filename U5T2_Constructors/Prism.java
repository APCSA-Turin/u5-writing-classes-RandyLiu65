package U5T2_Constructors;

public class Prism {

    private int length;
    private int width;
    private int height;

    public Prism() {
        setHeight((int)(Math.random() * 101));
        setLength((int)(Math.random() * 101));
        setWidth((int)(Math.random() * 101));
    }

    public Prism(int measure) {
        setHeight(measure);
        setLength(measure);
        setWidth(measure);
    }

    public void setLength(int newLength){
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return (2 * (length * width)) + (2 * (length * height)) + (2 * (width * height));
    }

    public String dimensions() {
        return "Length = " + length +
               "\nWidth = " + width +
               "\nHeight = " + height;
    }
}