public class BmiService {
    public double calculate(double number) {
        double weight = 80;
        double height = 1.8;
        double index = weight / (height * height);
        return index;
    }
}
