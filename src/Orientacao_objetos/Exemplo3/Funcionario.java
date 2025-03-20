package Orientacao_objetos.Exemplo3;

public class Funcionario {

    private String name;
    private String cargo;
    private double salary;

    Funcionario(String name, String cargo, double salary) {
        this.name = name;
        this.cargo = cargo;
        this.salary = salary;
    }

    void mostrarInfo() {
        System.out.println("\nNome: " + this.name);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalary() {
        return salary;
    }

}
