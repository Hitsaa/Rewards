package rewards

class OrderItem {
    Integer qty
    Float total
    static belongsTo = [order:Orders, product:Product]
    static constraints = {
    }
}
