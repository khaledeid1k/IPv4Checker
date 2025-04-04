package main

fun isIpv4Valid(iPVersionNumber: String): Boolean {
    val ipNumbers = iPVersionNumber.split('.')
    if (ipNumbers.size == 4) {
       return ipNumbers.all {
                   it.isNotEmpty()&& it.isNotBlank() && it.toIntOrNull() in 0..254 && (it == "0"|| it[0] != '0')
                }



    }

    return false
}