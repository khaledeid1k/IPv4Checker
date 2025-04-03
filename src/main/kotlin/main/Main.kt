package main

import test.checkResult

fun main() {
    checkResult(
        caseName ="When four numeric segments Then should return true" ,
       actualResult = isIpv4Valid("192.168.1.1") ,
        expectedResult = true
    )
    checkResult(
        caseName ="When more than four numeric segments Then should return false" ,
        actualResult = isIpv4Valid("192.168.1.1.1") ,
        expectedResult = false
    )
    checkResult(
        caseName ="When numbers bigger than 255 Then should return false" ,
        actualResult = isIpv4Valid("265.192.1.1") ,
        expectedResult = false
    )
    checkResult(
        caseName ="When numbers lower than zero Then should return false" ,
        actualResult = isIpv4Valid("-192.168.1.5") ,
        expectedResult = false
    )
    checkResult(
        caseName ="When numbers between 0 to 255 Then should return true" ,
        actualResult = isIpv4Valid("192.168.1.0") ,
        expectedResult = true
    )
    checkResult(
        caseName ="When numbers lead by zero Then should return false" ,
        actualResult = isIpv4Valid("012.168.1.1") ,
        expectedResult = false
    )
    checkResult(
        caseName ="When number with space Then should return false" ,
        actualResult = isIpv4Valid("192     .168.1.1") ,
        expectedResult = false
    )
    checkResult(
        caseName ="When numbers contain only three dots Then should return true" ,
        actualResult = isIpv4Valid("192.192.168.1") ,
        expectedResult = true
    )
    checkResult(
        caseName ="When numbers contain extra characters Then should return false" ,
        actualResult = isIpv4Valid("192_168_1_1") ,
        expectedResult = false
    )
    checkResult(
        caseName ="When empty sting Then should return false" ,
        actualResult = isIpv4Valid("") ,
        expectedResult = false
    )
    checkResult(
        caseName ="When number with space at last number Then should return false" ,
        actualResult = isIpv4Valid("192.168.1.1                     ") ,
        expectedResult = false
    )

}


