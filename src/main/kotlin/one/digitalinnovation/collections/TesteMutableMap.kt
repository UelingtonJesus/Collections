package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(joao.nome, pedro)
    repositorio.create(joao.nome, maria)

    println(repositorio.findById(maria.nome))
    println("---------------------------")

    repositorio.findAll().forEach{println(it)}
    println("---------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{println(it)}
    println("---------------------------")

}