x=int(input("Ingrese el valor de x"))
y=int(input("Ingrese el valor de y"))
min=y
for i in range (x-1):
    y=int(input("Ingrese el valor"))
    if min > y:
        min=y
        count=i+1


print(count)
