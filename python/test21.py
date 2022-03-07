def f(x):
    return 2*x+1

def g(x):
    return x**2+2*x+1

def mul(*values):
    pro=1
    for i in values:
        pro*=i
    return pro


print(f(10))
print(g(10))
print(mul(5,7,9,10))