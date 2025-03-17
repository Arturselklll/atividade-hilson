//Herança: Permite que uma classe herde todos os atributos e metodos de uma outra classe*/
// Essa nossa classe é uma subclasse
class Gato : Animal() {
    val higiene: String = "Usa caixinha de areia"

    override fun somAnimal() : String{
        return "Miau Miau"
    }
    /*POLIMORFISMO: é uma forma de sobscrever metodos*/
}