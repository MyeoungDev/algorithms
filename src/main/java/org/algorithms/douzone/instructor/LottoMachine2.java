package org.algorithms.douzone.instructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.algorithms.douzone.lotto.Ball;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class LottoMachine2 {
    private ArrayList<Ball> balls;

    private static final int COUNT = 6;

    /**
     * 6개의 볼을 빼는 메서드.
     *
     * @return 빠진 로또 볼의 배열 length = 6
     */
    public Ball[] startMachine() {
        Ball[] selectedBalls = new Ball[COUNT];

        for (int i = 0; i < selectedBalls.length; i++) {
            selectedBalls[i] = getBall();
        }


        return selectedBalls;
    }

    private Ball getBall() {

        Random random = new Random();

        Ball selectedBall = null;
        do {
            int randomInt = random.nextInt(balls.size());
            selectedBall = balls.get(randomInt);

        } while (selectedBall.isExit());

        /**
         * 중복처리
         * 저장소에서 꺼낼 공 결정
         * 공을 꺼낸다
         * 꺼낸 공 중복 체크
         * 중복이 아닐경우 중복체크 후 빠져나감
         */

        return selectedBall;
    }
}
