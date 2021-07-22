import java.util.*

class MyStack<T: Any> : MyVector<T>() {

    fun pop(): T {
        if (this.isEmpty()) {
            throw EmptyStackException()
        }
        return removeLast()
    }

    fun push(element: T) {
        addElement(element)
    }

}
