import math


def subtract_max_factorial(x, n):
    factorial = (math.factorial(n))
    counter = 0
    while x - (counter * factorial) >= 0:
        counter += 1
    return counter - 1


def get_permutation(x, n, remaining_values):
    if len(remaining_values) == 1:
        return str(remaining_values[0])
    y = subtract_max_factorial(x, n)
    return str(remaining_values[y]) + get_permutation(x - (y * math.factorial(n)),
                                                      n - 1,
                                                      remaining_values[:y] + remaining_values[(y + 1):])


print(get_permutation(1000000 - 1, 9, range(10)))
