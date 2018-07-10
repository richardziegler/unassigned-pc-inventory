package pcinventory

class Model {

    String name
    static belongsTo = Manufacturer

    static constraints = {
    }

    String toString() {
        name
    }
}