public class Person {

    private String name;
    private int age;
    private String gender;
    private boolean married;
    private int child;

    public Person(String name, int age, String gender, boolean married, int child) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        this.child = child;
    }
    public String toString() {
        return String.format("나이는%d살, 이름은%s이라는%c자가있습니다.\n" +
                        "이%c자는결혼을%s고자식이%d명있습니다.\n",
                age, name, gender, gender, (married? "했" : "안했"), child);
    }



}


