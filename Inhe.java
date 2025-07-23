
class Employee {
    int salary = 10000000;
}

class Employees extends Employee {
    String CpmpanyName = "Tesla";
}

class Inhe {
    public static void main(String args[])
    {
        Employees E1 = new Employees();
        System.out.println(E1.salary+ " " + E1.CpmpanyName);
    }
}
