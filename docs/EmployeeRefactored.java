abstract class EmployeeRefactored {
    abstract double calculateBonus();
}

class Manager extends EmployeeRefactored {
    double calculateBonus() { return 5000; }
}

class Developer extends EmployeeRefactored {
    double calculateBonus() { return 3000; }
}

class Intern extends EmployeeRefactored {
    double calculateBonus() { return 1000; }
}