public class Member {
    String nameMember;
    int age;
    int workoutHours;
    double membershipFee;

    void totalCost() {
        if (workoutHours > 15) {
            membershipFee -=(membershipFee * 0.10) ;
        }
        System.out.println("Total Cost of this Member is: " + (workoutHours * membershipFee));
    }

    void print() {
        System.out.println("Name: " + nameMember);
        System.out.println("Age: " + age);
        System.out.println("Workout Hours: " + workoutHours);
        System.out.println("Membership fee: " + membershipFee);
    }
}
