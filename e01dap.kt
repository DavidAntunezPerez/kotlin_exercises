/**
 * David Antúnez Pérez 2º DAM
 * Programación en Kotlin
 *
 */
fun main() {
    // EJERCICIO 1
    println("EJERCICIO 1:")
	val bocadillo = 1.5
    val refresco = 1.05
    val cerveza = 0.75
    val totalcliente = (bocadillo * 5)+(refresco * 3)+(cerveza * 2)
    println("El cliente debe pagar ${totalcliente}€")
    // EJERCICIO 2
    println("EJERCICIO 2:")
    val h = 12.3
    val r = 1.5
    val vol = kotlin.math.PI * h * r * r
    println("El volumen del cilindro es ${vol}cm^3")
    // EJERCICIO 3
    println("EJERCICIO 3:")
    // CON CONDICIONALES: 
    // val year = 2004
    // var bisiesto = false
    // if((year % 4 == 0)&&(year%100 != 0)){
    // bisiesto = true
    // }else{bisiesto = false}
    // println(bisiesto)
    
    // SIN CONDICIONALES 
    var year = 2004
    println((year % 4 == 0)and(year % 100 != 0))
    
    // EJERCICIO 4
    println("EJERCICIO 4:")
    // AB = 171(decimal) = 10101011(binario)
    // 03 = 3(decimal) = 11(binario)
    // a. 11 (AND), 10101011(OR), 10101000(XOR)
    // b. 101010
    // c. 10101011000
    val dec1 = 171 // AB
    val dec2 = 3
    println("A: ")
    println(dec1 and dec2)
    println(dec1 or dec2)
    println(dec1 xor dec2)
    
    println("B: ")
    println(dec1 shr 2)
    println("C: ")
    println(dec1 shl 3)
    // EJERCICIO 5
    println("EJERCICIO 5:")
    val a = 10
    val b = 9
    val c = a % b // 1
    val d = (c+1)/2 // 1
    // a me da False
    val resA = ((a>b)and(c==d))
    println(!resA)
    // b me da False
    println((a>b)and(c>d)and(c<d))
    // c me da True
    val resC = (a>(b+1))and(a<(b+1))
    println(!resC)
    // EJERCICIO 6
    println("EJERCICIO 6:")
    val n:String? = null
    println("La cadena contiene: ${n}")
    // EJERCICIO 7
    println("EJERCICIO 7:")
    val rang = 10..50
    if(22 in rang){println("22 se encuentra en el rango")}
    if(39 in rang){println("39 se encuentra en el rango")}
}