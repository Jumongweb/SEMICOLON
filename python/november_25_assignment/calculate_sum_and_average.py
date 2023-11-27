count = 1
total = 0

number = int(input("Enter number: "))

while number != 0:
	total += number
	count += 1
	average = total / count

print(total)
