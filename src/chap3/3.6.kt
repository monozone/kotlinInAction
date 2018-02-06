package chap3

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException( "Can't save user ${user.id}: empty ${fieldName}" )
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")


    /*
    if (user.name.isEmpty()) {
        throw IllegalArgumentException( "Can't save user ${user.id}: empty Name" )
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException( "Can't save user ${user.id}: empty Address" )
    }
    */
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}