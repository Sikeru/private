with open('info.txt', 'r') as file:
    weight_sum = 0
    height_sum = 0
    cnt=0
    for line in file:
        (name, weight, height) = line.strip().split(', ')
        bmi = int(weight) / (int(height) / 100) **2
        weight_sum += int(weight)
        height_sum += int(height)
        cnt+=1
        result = ""
        if bmi >= 25:
            result = "과체중"
        elif bmi >= 18.5:
            result = "정상 체중"
        else:
            result = "저체중"

        print('\n'.join([
            "이름: {}",
            "몸무게: {}",
            "키: {}",
            "BMI: {}",
            "결과: {}",
        ]).format(name, weight, height, bmi, result))
print('몸무게 평균 : {} \n키 평균 : {} \n 인원수 : {}\n'.format(weight_sum / cnt, height_sum/cnt, cnt))