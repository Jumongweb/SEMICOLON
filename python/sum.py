num1 = int(input("Enter num1: "))
num2 = int(input("Enter num2: "))
sum = num1 + num2
print("The sum of num1 and num2 is ${sum}")
print(sum)

if (sum > 20):
	print("Sum is greater than 20")
elif(sum < 20):
	print("Sum is less than 20")
else:
	print("sum == 20")