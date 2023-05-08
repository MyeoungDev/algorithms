package org.algorithms.douzone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_baseball_hofe {
        public static void main(String[] args) throws IOException {
            char[] random = random().toCharArray();
            String result = "";
            List<String> fileInfo = getFileInfo();
            long start = System.currentTimeMillis();
            int count = 0;

            while (true) {
                count++;
                int strike = 0;
                int ball = 0;
                int out = 0;

                Scanner scanner = new Scanner(System.in);
                String value = scanner.next();
                for (int i = 0; i < value.length(); i++) {
                    char[] ballValue = value.toCharArray();
                    if (ballValue[i] == random[i]) {
                        strike++;
                    } else if (new String(random).indexOf(ballValue[i]) != -1) {
                        ball++;
                    } else out++;
                }
                System.out.println("S : " + strike + " B :" + ball + " O : " + out);
                if (strike == 3) {
                    long end = System.currentTimeMillis();
                    result = new String(random) + "/" + count + " : " + ((end - start) / 1000);
                    fileInfo.add(result);
                    System.out.println("종료");
                    break;
                }
                Collections.sort(fileInfo, new StringComparator());
            }
        }

        private static List<String> getFileInfo() throws IOException {
            String filePath = "src/main/resources/gameRecord";
            File file = new File(filePath);
            List<String> strings = new ArrayList<>();

            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String value = scanner.nextLine();
                String substring = value.substring(value.indexOf(":") + 1);
                strings.add(substring);
            }
            return strings;
        }

        private static String random() {
            Random r = new Random();
            String randValue = "";
            for (int i = 0; i < 3; i++) {
                int value = r.nextInt(10);
                randValue += value;
            }
            System.out.println("random : " + randValue);
            return randValue;
        }


    }

    class StringComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String[] o1Split = o1.split("/");
            String[] o2Split = o2.split("/");
            int o1SplitValue = Integer.parseInt(o1Split[1]);
            int o2SplitVlaue = Integer.parseInt(o2Split[1]);
            if (o1SplitValue > o2SplitVlaue) {
                return 1;
            } else if (o1SplitValue < o2SplitVlaue) {
                return -1;
            } else {

                int o1Value = Integer.parseInt(o1.substring(o1.indexOf(":" + 1)));
                int o2Value = Integer.parseInt(o2.substring(o2.indexOf(":" + 1)));

                return Integer.compare(o1Value, o2Value);
            }
    }
}
