package org.algorithms.douzone.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class LottoMachine {

    private List<Ball> lottoBalls;

    private static final StringBuilder sb = new StringBuilder();

    private static final int COUNT = 6;

    public LottoMachine(List<Ball> lottoBalls) {
        this.lottoBalls = lottoBalls;
    }

    public void running() {

        List<Ball> selectedBalls = new ArrayList<>();
        Random random = new Random();

        int i = 0;
        while (i < COUNT) {
            int randomInt = random.nextInt(45);
            Ball ball = lottoBalls.get(randomInt);

            if (ball.isExit()) {
                continue;
            }

            selectedBalls.add(ball);
            sb.append(ball);
            i++;
        }

        System.out.println(sb);

    }
}