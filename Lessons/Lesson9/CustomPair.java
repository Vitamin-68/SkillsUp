package Lesson9;

import java.security.Key;
import java.util.Objects;

public class CustomPair<K, V> {

    private K key;
    private V value;

    public CustomPair() {
    }

    public CustomPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomPair<?, ?> that = (CustomPair<?, ?>) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "CustomPair{" +
                "key=" + key.toString() +
                ", value=" + value.toString() +
                '}';
    }

    static <K, V> boolean compare(K k, V v) {
        return  k.equals(v);
    }

    public void put(K k, V v){
        this.key = k;
        this.value = v;

    }
}
