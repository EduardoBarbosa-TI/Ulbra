fun main(){
   val listNumbers = mutableListOf<Int>()
   val inputListNumbers = listOf(2,2,5,5)
  
   var amount = 0.0
   var min = 0.0
    
    for( number in inputListNumbers){
        listNumbers.add(number)
    }
    
    for( number in listNumbers){
       amount += number
    }
    
    println(amount)
    
    min = amount / listNumbers.size
    
    print(min)
}
