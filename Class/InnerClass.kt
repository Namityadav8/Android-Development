class person{
    var name : String
    var age : Int
    constructor(x:String , y:Int){
        this.name=x
        this.age = y
    }

    constructor(x:String){
        this.name=x
        this.age = 0 
    }
    constructor(){
        this.name = "Rahul"
        this.age = 32
    }
}

fun intro(){
    println("My name is $name and age is $age")
}

fun main(){
    var a = person("Riya",32)
    a.intro()
    var b = person()
    b.intro()
    var c = person("Heena")
    c.intro()
}