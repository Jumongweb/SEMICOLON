for number in range(1,13):
	for numbers in range(1,13):
		multiple = number * numbers
	#	print(number, "*", numbers, "=", multiple)
		print(f"{numbers} x {number} = {multiple}", end="\t")
	print()