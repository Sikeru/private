class Test:
    def __init__(self, name):
        self.name = name
        print("{} - 생성되었습니다.".format(self))
    def __del__(self):
        print("{} - 파괴되었습니다.".format(self))

a = Test("A")
b = Test("B")
C = Test("C")