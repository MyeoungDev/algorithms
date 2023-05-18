package org.algorithms.douzone.lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Lotto {
    public static void main(String[] args) {

        List<Ball> lottoBalls = new ArrayList<>();
        for (int i = 1; i < 46; i++) {
            lottoBalls.add(new Ball(i));
        }

        LottoMachine lottoMachine = new LottoMachine(lottoBalls);
        lottoMachine.running();

    }
}
