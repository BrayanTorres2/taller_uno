package solucion_taller
fun main(){
    print("Ingrese base: ")
    val b= readLine()!!.toDouble()
    print("Ingres altura: ")
    val a= readLine()!!.toDouble()
    println("El area es: ${area_del_triangulo(b,a)}")

}
//-------------------------------------------------
/*
Actividad 1. Traducción de ecuaciones
1.
var s=Math.sqrt(Math.pow(X-m,2.0)/(n-1))
2.
var p=-(Math.pow(y,3.0)-1)/((y+1)-Math.sqrt(y+1))
 */
//------------------------------------------------------
/*
Actividad 2:

 */
//-----------------------------------------------Funciones
/*
Enunciado: Realice una función que halle el área de un triángulo.
Entradas
base-->double-->b
altura-->double-->a
Salidas
area-->double-->area
 */
fun area_del_triangulo(b:Double,a:Double):Double{
    val area=(b*a)/2
    return area
}

/*
Enunciado: d.	Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos.
Entradas
peso_colombiano-->Double-->pc
dolar_actua-->Double-->da
Salidas
Dolar-->Double-->d
 */
fun conversion(pc:Double,da:Double):Double{
    val d=pc/da
    return d
}
//Esto es un cambio




