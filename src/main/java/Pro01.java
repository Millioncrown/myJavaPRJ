import java.util.Scanner;
public class Pro01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("숫자를 입력하세요");
        num = s.nextInt();

        if (num%15 == 0) {
            System.out.print("3과 5의 배수 입니다");
        }
        else if (num % 5 == 0) {
            System.out.print("5의 배수 입니다");
        }
        else if (num % 3 == 0){
            System.out.print("3의 배수 입니다");
        }
        s.close();
    }
}