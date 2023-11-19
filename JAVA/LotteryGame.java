import java.util.Scanner;

public class LotteryGame{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter three digits: ");
int playerDigit = scanner.nextInt();
int lottery = (int) (Math.random() * 900) + 100;

int playerFirstDigit = playerDigit / 100;
int playerSecondDigit = (playerDigit / 10) % 10;
int playerThirdDigit = playerDigit % 10;

int lotteryFirstDigit = lottery / 100;
int lotterySecondDigit = (lottery / 10) % 10;
int lotteryThirdDigit = lottery % 10;

System.out.println("Lottery number is " + lottery);

if (playerDigit == lottery){
	System.out.println("You won $10,000");
} 
else if ((playerFirstDigit == lotteryFirstDigit || playerFirstDigit == lotterySecondDigit || playerFirstDigit == lotteryThirdDigit) && (playerSecondDigit == lotteryFirstDigit || playerSecondDigit == lotterySecondDigit || playerSecondDigit == lotteryThirdDigit) && (playerThirdDigit == lotteryFirstDigit || playerThirdDigit == lotterySecondDigit || playerThirdDigit == lotteryThirdDigit)) {
	System.out.println("You won $3000");
}

else if ((playerFirstDigit == lotteryFirstDigit || playerFirstDigit == lotterySecondDigit || playerFirstDigit == lotteryThirdDigit) || (playerSecondDigit == lotteryFirstDigit || playerSecondDigit == lotterySecondDigit || playerSecondDigit == lotteryThirdDigit) || (playerThirdDigit == lotteryFirstDigit || playerThirdDigit == lotterySecondDigit || playerThirdDigit == lotteryThirdDigit)) {
	System.out.println("You won $1000");
}
else{
	System.out.println("No match");
}


}
}