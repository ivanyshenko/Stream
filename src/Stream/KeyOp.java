package Stream;

@FunctionalInterface
public interface KeyOp<T> {
    Object getKey(T o);
}
