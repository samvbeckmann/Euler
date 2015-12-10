# Solution to Project Euler problem 10
a = range(2000000)
for number in a[2:]:  # Sieve of Eratosthenes
    counter = pow(number, 2)
    if counter > 2000000:
        break
    while counter < 2000000:
        a[counter] = 0
        counter += number

print(sum(a) - 1)
