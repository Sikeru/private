import turtle as t

def straight(a, l):
    t.setheading(a)
    t.forward(l)

angle = 0
length = 1
increase = 1

r=255
g=1
b=1

t.colormode(255)
for i in range(1, 1000):
    if g > 255:
        g = 255

    if b > 255:
        b = 255

    if r > 255:
        r=255

    if r<1:
        r=1
    if g<1:
        g=1
    if b<1:
        b=1

    if angle > 270:
        angle = 0

    straight(angle, length)

    if angle == 180:
        length += increase
    if angle == 0:
        length += increase

    angle += 90
    t.pencolor(r,g,b)

    if r>=255 and b==1:
        g+=2
        #print(r,g,b)

    if g>=255 and r>1:
        r-=2
        #print(r,g,b)

    if g>=255 and r==1:
        b+=2
        #print(r, g, b)

    if b>=255 and g>1:
        g-=2
        #print(r, g, b)
    if b>=255 and g==1:
        r+=2
        #print(r,g,b)
    if r>=255 and b>1:
        b-=2
        #print(r, g, b)

t.exitonclick()
