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
 val rows = 5
 var k = 0
 var count = 0
 var count1 = -1
    for (j in 1..rows) {
        for (space in 1..rows - j) {
            print("  ")
            ++count
        }
        while (k != 2 * j - 1) {
            if (count <= rows - 1) {
                print((j + k - 1).toString() + " ")
                ++count
            } else {
                ++count1
                print((j + k - 2 * count1 - 1).toString() + " ")
            }
            ++k
        }
        k = 0
        count = k
        count1 = count
        println()
    }

// EJERCICIO 7
val a = arrayOf("campamento", "cardinales", "polen", null, "hoja", "hermana", "relatividad", null)
println("Longitud de cada palabra del array: ")
for(b in a){
    if (b != null){println(b.length)}
	}
}