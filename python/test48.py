import pandas as pd
df = pd.read_html('https://ko.wikipedia.org/wiki/%EC%98%AC%EB%A6%BC%ED%94%BD_%EB%A9%94%EB%8B%AC_%EC%A7%91%EA%B3%84', header=0, index_col=0)
#df1 = pd.read_html('https://en.wikipedia.org/wiki/All-time_Olympic_Games_medal_table')
summer = df[0].iloc[:, :5]
print(summer)