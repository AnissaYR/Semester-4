public class ToInteger<T extends Number> extends LuasSegitiga<T> {
    public ToInteger(T a, T t) {
        super(a, t);
    }

    public int hitungLuasInteger() {
        int a = getAlas().intValue();
        int t = getTinggi().intValue();
        return (int) (0.5 * a * t);
    }
}
