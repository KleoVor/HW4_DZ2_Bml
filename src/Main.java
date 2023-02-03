public class Main {
    public static void main(String[] args) {

        BmiService servise = new BmiService();
        float height = 1.61F;
        float weight = 94.2F;
        float myBml = servise.calculate(height, weight);
        System.out.println(myBml);
    }
}