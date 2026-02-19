package JavaCollection;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        // Push items onto the stack
        books.push("Book A");
        books.push("Book B");
        books.push("Book C");
        System.out.println("Stack: " + books);

        // Peek at the top item
        System.out.println("Top item: " + books.peek()); // Output: Book C

        // Pop the top item
        String removedElement = books.pop();
        System.out.println("Removed element: " + removedElement); // Output: Book C
        System.out.println("Stack after pop: " + books);

        // Check if stack is empty
        System.out.println("Is stack empty? " + books.empty()); // Output: false
    }
}
