package rewards

class Customer {
    String  firstName
    String lastName
    Long phone
    String email
    Integer totalPoints
    static hasMany = [awards:Award, orders:Orders]

    static constraints = {
        firstName(size: 1..10)
        lastName(nullable: true, maxSize: 10)
        phone(max: 9999999999)
        email(email: true)
        totalPoints()
    }
}
