package org.example

static int product (int x=3, int y){
    return x*y
}

result = product 5
println result

void display(Map productDetail){
    println productDetail.name
    println productDetail.price
}

display name:"IPHONE", price:1000