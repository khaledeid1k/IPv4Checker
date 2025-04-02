package main

import test.checkResult

fun main() {
    checkResult(
        caseName ="Given four numeric segments Then should return true" ,
       actualResult = checkIpv4IsValid("192.168.1.1") ,
        expectedResult = true
    )
    checkResult(
        caseName ="Given more than four numeric segments Then should return false" ,
        actualResult = checkIpv4IsValid("192.168.1.1.1") ,
        expectedResult = false
    )
    checkResult(
        caseName ="Given numbers bigger than 255 Then should return false" ,
        actualResult = checkIpv4IsValid("265.192.1.1") ,
        expectedResult = false
    )
    checkResult(
        caseName ="Given numbers lower than zero Then should return false" ,
        actualResult = checkIpv4IsValid("-192.168.1.5") ,
        expectedResult = false
    )
    checkResult(
        caseName ="Given numbers between 0 to 255 Then should return true" ,
        actualResult = checkIpv4IsValid("192.168.1.0") ,
        expectedResult = true
    )
    checkResult(
        caseName ="Given numbers lead by zero Then should return false" ,
        actualResult = checkIpv4IsValid("012.168.1.1") ,
        expectedResult = false
    )
    checkResult(
        caseName ="Given numbers contain only dots Then should return true" ,
        actualResult = checkIpv4IsValid("192.192.168.1") ,
        expectedResult = true
    )
    checkResult(
        caseName ="Given numbers contain extra characters Then should return false" ,
        actualResult = checkIpv4IsValid("192_168_1_1") ,
        expectedResult = false
    )

}


