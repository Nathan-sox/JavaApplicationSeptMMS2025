import java.util.ArrayList;

public class Member {
    private String name;
    private int age;
    private String dateJoined;

    private static ArrayList<Member> members = new ArrayList<>();

    private Member(String name, int age, String dateJoined){
        this.name = name;
        this.age = age;
        this.dateJoined = dateJoined;
    }

    public static void addMemeber(String name, int age, String dateJoined){
        members.add(new Member(name, age, dateJoined));
    }

    static void displayMembers(){
        for(Member member : members){
            System.out.printf("Member Name: " + member.name
            + "%nAge: " + member.age
            + "%nDate Joined: " + member.dateJoined);
            System.out.println();
        }
    }

}
