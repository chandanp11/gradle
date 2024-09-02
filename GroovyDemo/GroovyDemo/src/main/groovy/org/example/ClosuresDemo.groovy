package org.example

c = { n=2->
    println(n%2==0?"Even":"Odd")
}

c.call()
4.times {n->println n}
4.times {println it}