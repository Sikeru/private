try:
    number_input_a=input("정수 입력>")
    number_input_a=int(number_input_a)

    print("원의 반지름 : ", number_input_a)
    print("원의 둘레 : ", 2*3.14*number_input_a)
    print("원의 넓이 : ", 3.14, number_input_a**2)

except:
    print("정수가 아닌값이 입력 되었습니다.")