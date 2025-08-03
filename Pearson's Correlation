import math
x= []
y = []
print("Enter the number of observations")
n= int(input())
print("Enter the values of variable X")
for a in range(0,n):
  xi= float(input())
  x.append(xi)
print("Enter the values of variable Y")
for a in range(0,n):
  yi = float(input())
  y.append(yi)
mx = sum(x)/len(x)
my = sum(y)/len(y)
co = 0.0;
ssx = 0;
ssy = 0;
for a in range(0,n):
  co = (x[a] - mx)*(y[a] - my) + co
for a in range(0,n):
   ssx = ((x[a] - mx)**2) + ssx
for a in range(0,n):
  ssy = ((y[a] - my)**2) + ssy
rpss = math.sqrt(ssx*ssy)
pearson = co/rpss
print("Pearson's correlation coefficient: ")
print(pearson)
