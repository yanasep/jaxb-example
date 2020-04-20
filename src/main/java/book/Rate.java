package book;

import lombok.Data;

import java.util.Arrays;
import java.util.stream.IntStream;

@Data
public class Rate {
    int[] ratings;
    double average;

    public Rate(int one, int two, int three, int four, int five) {
        ratings = new int[]{one, two, three, four, five};
    }

    public double getAverage() {
        return IntStream.range(0, ratings.length).map(i -> ratings[i] * (i + 1)).sum() / (double)Arrays.stream(ratings).sum();
    }
}
