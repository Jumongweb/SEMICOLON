passed = 0
fail = 0
count = 1
checker = 0

score = eval(input(f"Enter score of Student 1 or -1 to end loop: "))

if score != -1:
	while score != -1:
		count += 1
		if score >= 45 and score <= 100:
			passed += 1
		elif score > 100:
			print("Enter a valid score")
			count -= 1
			checker += 1
			if checker == 3:
				print("Try again later")
				break
		elif score < -1:
			print("Enter a valid score");
			count -= 1
		elif score < 45 and score > 0:
			fail += 1
		score = eval(input(f"Enter score of student{count} or -1 to end the loop "))
	
	print(score)
	print(f"Student that pass are {passed}")
	print(f"Student that fail are {fail}")

else:
	print("No score was entered")

