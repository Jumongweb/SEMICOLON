import java.util.Scanner;
public class TwelveDaysOfChristmas{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter christmas day from 1 - 12: ");
int daysOfChristmas = scanner.nextInt();
switch (daysOfChristmas){
case 1:
	System.out.println("On the first day of Christmas My true love sent to me");
	break;
case 2:
	System.out.println("On the second day of Christmas My true love sent to me");
	break;
case 3:
	System.out.println("On the third day of Christmas My true love sent to me");
	break;
case 4:
	System.out.println("On the fourth day of Christmas My true love sent to me");
	break;
case 5:
	System.out.println("On the fifth day of Christmas My true love sent to me");
	break;
case 6:
	System.out.println("On the sixth day of Christmas My true love sent to me");
	break;
case 7:
	System.out.println("On the seventh day of Christmas My true love sent to me");
	break;
case 8:
	System.out.println("On the eighth day of Christmas My true love sent to me");
	break;
case 9:
	System.out.println("On the ninth day of Christmas My true love sent to me");
	break;
case 10:
	System.out.println("On the tenth day of Christmas My true love sent to me");
	break;
case 11:
	System.out.println("On the eleventh day of Christmas My true love sent to me");
	break;
case 12:
	System.out.println("On the twelveth day of Christmas My true love sent to me");
	break;
}

System.out.print("Enter number again to view the gift: ");
int giftOfChristmas = scanner.nextInt();
while (daysOfChristmas != giftOfChristmas){
System.out.print("Enter number again to view the gift: ");
giftOfChristmas = scanner.nextInt();

if (daysOfChristmas == giftOfChristmas){
switch (giftOfChristmas){
case 1:
	System.out.println("A partridge in a pear tree.");
	break;
case 2:
	System.out.println("Two turtle doves And a partridge in a pear tree.");
	break;
case 3:
	System.out.println("Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
case 4:
	System.out.println("Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
case 5:
	System.out.println("Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
case 6:
	System.out.println("Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
case 7:
	System.out.println("Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree");
	break;
case 8:
	System.out.println("Eight maids a-milking, Seven swans a-simming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
case 9:
	System.out.println("Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
case 10:
	System.out.println("Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
case 11:
	System.out.println("My true love gave to me Eleven pipers piping Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
case 12:
	System.out.println("Twelve drummers drumming, Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, Seven swans a-swimming, Six geese a-laying, Five golden rings, Four calling birds, Three French hens, Two turtle doves And a partridge in a pear tree.");
	break;
}

} 
}

}
}