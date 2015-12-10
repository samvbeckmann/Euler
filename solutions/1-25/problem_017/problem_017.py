from num2words import num2words
import re

# Solution to Project Euler problem 17
# Note: This is cheaty, using the num2words package.
total = 0
for x in range(1000):
    total += len(re.sub('[ \-]', '', num2words(x+1)))

print(total)
