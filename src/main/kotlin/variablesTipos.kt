fun main(){
    // Variables Y Tipos de Datos Kotlin
    // val para constantes
    // var para variables

    val name = "Francisco López"
    var age = 39

    print("H!, I`m $name and I`m ")
    println("$age years old")

    // name = "Frank" las variables val no change (immutables)
    age = 24
    age += 15

    // age = "diez"  Variables var cambian de valor pero no de tipo

    // Especificar Tipo de Dato en declaración

    // Declaración
    val city: String
    // inicialización
    city = "Huamantla"

    // Declaración e inicialización
    val isMarried: Boolean = false

    val cars: Int = 1
    val height: Double = 1.68

    println(isMarried)
    println(height)
    // String Templates
    // $ para imprimir valor de variables
    // ${} para procesos antes de imprimir
    println("Hola soy $name y tengo $age años")
    println("Vivo en $city, tengo $cars Carros")

    println("En 2030 tendré ${ cars + 3 } 🚘")
}