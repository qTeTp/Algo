arr = []
for i in range(10):
    a = int(input())
    b = a%42
    if b not in arr:
        arr.append(b)

print(len(arr))