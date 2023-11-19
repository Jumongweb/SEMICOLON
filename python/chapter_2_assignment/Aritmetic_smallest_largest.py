firstInteger = int(input("Enter first integer: "))
secondInteger = int(input("Enter second integer: "))
thirdInteger = int(input("Enter third integer: "))

sum = firstInteger + secondInteger + thirdInteger
average = sum // 3
product = firstInteger * secondInteger * thirdInteger

smallest = firstInteger
largest = thirdInteger

if secondInteger < smallest:
	smallest = secondInteger
elif thirdInteger < smallest:
	smallest = thirdInteger
if firstInteger > largest:
	largest = firstInteger
elif secondInteger > largest:
	largest = secondInteger

print(f"The sum of {firstInteger}, {secondInteger} and {thirdInteger} is {sum}")
print(f"The average of {firstInteger}, {secondInteger} and {thirdInteger} is {average}")
print(f"The product of {firstInteger}, {secondInteger} and {thirdInteger} is {product}")
print(f"The smallest out of {firstInteger}, {secondInteger} and {thirdInteger} is {smallest}")
print(f"The largest out of {firstInteger}, {secondInteger} and {thirdInteger} is {largest}")




