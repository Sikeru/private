import turtle as t

def straight(a, l):
    t.setheading(a)
    t.forward(l)

while True:
    angle=int(input('각도를 입력해주세요'))
    t.setheading(angle)
    length=int(input('길이를 입력해주세요'))
    t.forward(length)
t.exitonclick()