package Stream;

@FunctionalInterface
public interface FilterOp <T> {
    boolean filter (T o);
}
