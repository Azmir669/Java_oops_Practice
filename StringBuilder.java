// StringBuilder.java

public class StringBuilder {

    private String string;

    public StringBuilder() {
        this.string = "";
    }

    public StringBuilder append(String str) {
        this.string += str;
        return this; // Return the current object for method chaining
    }

    public StringBuilder append(int num) {
        this.string += String.valueOf(num);
        return this; // Return the current object for method chaining
    }

    public String toString() {
        return string;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String result = sb.append("Hello, ")
                .append("World!")
                .append(" The answer is ")
                .append(42)
                .toString();

        System.out.println(result); // Output: Hello, World! The answer is 42
    }
}
