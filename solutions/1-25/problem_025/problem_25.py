# Solution to Project Euler problem 15
first = 1
second = 1
index = 2
while len(str(second)) < 1000:
    total = first + second
    first = second
    second = total
    index += 1
print(index)
