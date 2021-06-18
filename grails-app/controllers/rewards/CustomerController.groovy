package rewards

class CustomerController {
    def calculationsService = CalculationsService
    static scaffold = Customer
//    def index() {
//        params.max = 10
//        [customerInstanceList: Customer.list(params), customerInstanceCount: Customer.count()]
//    }

    def check_in(){ }

    def customerLookup(Customer lookupInstance){
        def (customerInstance,welcomeMessage ) = calculationsService.processCheckin(lookupInstance)
        render (view:"check_in", model: [customerInstance: customerInstance, welcomeMessage: welcomeMessage])
        // query customer by phone #
        // if no result,
        // create a new customer
        // add award record
        // save customer
        // send welcome to kiosk

        // if customer found then,
        // calculate total points
        // create welcome message
        // add award record
        // save customer
        // send welcome to kiosk

    }
    def lookup(){
        def customerInstance = Customer.list()
        [customerInstanceList: customerInstance]
    }

    def profile() {
        def customerInstance = Customer.findByPhone(params.id)
        [customerInstance: customerInstance]
    }
}
