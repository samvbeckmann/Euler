import re

# Solution to Project Euler problem 22
total = 0
with open('p022_names.txt', 'r') as file_names:
    name_list = re.split(',', file_names.readline())
    name_list.sort()
    for x in range(len(name_list)):
        temp_total = sum([ord(char) - 64 for char in name_list[x].replace('"', '')])
        total += (x + 1) * temp_total

print(total)