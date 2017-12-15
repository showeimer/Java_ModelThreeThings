class Car {
    String model;
    int year;
    boolean isHybrid;

    public Car(String model, int year, boolean isHybrid) {
        this.model = model;
        this.year = year;
        this.isHybrid = isHybrid;
    }

    public void printInfo() {
        System.out.println("The car is a " + year + " " + model);
    }
}

class Dog {
    String name;
    int age;
    String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void printInfo() {
        System.out.println(name + " is a " + age + " year old " + breed);
    }
}

class Subject {
    String subjectName;
    String teacherName;
    int courseLength;

    public Subject(String subjectName, String teacherName, int courseLength) {
        this.subjectName = subjectName;
        this.teacherName = teacherName;
        this.courseLength = courseLength;
    }

    public void printInfo() {
        System.out.println("I am taking a " + courseLength + " week " + subjectName + " class with Professor " + teacherName);
    }
}