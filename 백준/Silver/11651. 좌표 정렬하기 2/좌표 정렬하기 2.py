a = int(input())
arr = []

for i in range(a) :
    b, c = map(int, input().split())
    arr.append([c, b])

arr.sort()

for i in arr:
    print(i[1], i[0])