import math

# Solution to Project Euler problem 20
result = 0
number = str(math.factorial(100))
for character in number:
    result += int(character)
print(result)
