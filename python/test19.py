# *은 가변매개변수
def print_n_times(*valus, n=2):
    for i in range(0, n):
        for v in valus:
            print(v)

print_n_times('abc', 'def', 'kkk')
print_n_times('abc')