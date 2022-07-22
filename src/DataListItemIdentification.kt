/**
 * *Copyright (C), 2022-2023, Sara Echeverria (bl33h)
    * @author Sara Echeverria
    * FileName: DataListItemIdentification
    @version: I
    - Creation: 15/07/2022
    - Last modification: 22/07/2022
 */

// DATA CLASS ---
data class ItemData(
    var originalPos: Int,
    var originalValue: Any,
	var type: String? = null,
    var info: String? = null
)
// -----------------------

// MAIN METHOD ---
fun main() {
    val result = processList(listOf(25, "Hola", null, false))
    println(result)
}
// PROCESS LIST METHOD ---
/* Returns the result for each case. */
fun processList(inputList: List<Any?>?): List<ItemData>? {
    // --- Results array for each case ---
    val resultList = ArrayList<ItemData>()
    if (inputList == null) return null
        for((index, item) in inputList.withIndex()){
        if (item != null){
            var element = ItemData(
            originalPos = index,
            originalValue = item,
            type = identifyType(item),
            info = identifyInfo(item))
            // Addition of elements in the new list
            resultList.add(element)
        }
	}
    
    // It returns the new list with the new info.
    return resultList
}
// -----------------------

// TYPE METHOD ---
/* Makes an action depending on the type of data it identifies in the list. */
fun identifyType(item: Any?): String?{
    return when(item){
        is String -> "cadena"
        is Int -> "entero"
        is Boolean -> "booleano"
        else -> null}
}

// IDENTIFICATION METHOD ---
/* Makes an action depending on the type of data it identifies in the list. */
fun identifyInfo(item: Any?): String?{
    return when(item){
        is String -> "L" + item.length
        is Int -> multipleInt(item) 
        is Boolean -> if (item) "verdadero" else "falso"
        else -> null}
}
// ------------------------

// IS IT A MULTIPLE METHOD ---
/* Verifies if the number is a multiple of 10, 5 or 2. */
fun multipleInt(int: Int):String?{
    var info: String?=""
    if (int%10 == 0) info = "M10"
    else if (int%5 == 0) info = "M5"
    else if (int%2 == 0) info = "M2"
    else info = null
    return info
}
// ------------------------