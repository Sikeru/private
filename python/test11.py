addr_list = [
    ['친구', '홍길동', '123-1234-1234'],
    ['가족', '이쁜이', '222-2222-2222'],
    ['친구', '강아지', '333-3333-3333'],
    ['친구', '송아지', '444-4444-4444'],
    ['가족', '고양이', '555-5555-5555'],
    ['직장', '망아지', '666-6666-6666'],
    ['직장', '금붕어', '777-7777-7777'],
    ['세탁소', '888-8888-8888'],
    ['식당', '999-9999-9999']
]
addr_dict = {}
for addr in addr_list:
    if len(addr) == 3:
        if addr[0] in addr_dict:
            addr_temp = {}
            addr_dict[addr[0][addr[2]]] = addr[1]
        else:
            addr_temp = {}
            addr_temp[addr[1]] = addr[0]
            addr_dict[addr[0]] = addr_temp
    else:
        temp='기타'
        if temp in addr_dict:
            addr_dict[temp[addr[1]]]=addr[0]
        else:
            addr_temp = {}
            addr_temp[addr[1]] = addr[0]
            addr_dict[temp] = addr_temp

for addr in addr_dict:
    print(addr)