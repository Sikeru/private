import datetime

#50 월 16 화 27 수 38 목 49 금

birth = int(input('생일을 입력하세요'))

if birth%5==0:
    print('월요일 쉽니다.')
elif birth%1==0 or birth%6==0:
    print('화요일 쉽니다.')
elif birth%2==0 or birth%7==0:
    print('수요일 쉽니다.')
elif birth%3==0 or birth%8==0:
    print('목요일 쉽니다.')
elif birth%4==0 or birth%9==0:
    print('금요일 쉽니다.')
