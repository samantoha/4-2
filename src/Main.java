public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        int weight = 95;
        double height = 1.82;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}
