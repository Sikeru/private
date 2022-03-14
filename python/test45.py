from urllib import request
from bs4 import BeautifulSoup as bs

target = request.urlopen('http://djit21.co.kr/')
soup=bs(target, "html.parser")
img_list = soup.select("img")
cnt = 1
for img in img_list:
    print(img['src'])
    if img['src'].split('.')[1] == 'jpg':
        file=open('images/img'+str(cnt)+'.jpg', 'wb')
        target = request.urlopen('http://djit21.co.kr/'+img['src'])
        output = target.read()
        file.write(output)
        cnt +=1
        file.close()