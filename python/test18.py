#매개변수와 반환값이 없는경우
def print_3_times():
    print("안녕하세요")
    print("안녕하세요")
    print("안녕하세요")

#매개변수는 있지만 반환값이 없는경우
def print_n_times(n, value):
    for i in range(0, n):
        print(value)

print_3_times()
print_n_times(5, '안녕!!')
