fun main(){
    var t=indices(listOf("umulisa","murugi","wairimu","karimi","nkimalantoi","odoyo","waithera","salma","natete","kirigo"))
     println(t)

    var x=heightMetre(listOf(1,4,5,9))


    println(x)


    var c=person("nancyy",22,34,67)

    var b=person("mary",24,12,56)

    var h=person("caroline",42,46,68)

    var d=person("esther",19,68,50)

    var ages= mutableListOf(c,b,h,d)


    var sortedages=ages.sortedByDescending { person -> person.age }

    println(sortedages)

    var list= mutableListOf<person>(person("Agape",6,23,53),person("Wanjera",12,32,56))
    ages.addAll(list)


    println(ages)

    var p=Car("kDD",80)

    var z=Car("KCF",70)
    var m=Car("KDF",60)
    var kent= listOf(p,z,m)

    println(average(kent))

}


fun indices(name:List<String>):List<String>{

    var tiye = mutableListOf<String>()

    name.forEachIndexed{index, s ->

        if (index%2==0){

            tiye.add(s)


        }
    }
    return tiye
}

fun heightMetre(height:List<Int>):String{

    var c=height.sum()

    var w=height.average()

    var total="$c,$w"

    return total

}
data class person(var name: String,var age:Int,var height:Int,var weight:Int){

}

fun anotherList(Name:List<Any>):List<Any>{
    return listOf()
}

data class Car(var regestration:String,var mileage:Int)

fun average(speed:List<Car>):Int{
    var total=0
    speed.forEach{Car->
        total+=Car.mileage

    }
    var average=total/speed.count()

    return average
}