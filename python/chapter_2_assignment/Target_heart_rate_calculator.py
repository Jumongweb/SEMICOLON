age = int(input("Enter your age: "))
maximum_heart_rate = 220 - age
target_heart_rate_minimum = maximum_heart_rate * (50/100)
target_heart_rate_maximum = maximum_heart_rate * (85/100)

print(target_heart_rate_minimum)
print(target_heart_rate_maximum)