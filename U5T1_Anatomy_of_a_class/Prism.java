package U5T1_Anatomy_of_a_class;
public class Prism {

    private int length;
    private int width;
    private int height;

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
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