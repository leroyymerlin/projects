package Pair;

import java.util.Objects;

class Pair <T, S> {

    private final T integer;
    private final S string;

    private Pair(T integer, S string) {
        this.integer = integer;
        this.string = string;
    }

    public T getFirst() {
        return integer;
    }

    public S getSecond() {
        return string;
    }

    public static<S, T> Pair<S, T> of(S key, T value) {
        return new Pair<>(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?> pair)) return false;

        if (!Objects.equals(integer, pair.integer)) {
            return false;
        }
        return Objects.equals(string, pair.string);
    }

    @Override
    public int hashCode() {
        int result = integer != null ? integer.hashCode() : 0;
        result = 31 * result + (string != null ? string.hashCode() : 0);
        return result;
    }
}
