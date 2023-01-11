public class Geron {
    public static double geron(double a, double b, double c){
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        System.out.print(s > 0 ? s : "Такого треугольника не существует");
        return p;
    }
}
