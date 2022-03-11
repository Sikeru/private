from urllib import request
from bs4 import BeautifulSoup

target = request.urlopen("https://mail.naver.com/#%7B%22fClass%22%3A%22list%22%2C%22oParameter%22%3A%7B%22page%22%3A1%2C%22sortField%22%3A1%2C%22sortType%22%3A0%2C%22folderSN%22%3A%220%22%2C%22type%22%3A%22%22%2C%22isUnread%22%3Afalse%7D%7D")
soup = BeautifulSoup(target, "html.parser", from_encoding='cp949')
tbody = soup.select("#list_for_view > ol > li.\\31 7482_li.unmark._c1\(mrCore\|clickTitle\|17482\)._d2\(mcDragndrop\|html5DragStart\) > div > div.subject > a._d2\(mcDragndrop\|html5DragStart\) > span > strong")
print(tbody)
# for item in tbody:
#     name = item.select_one("th > a").string
#     curr = item.select_one("td:nth-child(2)").string
#     updown = item.select_one("td:nth-child(3) > em").string
#     print(name, curr, updown)