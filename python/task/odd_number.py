odd_number = 0
#for number in range(1000,5000):
#	if number % 2 != 0:
#		odd_number += number
# print("The total number of odd_number is", odd_number)
count = 1000
while count < 5000:
	if count % 2 != 0:
		odd_number += count
	count+=1
print(odd_number)