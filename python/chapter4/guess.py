from random import randint
count = 1
computerMove = randint(1,10)
guess = int(input("Enter a number between 1 - 10: "));

if guess == computerMove:
	print(f"Your move: {guess} and computerMove: {computerMove}, You win");

while guess != computerMove and count != 3:
	if guess == computerMove:
		print(f"Your move: {guess} computerMove: {computerMove}, You win");
	else:
		print(f"Your move is {guess} and computerMove is {computerMove}, You lose");
		guess = int(input("Try again, Enter a number between 1 - 10: "));
	count += 1
	if count == 3 and guess != computerMove:
		print(f"Your move is {guess} and computerMove is {computerMove}")
		print("Game over")
		print("You lost")
	else:
		print(f"Your move: {guess} computerMove: {computerMove}, You win");

	