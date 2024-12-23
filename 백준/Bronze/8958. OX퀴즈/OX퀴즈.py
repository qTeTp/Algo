a = int(input())

for i in range(a):
    b = input()
    cnt=0
    score =0
    for j in b:
        if(j == 'O'):
            cnt += 1
            score = score + cnt
            
        else:
            cnt=0
    print(score)