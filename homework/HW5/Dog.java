package homework.HW5;

public class Dog {
    private int age;
    private String breed;
    
    public Dog(int newAge, String newBreed) {
        age = newAge;
        breed = newBreed;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    public String toString() {
        return "Breed: " + breed + ", Age: " + age;
    }

    public boolean equals(Dog d2) {
        return breed.equals(d2.getBreed());
    }

    public int compareTo(Dog d2) {
        if(age > d2.getAge())
            return 1;
        else if (age == d2.getAge())
            return 0;
        else
            return -1;
    }
}