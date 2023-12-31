employee_name = input("Enter employee's name: ");
hours_worked = double(input("Enter number of hours worked in a week"))
hourly_pay = double(input("Enter hourly pay rate: "))
federal_tax = double(input("Enter federal tax withholding rate: "))
state_tax = double(input("Enter state tax withholding rate: ))

gross_pay = hourly_pay * hours_worked
federal_rate= (federal_tax / 100) * gross_pay
state_rate = (state_tax / 100) * gross
total_deduction = federal_tax + state_tax
net_pay = gross_pay - total_deduction

print("Divine Mercy Payroll statement for the month of December")
print("Employee Name: " + employee_name)
print("Hours worked: " + hours_worked)
print("Pay Rate: $" + hourly_pay)
print("Gross pay: $" + gross_pay)

print("Deductions: ")
print(f"Federal Withholding ({federal_tax}): $" + federal_rate)
print(f"State Withholding ({state_tax}): $" + state_rate)
print("Total Deduction: $" + total_deduction)
print("Net pay: $" + net_pay)
