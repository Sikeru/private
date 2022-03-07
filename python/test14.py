exec_dict = {
    '키A' : '값A',
    '키B' : '값B',
    '키C' : '값C',
}
print('# 딕셔너리의 itme() 함수')
print('items() : ', exec_dict.items())
print()
for key, element in exec_dict.items():
    print('exec_dict[{}] = {}'.format(key, element))
for ele in exec_dict:
    print('exec_dict[{}] = {}'.format(ele, exec_dict[ele]))
