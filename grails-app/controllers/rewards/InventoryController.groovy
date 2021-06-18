package rewards

class InventoryController {

    def index() {
        render"here is a list of everything"
    }

    def remove() {
        render"start removing one by one"
    }

    def edit() {
        def productName="Breakfast blend"
        def sku = "BB01"
        [product:productName, sku:sku]
    }

    def list() {
        def allProducts = Product.list()
        [allProducts: allProducts]
    }
}
