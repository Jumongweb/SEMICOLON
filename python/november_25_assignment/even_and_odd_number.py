even_numbers = 0
odd_numbers = 0
for number in range(1,101):
	print(number)
	if (number % 2 == 0):
		even_numbers += 1
	else:
		odd_numbers += 1

print("Even numbers: ", even_numbers)
print("Odd numbers: ", odd_numbers)
