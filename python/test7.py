scores = []

while True:
    no = int(input('No'))
    if no == 0:
        break
    name = input('Name')
    kor = int(input('kor'))
    eng = int(input('eng'))
    mat = int(input('mat'))
    score=[]
    score=(list([no,name,kor,eng,mat]))
    scores.append(score)

for score in scores:
    tot = score[2]+score[3]+score[4]
