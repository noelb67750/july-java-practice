public class greeting {
    public interface Greeting {
        default void sayHello() {
            System.out.println("Hello from the interface!");
        }

        void greet(String name);
    }

    public static class GreetingImpl implements Greeting {
        @Override
        public void greet(String name) {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        GreetingImpl greetingImpl = new GreetingImpl();
        greetingImpl.sayHello(); // Output: Hello from the interface!
        greetingImpl.greet("Alice"); // Output: Hello, Alice!
    }
}
