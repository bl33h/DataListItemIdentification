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
    val resultList = ArrayList<ItemData>()
    // Contador iniciado en 0
    var i: Int = 0
    if (inputList == null) return null
    for(originalValue in inputList){
        // Variables receptivas
            var types: String? = ""
            var infor: String? = ""
            var j = i
        // Ajustes del contador
            i = i + 1
        when(originalValue){
            is String -> //println("String")
            { types = "cadena"
              infor = ("L" + originalValue.length)}
            is Int ->
            { types = "entero"
            if (originalValue%10 == 0){ 
            infor = ("M10")}
            else if (originalValue%5 == 0){ 
            infor = ("M5")}
            else if (originalValue%2 == 0){ 
            infor = ("M2")}
            else {
                infor = null
            }
            } //println("entero")
            is Boolean -> 
            {types = "booleano"
            if (originalValue == true){ 
                infor = ("Verdadero")}
            else if (originalValue == false){ 
                infor = ("Falso")}
            else {
                infor = null
                    }
            }//println("Type: booleano")
            // Caso extraordinario
            else -> {types = null
            infor = null}
        }
        // Elementos
    val element = ItemData(
        originalPos = j,
        originalValue = originalValue,
        type = types,
        info = infor  
    )
    // ------------------------

    // Adicion a la lista
    resultList.add(element)
    // ------------------------
        }
    // Retorno de la lista con los valores implementados
    return resultList
    }