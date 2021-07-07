public class Main {
    
    public static void main(String[] args) {
        
        BmiService service = new BmiService();
        double index = service.calculate(80, 1.8);
        System.out.println(index);
    }
}


public class BmiService {
    
    public double calculate(double weight, double height) {
        double index = weight / (height * height);
        return index;
    }
}

