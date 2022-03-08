directory = {
    1 : 1,
    2 : 1
}

def fibonacci(n):
    if n in directory:
        return directory[n]
    else:
        output = fibonacci(n-1)+fibonacci(n-2)
        directory[n] = output
        return output

print("fibonacci(1000) : ", fibonacci(1000))