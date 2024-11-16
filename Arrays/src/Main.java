import ArrayImp.*;

public class Main {
    public static void main(String[] args) {

        Array<Integer> example = new Array<>(5);

        example.addElement(6);
        example.addElement(8);
        example.addElement(3);
        example.addElement(5);
        example.addElement(1);

        example.getArray();

    }
}