def get_lattice_path(x, y):
    global a
    if a[(grid_size + 1) * y + x] is not None:
        return a[(grid_size + 1) * y + x]
    elif x == 0:
        a[(grid_size + 1)*y] = 1
        return 1
    elif y == 0:
        a[x] = 1
        return 1
    else:
        a[(grid_size + 1) * y + x] = get_lattice_path(x - 1, y) + get_lattice_path(x, y - 1)
        return a[(grid_size + 1) * y + x]

# Solution to Project Euler problem 15
grid_size = 20
a = [None] * ((grid_size + 1) ** 2)
print(get_lattice_path(grid_size, grid_size))
