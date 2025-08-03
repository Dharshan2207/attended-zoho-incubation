public class Main {
    public static void main(String[] args) {
        Term t1 = new Term();
        t1.coefficient = 5;
        t1.variable.put('x', 2);
        String result = t1.toString(t1);
        System.out.println(result);
    }
}
