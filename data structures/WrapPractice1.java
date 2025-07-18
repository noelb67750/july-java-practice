public class WrapPractice1 {
    public static void main(String[] args)
    {
    Integer wrap = 19;
    System.out.println(wrap);
    
    int prim = wrap; // Unboxing: int prim = wrap.intValue();
    System.out.println(prim);

    int result = wrap.compareTo(prim); // Using compareTo to compare Integer with int
    System.out.println(result);
    }
}
