package GenericBoxOfInteger;

public class Box<T> {
    private T numbers;

    public void add(T numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", "java.lang.Integer", numbers);
    }
}
