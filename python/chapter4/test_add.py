import add

def test_add_positive():
	assert add.add_numbers(4,4) == 8
def test_add_negative():
	assert add.add_numbers(-3,-2) == -5