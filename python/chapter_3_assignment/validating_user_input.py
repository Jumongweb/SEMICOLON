counter = 0
failure = 0
total = 0
number = int(input("Enter 1 or 2: "))
while number != -1:
	if number >= 1 and number <= 2:	
		number = int(input("Enter 1 or 2: "))
		total += number
		
	else:
		number = int(input("Enter 1 or 2: "))
		failure += 1
	counter += 1		
print("Total numbers are: ", total)
print("Failures are: ", failure)
print(counter)

	
