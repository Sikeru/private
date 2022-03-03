pets=[
    {"name" : "구름", "age" : 5},
    {"name" : "초코", "age" : 3},
    {"name" : "아지", "age" : 1},
    {"name" : "호랑이", "age" : 1}
]

print("# 우리 동네 애완 동물들")
for pet in pets:
    print('{} {}살'.format(pet['name'], pet['age']))


numbers = [1,2,6,8,4,3,2,1,9,5,4,9,7,2,1,3,5,4,8,9,7,2,3]
counter={}

for numbers in numbers:
    if numbers in counter:
        counter[numbers]+=1
    else:
        counter[numbers]=1

print(counter)


character={
    "name" : "기사",
    "level" : 12,
    "items" : {
        "sword" : "불꽃의검",
        "armor" : "폴플레이트"
    },
    "skill" : ["베기", "세게 베기", "아주 세게 베기"]
}

for key in character:
    if type(character[key]) is str or type(character[key]) is int:
        print(key, ':', character[key])
    elif type(character[key]) is dict:
        for item in character[key]:
            print(item, ':', character[key][item])
    elif type(character[key]) is list:
        for kill in character[key]:
            print(key, ':', kill)

