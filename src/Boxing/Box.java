package Boxing;

import java.util.Objects;

public class Box <T>{
    private final T item;
    public Box(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(getItem(), box.getItem());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getItem());
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
