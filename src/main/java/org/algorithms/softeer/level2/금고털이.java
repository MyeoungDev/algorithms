package org.algorithms.softeer.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 금고털이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int W = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        List<Gem> gems = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] gemInfo = br.readLine().split(" ");
            Gem gem = new Gem(
                Integer.parseInt(gemInfo[0]),
                Integer.parseInt(gemInfo[1])
            );
            gems.add(gem);
        }

        Collections.sort(gems, Comparator.comparing(o -> ((Gem) o).getPrice()).reversed());

        int maxPrice = 0;
        for (Gem gem: gems) {
            if (W < gem.getWeight()) {
                maxPrice += gem.getPrice() * W;
                return;
            } else {
                maxPrice += gem.getWeight() * gem.getPrice();
                W -= gem.getWeight();
            }
        }

        System.out.println(maxPrice);
    }

    static class Gem {
        private int weight;
        private int price;

        public Gem (int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        public int getWeight() {
            return this.weight;
        }

        public int getPrice() {
            return this.price;
        }
    }
}
