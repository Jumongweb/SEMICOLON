num = int(input("Enter a number and get the square: "));
def square_number(num):
	"""
	My firt documentation on python
	"""
	name = "Jumong"
	return f"{name} {num * num}"

value = square_number(num)
print(value)

def greet(name):
	print("Hello world " + name);

greet("This is python programming");

print(help(square_number))