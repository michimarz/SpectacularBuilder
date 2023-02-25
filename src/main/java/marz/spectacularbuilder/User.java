
package marz.spectacularbuilder;

public class User {
    private String firstName;    
    private String lastName;
    private int age;
    private String phone;
    private String city;
    
    static class Builder {
        private User user;

        public Builder() {
            this.user = new User();
        }
        
        Builder firstName(String firstName) {
            this.user.firstName = firstName; 
            return this;
        }
        
        Builder lastName(String lastName) {
            this.user.lastName = lastName;
            return this;
        }
        
        Builder age(int age) {
            this.user.age = age;
            return this;
        }
        
        Builder phone(String phone) {
            this.user.phone = phone;
            return this;
        }
        
        Builder city(String city)
        {
            this.user.city = city;
            return this;
        }
        
        User build() {
            return this.user;
        }
        
    }
    
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " (" + this.age + ", " + this.city + ")"; 
    }
}
