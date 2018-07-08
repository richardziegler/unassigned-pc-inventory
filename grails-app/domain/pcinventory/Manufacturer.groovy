package pcinventory

class Manufacturer {

    String name

    static hasMany = [models: Model]

    static constraints = {
    }

    String toString() {
        name
    }
}
