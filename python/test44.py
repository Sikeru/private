from flask import Flask
app = Flask(__name__)
from urllib import request
from bs4 import BeautifulSoup as bs
@app.route("/")
def hello():
    html = "<h1>Hello World!</h1>"
    html += "<p>파이썬 웹프로젝트</p>"
    html += "<a href='https://www.naver.com'>네이버</a>"
#    target = request.urlopen("https://finance.naver/com/")
#    soup = bs(target, "html.parser")
#    cont = soup.select("")
    return html
