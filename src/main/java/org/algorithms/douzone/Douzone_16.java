package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_16 {
    public static void main(String[] args) {
        int i = 128;

        byte b = (byte) i;
        System.out.println(b);

        byte c = -71;
        int d = c & 0xff;
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));

        byte f = 9;
        System.out.println(~f);
        System.out.println(Integer.toBinaryString(f));
        /**
         * int to byte - (byte) int 형식으로 int 값을 byte로 변환 할 수 있다.
         * 단, byte의 경우 127을 넘어가는 경우 음수로 인식한다.
         * (int) byte 형식으로 형 변환 할 경우 음수로 출력되어 정상적인 int 값이 나오지 않을 수 있다.
         *
         * byte to int - byte & 0xff 형식으로 byte 값을 int로 형 변환 한다.
         */
    }
}
