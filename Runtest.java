package Week14homework;
class Runtest extends InheritanceSchool {

    // new method in subclass
    public void display() {
        System.out.println("My Div is " + name);
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of the subclass
        InheritanceSchool s1 = new InheritanceSchool();


        // call method of superclass
        // using object of subclass
        s1.stand1();
        s1.stand2();


    }
}

