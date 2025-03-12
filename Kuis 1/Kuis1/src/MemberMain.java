public class MemberMain {
    public static void main(String[] args) {
        int total40 = 0;
        int totalmember = 0;
        Member[] memberArray = new Member[3];

        memberArray[0] = new Member();
        memberArray[0].nameMember = "Wahyu";
        memberArray[0].age = 19;
        memberArray[0].workoutHours = 16;
        memberArray[0].membershipFee = 30000;


        memberArray[1] = new Member();
        memberArray[1].nameMember = "Dana";
        memberArray[1].age = 36;
        memberArray[1].workoutHours = 7;
        memberArray[1].membershipFee = 30000;

        memberArray[2] = new Member();
        memberArray[2].nameMember = "Keenan";
        memberArray[2].age = 43;
        memberArray[2].workoutHours = 5;
        memberArray[2].membershipFee =  30000;


        for (int i = 0; i < memberArray.length; i++) {
            memberArray[i].print();
            memberArray[i].totalCost();
            System.out.println();
        }

        for (int i = 0; i < memberArray.length; i++) {
            if (memberArray[i].age > 40) {
                total40 += memberArray[i].workoutHours;
            }
        }
        System.out.println("Total workout hours of all members above 40 Years Old is: " + total40 );

        for (int i = 0; i < memberArray.length; i++) {
            if (memberArray[i].age <= 40 && memberArray[i].age >= 35) {
                totalmember++;
            }
        } 
        System.out.println("Total Members aged between 35 and 40 is: " + totalmember);
    } 
}
