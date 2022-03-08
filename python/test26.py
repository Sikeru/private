# with open('test.txt', 'w') as file:
#     file.write('Hello Python Programming.......!')
# with open('d:\\pythondata\\test.txt', 'w') as file_a:
#     file_a.write('Hello Python Programming.......!')

with open("test.txt", 'r') as readfile:
    contents = readfile.read()
print(contents)