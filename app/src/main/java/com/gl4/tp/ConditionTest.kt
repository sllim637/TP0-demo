package com.gl4.tp

fun main(args: Array<String>) {
//Créer une fonction qui prend en paramètres deux entiers et
// un opérateur ( +, -, /,*, %) et renvoit le résultat de l'opération. Tester la fonction.
    fun calculer(a : Int , b : Int , operateur : String) : Number{
        var value : Number = 0 ;
        when(operateur){
            "+"-> value = a+b ;
            "-"-> value =a-b ;
            "/"-> if(b != 0){
                value = a/b
            } ;
            "*"-> value = a*b ;
            "%"-> value = a%b ;
            else ->value =0
        }
    return value;
    }
}
