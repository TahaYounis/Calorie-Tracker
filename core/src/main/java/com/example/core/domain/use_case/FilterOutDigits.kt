package com.example.core.domain.use_case

class FilterOutDigits {

    // operator for call class like function
    operator fun invoke(text:String): String{
        return text.filter{ it.isDigit() } // isDigit() validate or process input that should consist only of numeric digits, return true if it's digit.

    }
}