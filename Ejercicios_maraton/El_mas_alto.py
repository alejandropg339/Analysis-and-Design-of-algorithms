mayor = 0
maximo = 100
posicion=0
 
print("digite los 100 numeros: ")

for i in range(maximo):
    num = int(input('Ingresa un numero:'))
    if num > mayor:
        mayor = num
        posicion=posicion+1
 
print("El numero mayor es: ", mayor, "La posicion es: ", posicion)
