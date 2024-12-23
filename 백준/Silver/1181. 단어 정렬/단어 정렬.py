a = int(input())
arr = []
tmp = [] # 중복 체크용 배열

for i in range(a) :
    b = input()
    if b not in tmp :
        tmp.append(b)
        arr.append([len(b), b])

arr.sort()
for i in arr:
    print(i[1])