import math
x = []
y = []
print("Enter the number of observations for X")
n1 = int(input())
print("Enter the values of Variable X")
for a in range(0,n1):
    xi = float(input())
    x.append(xi)
print("Enter the number of observations for Y")
n2 = int(input())
print("Enter the values of Variable Y")
for a in range(0,n2):
    yi = float(input())
    y.append(yi)
mx = sum(x)/len(x)
my = sum(y)/len(y)
ssx = 0;
ssy = 0;
for a in range(0,n1):
    ssx= ((x[a] - mx)**2) + ssx
for a in range(0,n2):
    ssy= ((y[a] -my)**2) + ssy
var1= ssx/n1
var2= ssy/n2
se = math.sqrt((var1/n1) + (var2/n2))
t = (mx - my)/se
print("t value is: ")
print(t)
