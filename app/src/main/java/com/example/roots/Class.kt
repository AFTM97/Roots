package com.example.roots

class  Person() {
    var name: String = ""
    var sname: String = ""
    var birthyear: Int = 0
    var deathyear: Int = 0

    class Person(_name: String, _sname: String, _birthyear: Int, _deathyear: Int) {
        val name =_name
        val sname =_sname
        val birthyear =_birthyear
        val deathyear =_deathyear
    }
}

class Node{
    var brothers : List<Person> = mutableListOf(Person())
    var mom : Person = Person()
    var dad : Person = Person()


}

fun AddBrother(person: Node){
    var brothers : List<Person> = mutableListOf(Person())
   brothers.add
}