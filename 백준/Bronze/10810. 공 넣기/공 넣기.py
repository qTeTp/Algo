a, b = map(int, input().split())
arr = [0] * (a+1)

for i in range(b):
    c, d, e = map(int, input().split())
    for j in range(c, d + 1):
        arr[j] = e
print(*arr[1:])