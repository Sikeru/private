class Student:
    def __init__(self, name, kor, mat, eng, sci):
        self.name = name
        self.kor = kor
        self.mat = mat
        self.eng = eng
        self.sci = sci
    def get_sum(self):
        return self.kor + self.mat + self.eng + self.sci
    def get_avatage(self):
        return self.get_sum()/4
    def __str__(self):
        return "{}\t{}\t{}".format(self.name,
                                   self.get_sum(),
                                   self.get_avatage())
    def __eq__(self, value):
        return self.get_sum() == value.get_sum()
    def __ne__(self, value):
        return self.get_sum() != value.get_sum()
    def __gt__(self, value):
        return self.get_sum() > value.get_sum()
    def __ge__(self, value):
        return self.get_sum() >= value.get_sum()
    def __lt__(self, value):
        return self.get_sum() < value.get_sum()
    def __le__(self, value):
        return self.get_sum() <= value.get_sum()
students = [
    Student("윤인성", 87, 98, 88, 95),
    Student("연하진", 92, 98, 96, 98),
    Student("구지연", 76, 96, 94, 90),
    Student("나선주", 98, 92, 96, 92),
    Student("윤아린", 95, 98, 98, 98),
    Student("윤영월", 64, 88, 92, 92)
]
cnt=0
for student in students:
    print(students[cnt].name, end='    ')
    print(students[cnt].kor, end='    ')
    print(students[cnt].mat, end='    ')
    print(students[cnt].eng, end='    ')
    print(students[cnt].sci, end='    ')
    print()
    cnt+=1

st_a = Student("윤인성", 87, 98, 88, 95)
st_b = Student("나선주", 98, 92, 96, 92)

print(st_a >= st_b)
