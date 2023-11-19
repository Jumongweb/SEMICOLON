digit = int(input("Enter five digits: "))

digitOne = (digit // 10000)
digitTwo = (digit // 1000) % 10
digitThree = (digit // 100) % 10
digitFour = (digit // 10) % 10
digitFive = digit % 10

print(f"{digitOne}   {digitTwo}   {digitThree}   {digitFour}   {digitFive}")