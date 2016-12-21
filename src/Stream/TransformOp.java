package Stream;

@FunctionalInterface
public interface TransformOp<T> {
    T transform(T o);
}
