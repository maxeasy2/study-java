package net.mirapps.study.algorithm.basic;

import java.util.ArrayList;

public class Sosu {
    // 예제와 같이 120까지의 소수를 구하기 위해 120 선언.
    static boolean prime[] = new boolean[4000001];
    static ArrayList<Integer> prime_numbers = new ArrayList<>();
    /*public static void main(String[] args) throws Exception{

        // 구하고자 하는 숫자 범위
        int N = 4000000;

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for(int i=2; i*i<=N; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j=i*i; j<=N; j+=i) prime[j]=true;
            }
        }

        // 소수 출력
        for(int i=1; i<=N;i++){
            if(!prime[i]) prime_numbers.add(i);
        }

        // 4000000까지 소수 개수
        System.out.println(prime_numbers.size());
        // 소수 확인
        for(int i=1; i<=10; i++) {
            System.out.println(prime_numbers.get(i));
        }

    }*/

    public static void sosu2() {
        boolean[] check = new boolean[600];

        // 소수의 배수를 모두 체크
        for(int i=2; i<=10; i++) {
            if(!check[i]) {
                for(int j=i+i; j<check.length; j=j+i) {
                    //System.out.println("i :: "+i+ " j :: "+j);
                    check[j] = true;
                }
            }
        }

        // 소수출력
        for(int i=1; i<=check.length-1; i++) {
            if(i == 1) continue;

            if(!check[i]) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        sosu2();
    }
}
