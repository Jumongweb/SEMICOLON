price = int(input("Enter the price of the car: "))

if (price < 1000000):
	tax = price * (10/100)
	print("Your road tax is ",tax)

elif (price >= 1000000 and price < 3000000):
	tax = price * (15/100)
	print("Your road tax is ",tax)
elif (price >= 3000000 and price < 5000000):
	tax = price * (20/100)
	print("Your road tax is ",tax)
elif (price > 5000000):
	tax = price * (20/100)
	print("Your road tax is ", tax)
	

