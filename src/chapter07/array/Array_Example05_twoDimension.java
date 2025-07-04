package chapter07.array;

import java.util.Scanner;

public class Array_Example05_twoDimension {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("받을 로또 게임의 개수를 입력해주세요: ");
        int num = scan.nextInt();    // 생성할 게임 수
        System.out.println("===========================");

        // 2차원 배열 선언: [게임 수][6개의 번호]
        int[][] lotto = new int[num][6];

        // 각 게임별로 6개의 로또 번호 생성
        for (int i = 0; i < num; i++) {
            int count = 0;
            
            outer: while (count < 6) {
                int random = (int)(Math.random() * 45) + 1;  // 1~45 난수 생성

                // 중복 검사 + 발견 시 바로 다음 루프
                for (int j = 0; j < count; j++) {
                    if (lotto[i][j] == random) {
                    	// exit label , 변수가 있는 곳까지 이동
                        continue outer;
                    }
                }

                // 중복 없으면 저장
                lotto[i][count++] = random;
            }

            // 정렬
            for (int a = 0; a < 6; a++) {
                for (int b = a + 1; b < 6; b++) {
                    if (lotto[i][a] > lotto[i][b]) {
                        int temp = lotto[i][a];
                        lotto[i][a] = lotto[i][b];
                        lotto[i][b] = temp;
                    }
                }
            }
        }

        // 포맷에 맞춰 출력
        for (int i = 0; i < num; i++) {
            System.out.printf(" *[%2d]번 : ", i+1);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%2d ", lotto[i][j]);
            }
            System.out.println();
        }

        scan.close();
    }
}
