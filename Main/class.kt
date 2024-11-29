class call{

    var name = ""            //it has to be done var as we will change it 
    fun main1(){
        print("Called the function inside the class and name is $name ")
    }
}

fun main(){
    val obj = call()         // Creating an object of class
    obj.name="Namit"
    obj.main1()             // calling function inside class


    
}