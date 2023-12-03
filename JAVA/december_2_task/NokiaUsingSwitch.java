import java.util.Scanner;
public class NokiaUsingSwitch{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("1. Phonebook"); 
System.out.println("2. Message");
System.out.println("3. Chat"); 
System.out.println("4. Call Register");
System.out.println("5. Tone"); 
System.out.println("6. Settings");
System.out.println("7. Call Divert"); 
System.out.println("8. Games");
System.out.println("9. Calculator"); 
System.out.println("10. Reminder");
System.out.println("11. Clock"); 
System.out.println("12. Profile");
System.out.println("13. SIM Services");
System.out.print("Reply: ");
int menu = scanner.nextInt();

switch (menu){
	case 1:
		System.out.println("1. Phonebook"); 
		System.out.println("   1. Search");
		System.out.println("   2. Service Nos");
		System.out.println("   3. Add Name");
		System.out.println("   4. Erase");
		System.out.println("   5. Edit");
		System.out.println("   6. Assign tone");
		System.out.println("   7. Send B' Card");
		System.out.println("   8. Options");
		System.out.println("   9. Speed Dials");
		System.out.println("   10. Voice Tags");
		System.out.print("Reply: ");
		int phonebook = scanner.nextInt();
		switch (phonebook){
			case 1:
				System.out.println("1. Search");
				System.out.println("  Search");
				break;
			case 8:
				System.out.println("8. Option");
				System.out.println("   1. Type of view");
				System.out.println("   2. Memory status");
				break;

		}
		break;
	case 2:
		System.out.println("2. Message");
		System.out.println("   1. Write message");
		System.out.println("   2. Inbox");
		System.out.println("   3. Outbox");
		System.out.println("   4. Picture messages");
		System.out.println("   5. Templates");
		System.out.println("   6. Smileys");
		System.out.println("   7. Message settings");
		System.out.println("   8. Inbox");
		System.out.println("   9. Outbox");
		System.out.println("   10. Picture messages");
		System.out.print("Reply: ");
		int message = scanner.nextInt();
		switch (message){
		case 1:
			System.out.println("Current not available");
			break;
		case 7:
			System.out.println("7. Message settings");
			System.out.println("   1. Set 1");
			System.out.println("   2. Common");
			System.out.print("Reply: ");
			int messageSettings = scanner.nextInt();
			switch (messageSettings){
			case 1:
				System.out.println("1. Set 1");
				System.out.println("   1. Message centre number");
				System.out.println("   2. Message sent as");
				System.out.println("   3. Message validity");	
			break;
			}
			case 2:
				System.out.println("2. Common");
				System.out.println("   1. Delivery reports");
				System.out.println("   2. Reply via same centre");
				System.out.println("   3. Character support");
			break;
		}	

		break;
	case 3:
		System.out.println("3. Chat");
		System.out.print("\t----------");
		break;
	case 4:
		System.out.println("4. Call register");
		System.out.println("   1. Missed calls");
		System.out.println("   2. Received calls");
		System.out.println("   3. Dialled numbers");
		System.out.println("   4. Erase recent call lists");
		System.out.println("   5. Show call duration");
		System.out.println("   6. Show call costs");
		System.out.println("   7. Call cost settings");
		System.out.println("   8. Prepaid credit");
		System.out.print("Reply: ");
		int callRegister = scanner.nextInt();
		switch (callRegister){
		case 1:
			System.out.println("1. Missed calls");
			System.out.println("   Currently unavailable");
			break;
		case 5:
			System.out.println("5. Show call duration");
			System.out.println("   1. Last call duration");
			System.out.println("   2. All calls' cost");
			System.out.println("   3. Received calls' duration");
			System.out.println("   4. Dialled calls' duration");
			System.out.println("   5. Clear timers");
			break;
		case 6:
			System.out.println("6. Show call costs");
			System.out.println("   1. Last call cost");
			System.out.println("   2. All calls' cost");
			System.out.println("   3. Clear counters");
			break;
		case 7:
			System.out.println("7. Call cost settings");
			System.out.println("   1. Call cost limit");
			System.out.println("   2. Show costs in");
			break;
		}
		break;
	case 5:
		System.out.println("5. Tones");
		System.out.println("   1. Ringing tone");
		System.out.println("   2. Ringing volume");
		System.out.println("   3. Incoming call alert");
		System.out.println("   4. Composer");
		System.out.println("   5. Message alert tone");
		System.out.println("   6. Keypad tones");
		System.ou2t.println("   7. Warning and game tones");
		System.out.println("   8. Vibrating alert");
		System.out.println("   9. Screen saver");
		break;
	case 6:
		System.out.println("6. Settings");
		System.out.println("   1. Call settings");
		System.out.println("   2. Phone setting");
		System.out.println("   3. Security settings");
		System.out.println("   4. Restore factory settings");
		System.out.print("Reply: ");
		int settings = scanner.nextInt();
		switch (settings) {
		case 1: 
			System.out.println("1. Call settings");
			System.out.println("   1. Automatic redial");
			System.out.println("   2. Speed dialling");
			System.out.println("   3. Call waiting options");
			System.out.println("   4. Own number sending");
			System.out.println("   5. Phone line in use");
			System.out.println("   6. Automatic answer");
			break;
		case 2:
			System.out.println("2. Phone setting");
			System.out.println("   1. Language");
			System.out.println("   2. Cell info display");
			System.out.println("   3. Welcome note");
			System.out.println("   4. Network selection");
			System.out.println("   5. Lights");
			System.out.println("   6. Confirm SIM service actions");
			break;
		case 3:
			System.out.println("3. Security settings");
			System.out.println("   1. PIN code request");	
			System.out.println("   2. Call barring service");
			System.out.println("   3. Fixed dialling");
			System.out.println("   4. Closed user group");
			System.out.println("   5. Phone security");
			System.out.println("   6. Change access codes");
			break;
		}

		break;
	case 7:
		System.out.println("7. Call divert");
		System.out.print("\tCurrently not available\n");
		break;
	case 8:
		System.out.println("8. Games");
		System.out.print("\tCurrently not available\n");
		break;
	case 9:
		System.out.println("9. Calculator");
		System.out.print("\tCurrently not available\n");
		break;
	case 10:
		System.out.println("10. Reminders");
		System.out.print("\tCurrently not available\n");
		break;
	case 11:
		System.out.println("11. Clock");
		System.out.println("   1. Alarm clock");
		System.out.println("   2. Clock setting");
		System.out.println("   3. Date setting");
		System.out.println("   4. Stopwatch");
		System.out.println("   5. Countdown timer");
		System.out.println("   6. Auto update of date and time");
		break;
	case 12:
		System.out.print("12. Profiles\n");
		System.out.print("\tCurrently not available");
		break;
	case 13:
		System.out.print("13. SIM services\n");
		System.out.print("\tCurrently not available");
		break;
}


}
}