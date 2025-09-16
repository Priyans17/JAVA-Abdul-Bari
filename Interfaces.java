package MultipleClasses;

//interface Test {
//    void meth1();
//    void meth2();
//}
//
//class My implements Test {
//    public void meth1()
//    {
//        System.out.println("Meth1 of class My");
//    }
//    public void meth2()
//    {
//        System.out.println("Meth2 of class My");
//    }
//    public void meth3()
//    {
//        System.out.println("Meth3 of class My");
//    }
//}
//
//public class Interfaces {
//    public static void main(String[] args) {
//        My t = new My(); //a reference of an interface can hold the object of a class which is implementaing the interface.
//        t.meth1();
//        t.meth2();
//        t.meth3();
//    }
//}

//Mobile Example

//class Phone
//{
//    public void call() { System.out.println("Phone call"); }
//    public void sms() { System.out.println("Phone sending SMS"); }
//}
//
////It can also be a class or it can be an interface
//interface ICamera
//{
//    void click();
//    void record();
//}
//
//interface IMusicPlayer
//{
//    void play();
//    void stop();
//}
//
//class SmartPhone extends Phone implements ICamera,IMusicPlayer
//{
//    public void videoCall() { System.out.println("Smart Phone video calling"); }
//
//    public void click() { System.out.println("Smart Phone Clicking Photo"); }
//    public void record() { System.out.println("Smart Phone recording video"); }
//    public void play() { System.out.println("Smart Phone playing music"); }
//    public void stop() { System.out.println("Smart Phone stopped playing music"); }
//}
//
//public class Interfaces {
//    public static void main(String[] args) {
//        System.out.println("Smart Phone Includes Features like Phone, Music, Camera, etc");
//
//        // Using SmartPhone as Phone
//        Phone sp = new SmartPhone();
//        sp.call();
//        sp.sms();
//
//        // Using SmartPhone as Camera
//        ICamera cam = new SmartPhone();
//        cam.click();
//        cam.record();
//
//        // Using SmartPhone as Music Player
//        IMusicPlayer mp = new SmartPhone();
//        mp.play();
//        mp.stop();
//
//        System.out.println("While Clicked on Phone");
//        Phone p = new Phone();
//        p.call();
//        p.sms();
//    }
//}

//Callback Example
//
//interface Member {
//    public void callback();
//}
//
//class Store {
//    Member members[] = new Member[10];
//    int count = 0;
//
//    void register(Member m) {
//        members[count++] = m;
//    }
//
//    void inviteSale() {
//        for (int i = 0; i < count; i++)
//            members[i].callback();
//    }
//}
//
//class Customer implements Member {
//    String name;
//    Customer (String n) {
//        name = n;
//    }
//    public void callback(){
//        System.out.println("Ok, I will visit -> " + name);
//    }
//
//}
//
//public class Interfaces {
//    public static void main(String[] args) {
//        Store s = new Store();
//        Customer c1 = new Customer("Priyansh");
//        Customer c2 = new Customer("Lavanya");
//        Customer c3 = new Customer("Vineet");
//        s.register(c1);
//        s.register(c2);
//        s.register(c3);
//        System.out.println("Customers Registered Successfully");
//        s.inviteSale();
//
//    }
//}


//// Do's & Don'ts
//
//interface Test {
//
//    final static int X = 10; // constants in interface, always public static final
//
//    // abstract methods (public + abstract by default)
//    void meth1();
//    void meth2();
//
//    // static method inside interface
//    public static void meth3() {
//        System.out.println("Meth3 of Test");
//    }
//
//    // default method inside interface (object can call this)
//    default void meth5() {
//        System.out.println("Default method meth5 of Test");
//    }
//}
//
//interface Test2 extends Test {
//    void meth4();
//}
//
//class My implements Test2 {
//    public void meth1() { System.out.println("My meth1"); }
//    public void meth2() { System.out.println("My meth2"); }
//    public void meth4() { System.out.println("My meth4"); }
//}
//
//public class Interfaces {
//    public static void main(String[] args) {
//        System.out.println(Test.X);   // access constant
//
//        // call static method properly
//        Test.meth3();
//
//        // object of implementing class
//        My m = new My();
//        m.meth1();
//        m.meth2();
//        m.meth4();
//
//        // calling default method (via object)
//        m.meth5();
//    }
//}

// Main interface
interface Test {
    // constants (always public static final)
    final static int X = 20;

    // abstract methods (must be implemented by implementing class)
    public abstract void meth1();
    public abstract void meth2();

    // private method inside interface (only accessible within interface)
    // introduced in Java 9+
    private void meth3() {
        System.out.println("Meth3 of Test (private helper method)");
    }

    // default method (can be inherited & called by implementing class objects)
    default void meth5() {
        // calling private method from inside default
        meth3();
    }
}

// Another interface extending Test
interface Test2 extends Test {
    void meth4();
}

// Class implementing Test2 (which indirectly implements Test also)
class My implements Test2 {

    // Must implement all abstract methods
    public void meth1() {
        System.out.println("My meth1 implementation");
    }

    public void meth2() {
        System.out.println("My meth2 implementation");
    }

    public void meth4() {
        System.out.println("My meth4 implementation");
    }

    // Can't implement meth3() here because it's private in interface.
    // If you write `public void meth3() {}` here, it's just a *new* method,
    // not related to the interface's private one.
    public void meth3() {
        System.out.println("My own meth3 (not interface's private one)");
    }
}

// Driver class
public class Interfaces {
    public static void main(String[] args) {
        // Accessing constant from interface
        System.out.println(Test.X);

        // Creating object of implementing class
        My m = new My();

        // Call implemented methods
        m.meth1();
        m.meth2();
        m.meth4();

        // Call class's own meth3 (not the private one from interface)
        m.meth3();

        // Call default method from interface (which internally calls private meth3 of interface)
        m.meth5();
    }
}

//Interfaces vs Multiple Inheritance

/**
 * Interfaces Example in Java
 * --------------------------
 * Why Java Interfaces are Better:
 *   - Avoids the "Diamond Problem" of C++
 *   - Allows real-world modeling (a class can play multiple roles)
 *   - Supports polymorphism cleanly
 *
 * Real-World Examples:
 *   1. SmartPhone = Phone + Camera + MusicPlayer
 *   2. Amphibian  = Terrestrial + Aquatic
 *   3. Suzuki Car = Car + MusicPlayer
 */

// ======================== INTERFACES ========================
interface Phone {
    void makeCall(String number);
}

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic(String song);
}

interface Terrestrial {
    void walkOnLand();
}

interface Aquatic {
    void swimInWater();
}

interface Carr {
    void drive();
}

// ======================== IMPLEMENTATIONS ========================
class SmartPhone implements Phone, Camera, MusicPlayer {
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public void playMusic(String song) {
        System.out.println("Playing song: " + song);
    }
}

class Amphibian implements Terrestrial, Aquatic {
    public void walkOnLand() {
        System.out.println("Walking on land...");
    }

    public void swimInWater() {
        System.out.println("Swimming in water...");
    }
}

class Suzuki extends Car implements MusicPlayer {
    public void drive() {
        System.out.println("Driving Suzuki car...");
    }

    public void playMusic(String song) {
        System.out.println("Playing music in Suzuki: " + song);
    }
}

// ======================== MAIN ========================
public class Interfaces {
    public static void main(String[] args) {
        // Smartphone example
        SmartPhone sp = new SmartPhone();
        sp.makeCall("9876543210");
        sp.takePhoto();
        sp.playMusic("Shape of You");

        // Amphibian example
        Amphibian frog = new Amphibian();
        frog.walkOnLand();
        frog.swimInWater();

        // Suzuki Car example
        Suzuki swift = new Suzuki();
        swift.drive();
        swift.playMusic("Despacito");
    }

