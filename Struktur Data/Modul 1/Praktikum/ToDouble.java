public class ToDouble<T extends Number> extends LuasSegitiga<T>{
    public ToDouble(T a, T t) {
        super(a, t);
    }

    public double hitungLuasDouble() {
        double a = getAlas().doubleValue();
        double t = getTinggi().doubleValue();
        return 0.5 * a * t;
    }
}
