package Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Streams<T> {

    private final List<T> list;

    private Streams (List<T> list){
        this.list = new ArrayList<>(list);
    }

    public static <T> Streams<T> of(List<T> list) {
        return new Streams<>(list);
    }

    public Streams<T> filter(FilterOp<T> op) {
        List<T> newList = new ArrayList<T>();
        for (T t : list) {
            if(op.filter(t)){
                newList.add(t);
            }
        }
        return new Streams<>(newList);
    }

    public Streams<T> transform(TransformOp<T> op) {
        List<T> newList = new ArrayList<>();
        for (T t : list) {
            newList.add(op.transform(t));
        }
        return new Streams<>(newList);
    }

    public Map toMap(KeyOp<T> keyOp, ObjOp<T> objOp) {
        Map result = new HashMap();
        for (T t : list) {
            result.put(keyOp.getKey(t), objOp.getObj(t));
        }
        return result;
    }
}

