package com.Abstraction;

public class Practice6M {
//    Create an abstract class named LearningModule.
//    Add a concrete method startSession() that prints a starting message.
//    Declare an abstract method completeTask() returning boolean.
//    Create a subclass named CodingModule that extends LearningModule.
//    Implement completeTask() to return true.
//    In main(), create a CodingModule object and call both methods.
//    Create a LearningModule reference that points to the same CodingModule object,
//           then call both methods through that reference.
//    Explain why an abstract-class reference can point to a concrete subclass object,
//          and why the object cannot be created directly from LearningModule.
    public static void main(String[] args) {
        LearningModule codMo=new CodingModule();
        codMo.startSession();
        System.out.println(codMo.completeTask());
    }
}
abstract class LearningModule{
    void startSession(){
        System.out.println("Starting Session");
    }
    abstract boolean completeTask();
}
class CodingModule extends LearningModule{
    @Override
    boolean completeTask() {
        return true;
    }
}