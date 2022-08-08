fun main() {
    println("Enter Any Operation.")
    var x= readLine()!!.toString()
    val ans = AO("$x",45,9)
    println(ans)
}

fun AO(o:String,vararg numArray:Int):Int{
    when(o){
        "+"->{
            var result = 0
            for (num in numArray){
                result += num
            }
            return result
        }
        "-"->{
            var result = 2*numArray[0]
            for (num in numArray){
                result -= num
            }
            return result
        }
        "*"->{
            var result = 1
            for (num in numArray){
                result *= num
            }
            return result
        }
        "/"->{
            var result = numArray[0]*numArray[0]
            for (num in numArray){
                result /= num
            }
            return result
        }
        else-> return -1
    }
    return -1
}