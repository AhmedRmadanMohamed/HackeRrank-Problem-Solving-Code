public class MotorCycle extends BiCycle {
    @Override
    public String define_me() {

        return "a cycle with an engine.";
    }


    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + this.define_me());
        System.out.println("My ancestor is a cycle who is " + super.define_me());
    }
}
