//nome cientifico, especie, dieta, habitat
// essa nossa classe é uma superclasse
// a palavra OPEN é usada para indicar que uma classe
//pode ser herdada.
open class Animal(){
    //ATRIBUTOS
    var nome: String = ""
    var especie: String = ""
    var dieta: String = ""
    var habitat: String = ""

    //metodos
    open fun somAnimal() : String{
        return "Faz um barulho!"
    }
}
