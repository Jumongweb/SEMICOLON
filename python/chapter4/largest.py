def largest_number(number1, number2, number3):
	largest = 0
	if number1 > number2 and number1 > number3:
		largest = number1
	elif number2 > number1 and number2 > number3:
		largest = number2
	else:
		largest = number3
	return largest

print(largest_number(9, 7, 8))
print(largest_number(7, 8, 9))
print(largest_number(8, 9, 7))
