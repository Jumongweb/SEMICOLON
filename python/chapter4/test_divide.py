from division import divide_number

def test_divide_number():
	assert divide_number(36, 6) == 6
	assert divide_number(-36, -6) == 6
	assert divide_number(6, 3) == 2
	assert divide_number(-25, -5) == 5