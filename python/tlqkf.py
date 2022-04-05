import csv
import matplotlib.pyplot as plt
from matplotlib import font_manager, rc

font_path = r'C:\Windows\Fonts\HANDotum.ttf'
font = font_manager.FontProperties(fname=font_path, size=16).get_name()
rc('font', family=font)

f = open('인구현황.csv', 'r', encoding='cp949')
data = csv.reader(f)

loc = ['동구', '중구', '서구', '유성구', '대덕구']
ages = []

for l in loc:
    for row in data:
        print(l)
        if '대전광역시 '+l+' (' not in row[0] and '대전광역시 '+l in row[0]:
            for i in range(3, 103):
                ages.append(int(row[i]))
    print(len(ages))
