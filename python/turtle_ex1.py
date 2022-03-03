import math
import turtle as t

t.penup()
t.goto(-450,0)
t.pendown()

for i in range(-450,450):
    t.goto(i,i*math.sin(i*0.1))

t.exitonclick()