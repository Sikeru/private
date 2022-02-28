import datetime
now = datetime.datetime.now()

print(now)
print(now.year)
hour = now.hour
if hour < 12:
    print('현재 시간은 {}시로 오전입니다.' .format(hour))
else:
    print('현재 시간은 {}시로 오후입니다.' .format(hour))