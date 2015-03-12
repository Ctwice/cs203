package gooddog;

public class Gooddog {

    private int size;

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof Woof!");

        }
    }

}
