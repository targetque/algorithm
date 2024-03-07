package programmers;

import java.util.Queue;

public class KaKaoBlind2018_1 {

    private static int cacheHit = 1;
    private static int cacheMiss = 5;

    public static int solution(int cacheSize, String[] cities) {
        Queue<String> queueList = null;

        int answer = 0;

        for(String city : cities) {
            if(queueList.isEmpty()) {
                answer += cacheMiss;
            } else {
                //큐가 비지 않았다면 큐 확인해봄
                queueList.peek()
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] cities1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(KaKaoBlind2018_1.solution(3, cities1));

    }

}
