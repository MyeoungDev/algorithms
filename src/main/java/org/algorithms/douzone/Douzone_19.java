package org.algorithms.douzone;

import java.util.Random;
import java.util.Scanner;

/**
 * bit-practice-1 문제
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_19 {
    public static void main(String[] args) {
        /**
         * 1번
         */
//        Scanner scanner = new Scanner(System.in);
//        int num = 0;
//
//        System.out.println("수를 입력하세요 : ");
//        num = scanner.nextInt();
//
//        if (num % 3 == 0) {
//            System.out.println("3의 배수입니다.");
//            return;
//        }
//        System.out.println("3의 배수가 아닙니다.");
//
//        scanner.close();

        /**
         * 3번
         */
//        Scanner sc = new Scanner(System.in);
//
//        int num = 0;
//        int sum = 0;
//
//        System.out.print("숫자를 입력하세요: ");
//        num = sc.nextInt();
//
//        if (num % 2 == 0) {
//            for (int i = 0; i <= num; i += 2) {
//                sum += i;
//            }
//        } else {
//            for (int i = 1; i <= num; i += 2) {
//                sum += i;
//            }
//        }
//        System.out.println("결과 값: ");
//        System.out.println(sum);

        /**
         * 4번,
         */
//        Scanner sc = new Scanner(System.in);
//        String str = null;
//
//        int pointer = 1;
//        System.out.println("문자열을 입력하세요 : ");
//        str = sc.next();
//
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.substring(i, pointer));
//            System.out.println(str.charAt(i));
//            pointer++;
//        }


        /**
         * 5번
         */
//        String clapNum = null;
//        int clapCount = 0;
//        int tenDigit;
//        int unitsDigit;
//        for (int i = 1; i < 10; i++) { clapNum = i + "";
//            tenDigit = clapNum.charAt(0);
//            if (tenDigit == '3' || tenDigit == '6' || tenDigit == '9') { System.out.println(tenDigit - 48 + " 짝");
//            } }
//        for (int i = 1; i < 10; i++) { clapNum = i + ""; clapCount = 0;
//            tenDigit = clapNum.charAt(0); unitsDigit = clapNum.charAt(1);
//            if (unitsDigit == '3' || unitsDigit == '6' || unitsDigit == '9') { clapCount++;
//            }
//            if (tenDigit == '3' || tenDigit == '6' || tenDigit == '9') { clapCount++;
//            }
//            if (clapCount == 1) { System.out.println(clapNum + " 짝"); }
//            if (clapCount == 2) { System.out.println(clapNum + " 짝짝"); } }


        /**
         * 6번
         */
//        final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
//        Scanner sc = new Scanner(System.in);
//        int num;
//        System.out.print("금액: ");
//        num = 6000;
//        if (num < 0) {
//            num = 0;
//        }
//        int[] changes = {0, 0, 1, 1, 0, 0, 0, 0, 0, 0};
//        for (int i = 0; i < MONEYS.length; i++) {
//            System.out.println(MONEYS[i] + "원 : " + changes[i] + "개");
//        }


        /**
         * 7번
         */
//        Scanner in = new Scanner(System.in); int intArray[] = new int[5];
//        double sum = 0;
//        /* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */ System.out.println("5개의 숫자를 입력하세요.");
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = in.nextInt(); }
//        /*배열에 저장된 정수 값 더하기*/
//        for (int i = 0; i < intArray.length; i++) {
//            sum += intArray[i];
//        }
//        sum /= intArray.length;
//        /* 출력 */
//        System.out.println("평균은 " + sum + " 입니다.");


        /**
         * 8번
         */
//        char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
//        printCharArray(c);
//        replaceSpace(c);
//        printCharArray(c);

        char[] c1 = reverse( "Hello World" ); printCharArray( c1 );
        char[] c2 = reverse( "Java Programming!" ); printCharArray( c2 );

        Scanner scanner = new Scanner(System.in); boolean flag = true;
        do {
            Random r = new Random(); int k = r.nextInt(100) + 1;
            System.out.println("수를 결정하였습니다. 맞추어 보세요"); System.out.println("1-100");
            int count = 1;
            while (true) {
                System.out.print((count++) + ">>"); String targetNum = scanner.next();
                if (Integer.parseInt(targetNum) > k) { System.out.println("더 낮게"); continue;
                } else if (Integer.parseInt(targetNum) < k) { System.out.println("더 높게");
                    continue;
                }
                System.out.println("맞았습니다."); System.out.print("다시하시겠습니까(y/n)>>");
/**
 * "다시 하시겠습니까(y/n)>>"에 대한 대답으로 사용자가 "y"나 "n"을
 * 비교하기 위해 다음의 코드를 사용합니다.
 */
                String answer = scanner.next();
                if( answer.equals("y") ){ break;
                } else {
//종료하도록 작성한다. flag = false; return;
                } }
        } while (flag);
    }

    public static char[] reverse(String str) { char[] result = str.toCharArray();
        int begin = 0;
        int end = result.length - 1;
        char temp;
        while (end > begin) {
            temp = result[begin]; result[begin] = result[end]; result[end] = temp; begin++;
            end--;
        }
        return result;
    }
    public static void printCharArray(char[] array){ for (Character c : array) {
        System.out.print(c);
    }
        System.out.println(); }

//    public static void replaceSpace(char[] c) {
//        for (int i = 0; i < c.length; i++) { if (c[i] == ' ') {
//            c[i] = ','; }
//        } }
//    public static void printCharArray(char[] c) { for (Character word : c) {
//        if (!word.equals('.')) {
//            System.out.print(word); }
//    }
//        System.out.println();
//    }


}
