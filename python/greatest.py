first = int(input("Enter the first number: "))
second = int(input("Enter the second number: "))
third = int(input("Enter the third number: "))

if first > second and first > third:
	print(f"This highest number is {first}")
if second > first and second > third:
	print(f"This highest number is {second}")
if third > second and third > first:
	print(f"This highest number is {third}")


print(first, "Testing")