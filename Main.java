public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 80;
        double index = service.calculate(weight);
        System.out.println(index);
    }
}
