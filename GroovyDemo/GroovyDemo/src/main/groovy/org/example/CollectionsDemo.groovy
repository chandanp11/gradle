package org.example

l = [1,2,3]
println l
println l.class

l << 4
println l

l = l+[5,6,7]
println l

println l-[3,4]

//l.each {println it}
//println '--------------'
//
//l.reverseEach {println it}
//println "-------------"

//l.eachPermutation {println it}

s = ["java", "js", "python"] as Set
println s
println s.class

m=[courseName:"gradle", rating:5, price:20]
println m
println m.getClass()
m.each {k,v ->
    println "${k}:${v}"
}

println m.courseName
println m['courseName']
println m.get('courseName')

m.review='its awesome'
println m