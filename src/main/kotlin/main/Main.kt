package main

import test.checkResult

fun main() {
    checkResult(
        caseName ="Given four numeric segments Then should return true" ,
       actualResult = checkIpv4IsValid() ,
        expectedResult = true
    )
    checkResult(
        caseName ="Given more than four numeric segments Then should return false" ,
        actualResult = checkIpv4IsValid() ,
        expectedResult = false
    )
    checkResult(
        caseName ="Given numbers bigger than 255 Then should return false" ,
        actualResult = checkIpv4IsValid() ,
        expectedResult = false
    )
    checkResult(
        caseName ="Given numbers lower than zero Then should return false" ,
        actualResult = checkIpv4IsValid() ,
        expectedResult = false
    )
    checkResult(
        caseName ="Given numbers between 0 to 255 Then should return true" ,
        actualResult = checkIpv4IsValid() ,
        expectedResult = true
    )
    checkResult(
        caseName ="Given numbers lead by zero Then should return false" ,
        actualResult = checkIpv4IsValid() ,
        expectedResult = false
    )
    checkResult(
        caseName ="Given numbers contain only dots Then should return true" ,
        actualResult = checkIpv4IsValid() ,
        expectedResult = true
    )
    checkResult(
        caseName ="Given numbers contain extra characters Then should return false" ,
        actualResult = checkIpv4IsValid() ,
        expectedResult = false
    )

}


