package me.islandscout.sshd.utils;

//Because OpenJDK does not include JavaFX, I need to make my own Pair.
public class Pair<K,V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair(Pair<K, V> pair) {
        this.key = pair.getKey();
        this.value = pair.getValue();
    }

    public K getKey() { return key; }

    public V getValue() { return value; }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
