/**
 * *Copyright (C), 2022-2023, Sara Echeverria (bl33h)
    * @author Sara Echeverria
    * FileName: DataListItemIdentification
    @version: I
    - Creacion: 15/07/2022
    - Ultima modificacion: 20/05/2022
 */

// Data class ---
data class ItemData(
    var originalPos: Int,
    var originalValue: Any,
	var type: String? = null,
    var info: String? = null
)
// -----------------------

fun main() {
    val result = processList(listOf(25, "Hola", null, false))
    println(result)
}

fun processList(inputList: List<Any?>?): List<ItemData>? {
	if (inputList == null) return null
    
    for(originalValue in inputList){
        when(originalValue){
            is String -> println("String: '$originalValue'")
            is Int -> println("Integer: '$originalValue'")
            is Boolean -> println("Boolean: '$originalValue'")
            else -> println("null")
        }
    }
    
    return emptyList()
}



//fun processList(inputList: List<Any?>?): List<ItemData>? {
//	return ArrayList<ItemData>()
//}