def test(a, b=10, c=100):
    print('a : ', a)
    print('b : ', b)
    print('c : ', c)
    return a+b+c

print(test(1))
test(3, 30)
test(5,50,500)

print('abc', end='')
print('def')
list_a = ['abc', 'def', 'ghi']
for i in list_a:
    print(i, 'A', sep='-',end=' ')

