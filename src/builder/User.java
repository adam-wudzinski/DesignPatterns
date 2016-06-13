package builder;


public class User {
    private String firstName;
    private String secondName;
    private String gender;
    private int age;
    private int phone;

    private User(UserBuilder builder) {
        firstName = builder.firstName;
        secondName = builder.secondName;
        gender = builder.gender;
        age = builder.age;
        phone = builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public static class UserBuilder {
        private String firstName;
        private String secondName;
        private String gender;
        private int age;
        private int phone;

        public UserBuilder(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(int phone) {
            this.phone = phone;
            return this;
        }

        public User build(){
            User user = new User(this);
            if(user.age < 0)
                throw new IllegalArgumentException("Age cannot be negative!");
            return user;
        }

    }
}
