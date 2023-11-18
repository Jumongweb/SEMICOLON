import java.util.Scanner;

public class SplitDigit{
public static void main(String[] args){

Scanner scanner = new Scasnner(System.in);

int digit = scanner.nextInt();

int firstNum = digit / 10000;
int secondNum = (digit / 1000) % 10;
int thirdNum = (digit / 100) % 10;
int fourthNum = (digit / 10) % 10;
int fifthNum = (digit % 10);

System.out.printf("%d  %d  %d  %d  %d", firstNum, secondNum, thirdNum, fourthNum, fifthNum);

}
}