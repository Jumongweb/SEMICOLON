num1 = int(input("Enter number1: "))
num2 = int(input("Enter number2: "))
num3 = int(input("Enter number3: "))

smallest = num1
largest = num3

if (num2 < smallest):
	smallest = num2
if (num3 < smallest):
	smallest = num3

if (num1 > largest):
	largest = num1
if (num2 > largest):
	largest = num2

if (num1 > smallest and num1 < largest):
	print(smallest)
	print(num1)
	print(largest)

if (num2 > smallest and num2 < largest):
	print(smallest)
	print(num2)
	print(largest)

if (num3 > smallest and num3 < largest):

	print(smallest)
	print(num3)
	print(largest)
