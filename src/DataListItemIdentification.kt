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
// -----------------------

// Metodo para procesar la lista y retornar el resultado
fun processList(inputList: List<Any?>?): List<ItemData>? {
	// Variable lista de los items de la otra cadena
    val resultList = ArrayList<ItemData>()
    // Contador iniciado en 0
    var i: Int = 0
    if (inputList == null) return null
    for(originalValue2 in inputList){
        // Variables receptivas
            var types: String? = ""
            var infor: String? = ""
            var j = i
        // Ajustes del contador
            i = i + 1
        if(originalValue2 != null){
        when(originalValue2){
            is String ->
            { types = "cadena"
              infor = ("L" + originalValue2.length)}
            is Int ->
            { types = "entero"
            if (originalValue2%10 == 0){ 
            infor = ("M10")}
            else if (originalValue2%5 == 0){ 
            infor = ("M5")}
            else if (originalValue2%2 == 0){ 
            infor = ("M2")}
            else {
                infor = null
            }
            }
            is Boolean -> 
            {types = "booleano"
            if (originalValue2 == true){ 
                infor = ("Verdadero")}
            else if (originalValue2 == false){ 
                infor = ("Falso")}
            else {
                infor = null
                    }
            }
            // Caso extraordinario
            else -> {types = null
            infor = null}
        }
        // Elementos
    val element = ItemData(
        originalPos = j,
        originalValue = originalValue2,
        type = types,
        info = infor  
    )
    // ------------------------

    // Adicion a la lista
    resultList.add(element)
    // ------------------------
        }
    }
    
    // Retorno de la lista con los valores implementados
    return resultList
    }
	// ------------------------