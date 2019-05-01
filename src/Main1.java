import java.util.Scanner;

public class Main1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int A,B,C;
        int[] temp = new int[t];
        for(int i = 0;i < t; i++) {
            int result = 0;
            A = in.nextInt();
            B = in.nextInt();
            C = in.nextInt();
            for (int j = 1; j < 100; j++) {
                if ((B * j + C) % A == 0) {
                    result = (B * j + C) / A;
                    break;
                }
            }

            if (result == 0 || result < 0)
                temp[i] = 0;
            else if (result > 0)
                temp[i] = 1;
        }

        for (int k = 0; k < t; k++)
        {
            if (temp[k] == 0)
                System.out.println("NO");
            else if(temp[k] == 1)
                System.out.println("YES");
        }
    }
}
