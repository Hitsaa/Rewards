package rewards

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {
        def firstName = params.first
        def totalPoints = params.points.toInteger()

        def welcomeMessage = ""
        switch (totalPoints){
            case 5:
                welcomeMessage = "This is ${totalPoints} and ${firstName}"
                break
            case 4:
                welcomeMessage = "This is ${totalPoints} and ${firstName}"
                break
            case 1..3:
                welcomeMessage = "Range in 1 to ${totalPoints} and ${firstName}"
                break
            default:
                welcomeMessage = "This is default and ${firstName}"
                break
        }
    }

    def processCheckin(lookupInstance){
        //lookup customer by phone number
        def customerInstance = Customer.findByPhone(lookupInstance.phone)
        //set up new customer
        if(customerInstance == null){
            customerInstance = lookupInstance
            customerInstance.firstName = "Customer"
        }
        //calculate current award and total points
        def totalAwards =0
        customerInstance.awards.each {
            totalAwards = totalAwards + it.points
        }
        customerInstance.totalPoints = totalAwards
        //create welcome message according to points
        def welcomeMessage = "welcome Back"
        switch (totalAwards){
            case 5:
                welcomeMessage = "This is ${totalAwards+1} and ${customerInstance.firstName}"
                break
            case 4:
                welcomeMessage = "This is ${totalAwards+1} and ${customerInstance.firstName}"
                break
            case 1..3:
                welcomeMessage = "Range in 1 to ${totalAwards+1} and ${customerInstance.firstName}"
                break
            default:
                welcomeMessage = "This is default and ${customerInstance.firstName}"
                break
        }
        if(totalAwards < 5){
            customerInstance.addToAwards(new Award(awardDate: new Date(), type: "Purchase", points: 1))
        }
        else{
            customerInstance.addToAwards(new Award(awardDate: new Date(), type: "Reward", points: -5))
        }
        // save customer
        customerInstance.save()
        return [customerInstance, welcomeMessage]
    }
}
