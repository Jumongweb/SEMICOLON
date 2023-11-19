principal = int(input("Enter the principal amount: "))
no_of_years = int(input("Enter number of years: "))
rate = 7 / 100
amount = principal * (1 + rate) ** no_of_years

print(amount)