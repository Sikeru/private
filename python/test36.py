import random
import random as rnd
from math import sin, floor, ceil

randint_num=[]
random_num =[]
for i in range(10):
    randint_num.append(rnd.randint(1,10))
    random_num.append(floor(rnd.random()*10)+1)

print(randint_num)
print(random_num)

for i in range(10):
    print(rnd.randrange(1, 100, 2))

print('-----------------------')

rlist = [1, 2,  3,  4,  5,  6]
print(rnd.choice(rlist))
rnd.shuffle(rlist)
print(rlist)
b=[[1, 2, 3],[4, 5, 6,],[7, 8, 9]]
rnd.shuffle(b)
print(b)