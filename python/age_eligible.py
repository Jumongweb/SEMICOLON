age = int(input("Enter your age: "))

if age > 18:
	print("You are eligible")
elif age == 17:
	print("You are almost there")
else:
	print("You are not eligible")

print(f"Your age \tis {age}")