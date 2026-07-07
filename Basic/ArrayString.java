public class ArrayString {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        String name = "Java";

        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("First Character: " + name.charAt(0));
    }
}
