a=int(input("Ingrese el valor de la varrilla de A"))
b=int(input("Ingrese el valor de la varrilla de B"))
c=int(input("Ingrese el valor de la varrilla de C"))
d=int(input("Ingrese el valor de la varrilla de D"))


if a < (b+c) and b < (a+c) and c < (a+b):
    print("S\n")
elif a < (b+d) and b < (a+d) and d < (a+b):
    print("S\n")
elif a < (c+d) and c < (a+d) and d < (c+a):
    print("S\n")
elif b < (c+d) and c < (b+d) and d < (c+b):
    print("S\n")
else:
    print("N\n")
