package org.example

def a = 10
println a
println a.class

float b = 10.24F
println b.class

name = "Chandan"
s = "hello ${name}"
println(s)
println s.class

s1 = '''
All the power is with you
you can do anything and everything
'''

println s1

emailPattern = /[a-zA-Z0-9]+([._-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+([.-][0-9a-zA-Z]+)*\.[a-zA-Z]{2,}/

print "testgmail.com" ==~ emailPattern