package Stream;

@FunctionalInterface
public interface ObjOp<T> {
    Object getObj(T o);
}
