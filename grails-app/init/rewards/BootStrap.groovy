package rewards

class BootStrap {

    def init = { servletContext ->
        new Product(name: "Breakfast Blend", sku: "BB01", price: 199.00).save()
        new Product(name: "Morning Blend", sku: "MB01", price: 19.00).save()
    }
    def destroy = {
    }
}
