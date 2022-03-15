class Test:
    conut = 0
    def __init__(self, id, name):
        self.id = id
        self.name = name
        Test.count += 1
        print("객체가 생성 되었습니다.")

    def __str__(self):
        return self.id + " : " + self.name

tests = [
    Test(1, 'abc'),
    Test(2, 'cde'),
    Test(3, 'efg')
]
t1 = Test(4, 'www')

print()
print("현재 객체는 {}개 입니다.".format(Test.conut))