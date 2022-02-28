def factorial(f):
    p=1
    for i in range(1, f+1):
       p*=i
    return p
i=0
a=0
b=0
while True:
    a+=(((-1)**i*factorial(6*i)+(545140134*i+13591409))/(factorial(3*i)*factorial(i)**3*640320**(3*i+(3/2))))
    b=1/(a*12)
    print(a, b, i)
    i+=1
    ch=input("멈추려면 0입력")
    if ch=='0':
        break
