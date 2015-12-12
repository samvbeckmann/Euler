# Solution to Project Euler problem 28
x = 1
total = 1
for n in range(1, 501):
    for y in range(4):
        x += 2*n
        total += x

print(total)
