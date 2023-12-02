menu = int(input("1. Phonebook\n 2. Message\n 3. Chat\n 4. Call Register\n 5. Tones\n 6. Settings\n 7. Call Divert\n 8. Games\n 9. Calculator\n 10. Reminder\n 11. Clock\n 12. Profile\n 13. SIM Services\n Reply: "))

if menu == 1:
	print("1. Phonebook")
	print("   1. Search")
	print("   2. Service Nos")
	print("   3. Add Name")
	print("   4. Erase")
	print("   5. Edit")
	print("   6. Assign tone")
	print("   7. Send B' Card")
	print("   8. Options")
	print("   9. Speed Dials")
	print("   10. Voice Tags")
	phonebook = int(input("Reply: "))
	
	if phonebook == 1:
		print("  Search")
	elif phonebook == 8:
		print("1. Type of view")
		print("2. Memory status")

elif menu == 2:
	print("2. Message")
	print("   1. Write message")
	print("   2. Inbox")
	print("   3. Outbox")
	print("   4. Picture messages")
	print("   5. Templates")
	print("   6. Smileys")
	print("   7. Message settings")
	print("   8. Inbox")
	print("   9. Outbox")
	print("   10. Picture messages")
	message = int(input("Reply: "))
		
	if message == 1:
		print("Currently not available")
	elif message == 7:
		print("7. Message settings")
		print("   1. Set 1")
		print("   2. Common")
		messageSettings = int(input("Reply: "))
		if messageSettings == 1:
			print("1. Set 1")
			print("   1. Message centre number")
			print("   2. Message sent as")
			print("   3. Message validity")
		elif messageSettings == 2:
			print("2. Common")
			print("   1. Delivery reports")
			print("   2. Reply via same centre")
			print("   3. Character support")
					
elif menu == 3:
	print("3. Chat")
	print("\t----------")

elif menu == 4:
	print("4. Call register")
	print("  1. Missed calls")
	print("  2. Received calls")
	print("  3. Dialled numbers")
	print("  4. Erase recent call lists")
	print("  5. Show call duration")
	print("  6. Show call costs")
	print("  7. Call cost settings")
	print("  8. Prepaid credit")
	callRegister = int(input("Reply: "))

	if callRegister == 1:
		print("1. Missed calls")
		println("   Currently unavailable")
	elif callRegister == 5:
		print("5. Show call duration")
		print("   1. Last call duration")
		print("   2. All calls' cost")
		print("   3. Received calls' duration")
		print("   4. Dialled calls' duration")
		print("   5. Clear timers")
		
	elif callRegister == 6:
		print("6. Show call costs")
		print("   1. Last call cost")
		print("   2. All calls' cost")
		print("   3. Clear counters")

	elif callRegister == 7:
		print("7. Call cost settings")
		print("   1. Call cost limit")
		print("   2. Show costs in")

elif menu == 5:
	print("5. Tones")
	print("   1. Ringing tone")
	print("   2. Ringing volume")
	print("   3. Incoming call alert")
	print("   4. Composer")
	print("   5. Message alert tone")
	print("   6. Keypad tones")
	print("   7. Warning and game tones")
	print("   8. Vibrating alert")
	print("   9. Screen saver")

elif menu == 6:
	print("6. Settings")
	print("   1. Call settings")
	print("   2. Phone setting")
	print("   3. Security settings")
	print("   4. Restore factory settings")
	settings = int(input("Reply: "))

	if settings == 1:
		print("1. Call settings")
		print("   1. Automatic redial")
		print("   2. Speed dialling")
		print("   3. Call waiting options")
		print("   4. Own number sending")
		print("   5. Phone line in use")
		print("   6. Automatic answer")
	elif settings == 2:
		print("2. Phone setting")
		print("   1. Language")
		print("   2. Cell info display")
		print("   3. Welcome note")
		print("   4. Network selection")
		print("   5. Lights")
		print("   6. Confirm SIM service actions")
	elif settings == 3:
		print("3. Security settings")
		print("   1. PIN code request")	
		print("   2. Call barring service")
		print("   3. Fixed dialling")
		print("   4. Closed user group")
		print("   5. Phone security")
		print("   6. Change access codes") 

elif menu == 7:
	print("7. Call divert")
	print("\tCurrently not available\n")

elif menu == 8:
	print("8. Games")
	print("\tCurrently not available\n")

elif menu == 9:
	print("9. Calculator")
	print("\tCurrently not available\n")

elif menu == 10:
	print("10. Reminders")
	print("\tCurrently not available\n")

elif menu == 11:
	print("11. Clock")
	print("   1. Alarm clock")
	print("   2. Clock setting")
	print("   3. Date setting")
	print("   4. Stopwatch")
	print("   5. Countdown timer")
	print("   6. Auto update of date and time")

elif menu == 12:
	print("12. Profiles\n")
	print("\tCurrently not available")

elif menu == 13:
	print("13. SIM services\n");
	print("\tCurrently not available")
