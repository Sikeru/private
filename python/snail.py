n = int(input("숫자를 입력해주세요"))
a=1
arr=[[0 for i in range(n)] for j in range(n)]

for i in range(n):
    for j in range(n):
        arr[i][j]=a
        a+=1

# i=0
# for i in range(n):
#     for j in range(n):
#         print(arr[i][j],"\t", end='')
#     print('')


