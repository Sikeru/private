import random as rnd

hangus = '가나다라마바사아자차카타파하'
with open('info.txt', 'w') as file:
    for i in range(1000):
        name=rnd.choice(hangus) + rnd.choice(hangus)
        weight = rnd.randrange(40, 100)
        height = rnd.randrange(140, 200)
        file.write("{}, {}, {}\n".format(name, weight, height))