public class Librarian{
    private String name;

    public Librarian(String name){
        this.name = name;
    }

    public void registerMember(String name, int age, String dateJoined){
        Member.addMemeber(name, age, dateJoined);
    }
}