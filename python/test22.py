import random as rnd
bingo = []

for i in range(5):
    temp = []
    for j in range(5):
       temp.append((i*5) + j + 1)
    bingo.append(temp)

# for i in range(5):
#     for j in range(5):
#         print("{:3d}".format(bingo[i][j]), end=' ')
#     print()

for t in range(100):
    temp = bingo[0][0]
    x = rnd.randint(0,4)
    y = rnd.randint(0,4)

    bingo[0][0]=bingo[x][y]
    bingo[x][y]=temp

for i in range(5):
    for j in range(5):
        print("{:3d}".format(bingo[i][j]), end=' ')
    print()

result = ''
while result != 'Bing Go':
    number = int(input('숫자 입력 : '))
    for i in range(5):
        for j in range(5):
            if bingo[i][j] == number:
                bingo[i][j] = 0

    for i in range(5):
        for j in range(5):
            print("{:3d}".format(bingo[i][j]), end=' ')
        print()

    #빙고 체크
    for i in range(5):
        sum = 0
        for j in  range(5):
            sum+=bingo[i][j]
        if sum==0:
            result = 'Bing Go'

    for i in range(5):
        sum = 0
        for j in  range(5):
            sum+=bingo[j][i]
        if sum==0:
            result = 'Bing Go'

    for i in range(5):
        sum = 0
        for j in  range(5):
            sum+=bingo[j][i]
        if sum==0:
            result = 'Bing Go'

    sum = 0
    for i in range(5):
        sum+=bingo[i][i]
    if sum==0:
        result = 'Bing Go'
    sum = 0
    for i in range(5):
        sum+=bingo[i][4-i]
    if sum==0:
        result = 'Bing Go'
print(result)