package encapsulation;

public class encapsulation_p1 {
    private int a;

    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "encapsulation_p1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
