import math
n = []
v = []
print("Enter the number of groups")
k = int(input())
for a in range(0,k):
    print("Enter the number of elements of group "+str(a+1))
    ni = int(input())
    n.append(ni)
    print("Enter the elements of group "+str(a+1))
    for b in range(0,n[a]):
        vi = float(input())
        v.append(vi)
mg = []
mt = sum(v)/len(v)
temp = 0
temp2 = 0
temp3 = 0
for a in range(0,k):
    temp3 = n[a] + temp3
    if temp3>len(v):
        temp3 = len(v)
    for b in range(temp2,temp3):
            temp = v[b] + temp
    avg = temp/n[a]
    mg.append(avg)
    temp = 0
    temp2 = temp3
sst = 0.0
ssb = 0.0
for a in range(0,k):
     ssb = ((mg[a] - mt)**2) + ssb
for a in range(0, len(v)):
     sst = ((v[a] - mt)**2) + sst
ssw = sst - ssb
msw = ssw/(len(v) - 1)
msb = ssb/(len(v) - k)
if (msb == msw) and (msb == 0):
     f = 0
else:
     f = msb/msw
print("F statistic: "+str(f))
