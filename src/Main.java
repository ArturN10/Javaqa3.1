public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(91, 1.86);
        System.out.println("Индекс массы тела " + BMI);
    }
}