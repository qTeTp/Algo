arr = [0] *31

for i in range(28):
    b = int(input())
    arr[b] = 1

for i in range(1, 31):
    if arr[i] == 0:
        print(i)
