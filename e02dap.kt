fun main() {
// EJERCICIO 1
val edad = 68
    if((edad >= 18)&&(edad < 67)){println("El usuario es activo")}
    else if(edad < 18){println("El usuario es menor de edad")}
    else{println("El usuario está jubilado")}
    
// EJERCICIO 2
val mark = 5
var res = ""
when{
    mark < 5 -> {res = "Insuficiente"}
    ((mark >= 5)&&(mark < 7)) -> {res = "Suficiente"}
    ((mark >= 7)&&(mark < 9)) -> {res = "Notable"}
    mark >= 9 -> {res = "Notable"}
    else -> {res = "ERROR, indique un número válido"}
	}
	println(res)
// EJERCICIO 3
// usaremos la variable edad creada en el ejercicio 1
    when{
        edad < 18 ->{println("El usuario es menor de edad")}
        ((edad >=18)&&(edad < 67))->{println("El usuario está activo")}
        edad >= 67 ->{println("El usuario está jubilado")}
        else->{println("ERROR, edad no válida")}
    }
// EJERCICIO 4
for(num: Int in 1..100){
    if(num % 3 != 0) continue 
    print("${num} ") }
println("")
// EJERCICIO 5
var invnum = 1234
var cogNum = 0
var i = 1
    while(i <= invnum){
        cogNum = invnum % 10
        print(cogNum)
        invnum = invnum/10
    }
    println("")
// EJERCICIO 6
    val h = 4
    val f = 3
 for(f:Int in 1..h){
   // dibujamos los espacios
   for(i:Int in 1..(h-f)) print("*")
   //dibujamos los numeros de forma creciente
   for(i:Int in 1..f) print(i)
   //dibujamos los numeros de forma decreciente
   for(i:Int in (f-1) downTo 1) print(i)
   println("")
 }

// EJERCICIO 7
val a = arrayOf("campamento", "cardinales", "polen", null, "hoja", "hermana", "relatividad", null)
println("Longitud de cada palabra del array: ")
for(b in a){
    if (b != null){println(b.length)}
	}
}