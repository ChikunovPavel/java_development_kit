package lesson3.hw3;

import java.sql.SQLOutput;
import java.util.function.Function;


public class Main {

    public static void main(String[] args) {
        Pair<Integer, Boolean> pair = new Pair<>(123, true);
        System.out.println(pair);

    }
}


class Pair<T, R> {


    private final T first;
    private final R second;


    public Pair(T first, R second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }


    @Override
    public String toString() {

        return String.format("first = %s \nsecond = %b", this.first, this.second);
    }


}
