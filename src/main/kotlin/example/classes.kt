package example

open class Parent(open val name: String) {
    open fun say(): Unit = println("[parent] Hello, $name")
}

class Child(override val name: String, val age: Int) : Parent(name) {
    override fun say() {
        println("[child] $name $age" + super.say())
    }
}