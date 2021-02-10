
l,d,n = map(int,input().split())
position=[]
for i in range(n):
    position.append(int(input()))
position.sort()
count=0
if n == 0:
    count += (l-12) // d +1
else:
    left_dist = position[0] - 6;
    right_dist = (l - 6) - position[-1]
    count += (left_dist // d) + (right_dist // d)
    for i in range(n-1):
        dist_betw = position[i + 1] - position[i];
        count += (dist_betw // d) - 1;
print(count)
