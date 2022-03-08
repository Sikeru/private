with open('기념사.txt', 'r', encoding='utf-8') as file:
    word_list = file.read().strip().split(' ')
    word_temp = []
    for word in word_list:
        word.replace('\n','')
        word.replace('(', ' ')
        word.replace(')', '')
        word.replace('\'', '')
        word.replace('>', '')
        word.replace('<', '')
        word.replace(',', '')
        word.replace('.', '')
        word.replace('·', '')
        word.replace('‘', '')
        word.replace('’', '')
        word_temp.append(word)
print(word_list)
print(len(word_list))
word_list = filter(lambda word : len(word) >=2, word_list)
word_count = {}

for word in word_list:
    if word in word_count:
        word_count[word] += 1
    else:
        word_count[word] = 1
for key, value in word_count.items():
    print("{} : {}".format(key, value))