/**
 * *Copyright (C), 2022-2023, Sara Echeverria (bl33h)
    * @author Sara Echeverria
    * FileName: DataListItemIdentification
    @version: I
    - Creacion: 15/07/2022
    - Ultima modificacion: 16/07/2022
 */

// Data class ---
data class ItemData(
    var originalPos: Int,
    var originalValue: Any,
	var type: String? = null,
    var info: String? = null
)
// -----------------------

// Metodo main
fun main() {
    val result = processList(listOf(25, "Hola", null, false))
    println(result)
}
// Metodo para procesar la lista y retornar el resultado
fun processList(inputList: List<Any?>?): List<ItemData>? {
	// Variable lista de los items de la otra cadena
    resultList = ArrayList<ItemData>()
    // Contador iniciado en 0
    var i: Int = 0
    if (inputList == null) return null
    for(originalValue in inputList){
        when(originalValue){
            // Variables receptivas
            var types: String? = " "
            var infor = String? = " "
            // Ajustes del contador
            i = i + 1
            is String -> //println("String")
            { }
            is Int ->
            { } //println("entero")
            is Boolean -> 
            { }//println("Type: booleano")
            else -> println("null")
        }
    }
    // -----------------------
    
    // Retorno de la lista con los valores implementados
    return emptyList()
}
// -----------------------