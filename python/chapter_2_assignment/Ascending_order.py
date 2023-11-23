first_float = float(input("Enter the first float: "))
second_float = float(input("Enter the first float: "))
third_float = float(input("Enter the first float: "))

smallest = first_float
largest = third_float

if second_float < smallest:
	second_float = smallest
elif third_float < smallest:
	third_float = smallest

if first_float > largest:
	first_float = largest
elif second_float > largest:
	second_float = largest

if (first_float > smallest and first_float < largest):
	print(first_float)
	print(second_float)
	print(third_float)

if (second_float > smallest and second_float < largest):
	print(first_float)
	print(second_float)
	print(third_float)

if (third_float > smallest and third_float < largest):
	print(first_float)
	print(second_float)
	print(third_float)
