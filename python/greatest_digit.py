number1 = int(input("Enter three digit: "))
number2 = int(input("Enter three digit: "))
number3 = int(input("Enter three digit: "))


if number1 > number2:
	if number1 > number3:
		print(f"{number1} is the greatest")
if number2 > number1:
	if number2 > number3:
		print(f"{number2} is the greatest")
if number3 > number1:
	if number3 > number2:
		print(f"{number3} is the greatest")