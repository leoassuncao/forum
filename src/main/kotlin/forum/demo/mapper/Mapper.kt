package forum.demo.mapper

interface Mapper<T, U> {

    fun map(t: T): U
}