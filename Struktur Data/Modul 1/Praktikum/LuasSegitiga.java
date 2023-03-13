public class LuasSegitiga<T extends Number> {
    private final T alas;
    private final T tinggi;

    public LuasSegitiga(T a, T t) {
        this.alas = a;
        this.tinggi = t;
    }

    public T getAlas() {
        return alas;
    }

    public T getTinggi() {
        return tinggi;
    }
}
