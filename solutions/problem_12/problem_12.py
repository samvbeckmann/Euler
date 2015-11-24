# Factor code. Obtained via Stack Overflow
def get_num_factors(number):
    return len(set(reduce(list.__add__,
                          ([i, number/i] for i in range(1, int(number**0.5) + 1) if number % i == 0))))

# Solution to Project Euler problem 12
triangle_number = 0
next_number = 1

while 1:
    triangle_number += next_number
    next_number += 1
    x = get_num_factors(triangle_number)
    if x >= 500:
        print(triangle_number)
        break
