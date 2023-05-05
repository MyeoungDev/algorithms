package org.algorithms.douzone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_baseball {

    private static final StringBuilder sb = new StringBuilder();

    private static ArrayList<Integer> resultList;
    private static int COUNT = 0;

    private static File RECORD_FILE =
        new File("/Users/gwanii/Documents/알고리즘/algorithms/src/main/resources/baseball.txt");

    private static int MINUTE = 0;
    private static int SECOND = 0;
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        int result = 0;

        while (result < 100) {
            result = (int) (Math.random() * 1000) + 1;
        }
        System.out.println(result);

        resultList = getNumberList(result);

        boolean signal = false;

        while (!signal) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());

            signal = play(input);
        }

        System.out.println("(종료)");

        long endTime = System.currentTimeMillis();
        SECOND = (int) (((endTime - startTime) / 1000) % 60);
        MINUTE = (int) (((endTime - startTime) / 1000) / 60);

        Record newRecord = new Record(result, COUNT, MINUTE, SECOND);
        recordGame(newRecord);

    }

    private static boolean play(int input) {

        int strike = 0;
        int ball = 0;
        int out = 0;

        ArrayList<Integer> numberList = getNumberList(input);

        for (int i = 0; i < numberList.size(); i++) {
            if (resultList.get(i).equals(numberList.get(i))) {
                strike++;
            } else if (resultList.contains(numberList.get(i))) {
                ball++;
            } else {
                out++;
            }
        }

        COUNT++;
        String output = String.format("%d - S:%d, B:%d, O:%d", COUNT, strike, ball, out);
        System.out.println(output);

        if (strike == 3) {
            return true;
        }

        return false;
    }


    private static ArrayList<Integer> getNumberList(int value) {
        ArrayList<Integer> list = new ArrayList<>();
        String stringValue = String.valueOf(value);

        for (int i = 0; i < stringValue.length(); i++) {
            list.add(stringValue.charAt(i) - '0');
        }

        return list;
    }

    private static ArrayList<Record> readRecord() throws IOException {
        FileReader fileReader = new FileReader(RECORD_FILE);

        ArrayList<Record> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(fileReader);
        StringTokenizer st;
        String line;
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line, " /:");
            st.nextToken();
            int recordResult = Integer.parseInt(st.nextToken());
            int recordCount = Integer.parseInt(st.nextToken());
            int recordMinute = Integer.parseInt(st.nextToken());
            int recordSecond = Integer.parseInt(st.nextToken());

            Record record = new Record(recordResult, recordCount, recordMinute, recordSecond);
            list.add(record);
        }

        return list;
    }

    private static void recordGame(Record newRecord) throws IOException {

        ArrayList<Record> records = readRecord();
        records.add(newRecord);

        Collections.sort(records);

        for (int i = 0; i < records.size(); i++) {
            sb.append(i + 1 + records.get(i).toString()).append("\n");
        }

        FileWriter fileWriter = new FileWriter(RECORD_FILE);

        BufferedWriter bw = new BufferedWriter(fileWriter);

        fileWriter.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}

class Record implements Comparable<Record> {
    private int result;
    private int count;
    private int minute;
    private int second;

    public Record(int result, int count, int minute, int second) {
        this.result = result;
        this.count = count;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public int compareTo(Record o) {
        if (this.count - o.count > 0) {
            return 1;
        } else if (this.count == o.count) {
            if (this.minute - o.minute > 0) {
                return 1;
            } else if (this.minute == o.minute) {
                if (this.second - o.second > 0) {
                    return 1;
                } else if (this.second == o.second) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    public int getCount() {
        return count;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return
            " : " + result +
            "/" + count +
            " : " + minute +
            " " + second;
    }
}
