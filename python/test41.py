import time
from urllib import request
target = request.urlopen("https://google.com")
output = target.read()

print(output)