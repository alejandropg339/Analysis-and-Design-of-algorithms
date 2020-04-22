print("ingrese el numeo de casos: ")
casos=input()
casos=int(casos)


for i in range(0,casos):
   print("ingrese los 3 numeros")
   n1=input()
   n1=float(n1)

   n2=input()
   n2=float(n2)

   n3=input()
   n3=float(n3)

   respuesta=(n1+n2+n3)/3
   print("Respuesta: ",respuesta)
