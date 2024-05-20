package org.algorithms.baekjoon.silver.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_1260 {


    // 간선 노드 연결 리스트
    static List<List<Integer>> adjList;

    // 방분 표기 배열
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());    // 정점 개수
        int M = Integer.parseInt(st.nextToken());    // 간선 개수
        int V = Integer.parseInt(st.nextToken());    // 시작 정점

        // 그래프 초기화
        adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            // 양방향 간선 추가
            adjList.get(from).add(to);
            adjList.get(to).add(from);
        }

        // 정점 번호가 작은 순서대로 각 정점이 방문되었는지를 저장하기 위한 배열
        visited = new boolean[N + 1];

        StringBuilder dfsResult = new StringBuilder();
        dfs(V, dfsResult);
        System.out.println(dfsResult.toString().trim());

        visited = new boolean[N + 1]; // BFS를 위해 visited 배열 초기화
        StringBuilder bfsResult = new StringBuilder();
        bfs(V, bfsResult);
        System.out.println(bfsResult.toString().trim());

    }

    static void dfs(int visit, StringBuilder sb) {
        // 방문된 정점 true로 변경
        visited[visit] = true;
        sb.append(visit).append(" ");

        // 낮은 번호의 정점부터 방문하기 위해 정점 리스트
        Collections.sort(adjList.get(visit));

        for (int u : adjList.get(visit)) {
            if (!visited[u]) {
                dfs(u, sb);
            }
        }
    }

    static void bfs(int start, StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            Integer v = queue.poll();
            sb.append(v).append(" ");

            // 낮은 번호의 정점부터 방문하기 위해 정점 리스트
            Collections.sort(adjList.get(v));

            for (int u : adjList.get(v)) {
                if (!visited[u]) {
                    visited[u] = true;
                    queue.add(u);
                }
            }
        }

    }
}
