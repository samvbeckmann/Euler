# Solution to Project Euler problem 68


def is_magic_5gon(seq):
    seq.append(seq[5])
    values = set()
    for x in range(5):
        values.add(seq[x] + seq[x + 5] + seq[x + 6])
    if len(values) == 1:
        return get_string_value(seq, seq.index(min(seq[:5])))
    else:
        return -1


def get_string_value(seq, min_index):
    result = ''
    for x in range(5):
        y = (x + min_index) % 5
        result += str(seq[y]) + str(seq[y + 5]) + str(seq[y + 6])
    return int(result)


def test_permutations(seq, step=1):  # First element can't change, so step starts at 1.
    global total
    if step == len(seq):
        total = max(total, is_magic_5gon(seq))
    else:
        for i in range(step, len(seq)):
            seq_copy = seq[:]
            seq_copy[step], seq_copy[i] = seq_copy[i], seq_copy[step]
            test_permutations(seq_copy, step + 1)


total = 0
test_permutations([10, 1, 2, 3, 4, 5, 6, 7, 8, 9])
print(total)
