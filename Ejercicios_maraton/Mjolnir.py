casos=int(input("Ingrese el numero de casos de ensayo: "))

for i in range(casos):
    nombre = input("Ingrese el nombre del que realizara el intento: ")
    fuerza=int(input("Ingrese la fuerza aplicada en newtons"))
    if nombre == "Thor":
        print("Y")
    else:
        print("N")


casos();
