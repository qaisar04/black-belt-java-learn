package COLLECTION.LIST_INTERFACE;

import java.util.Stack;

public class StackMethods {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mom");
        stack.push("Sun");
        stack.push("Moon");
        stack.push("Bye");
        stack.push("Hi");

        System.out.println(stack); // [Mom, Sun, Moon, Bye, Hi]


        while (!stack.isEmpty()) {
            // сделали проверку чтобы он не был пуст
            System.out.println(stack.pop()); // для Stack-а первым элементом будет тот кто добавился последним (LIFO)
            System.out.println(stack);
        }


//        с помощью метода peek() мы можем просто просмотреть какой элемент находится на первом месте не удаляя его
//        System.out.println(stack.peek()); // Hi
//        System.out.println(stack); // [Mom, Sun, Moon, Bye, Hi]


    }
}
