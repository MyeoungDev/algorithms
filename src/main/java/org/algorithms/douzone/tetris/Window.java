package org.algorithms.douzone.tetris;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Window extends Frame {
    private static final long serialVersionUID = -1324363758675184283L;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private int numOfPlayers;
    Window () throws IOException {
        System.out.println("Enter number of players: ");
        numOfPlayers = Integer.parseInt(br.readLine());
        setTitle("Tetris");
        setSize(400*numOfPlayers, 600);
        setLocation(100, 100);
        setResizable(false);
        add(new TetrisPanel(numOfPlayers));
        setVisible(true);
    }
    private String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    private int readInt() throws IOException {
        return Integer.parseInt(next());
    }
}
