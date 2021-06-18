package rewards

class WhiteboardController {

    def index() { }

    def variables() {
        def myTotal = 1;
        render ("Total : " + myTotal)
        render ("</br> class : " + myTotal.class)

        def firstName = "Mike"
        render("</br>Name : " + firstName + " ${firstName.length()}")
        render ("</br> class : " + firstName.class)

        def today = new Date("06/16/2021")
        render("</br>Today : " + today)
        render ("</br> class : " + today.class)
        render ("</br> Today is ${new Date()}")

        myTotal = myTotal + 10
        def welcomeMessage = ""
        if(myTotal >=4){
            welcomeMessage = "</br>This is greater than 4"
        }
        else{
            welcomeMessage = "</br>This is smaller than 4"
        }

        render(welcomeMessage)
        myTotal -= 8

        if(myTotal >=4){
            welcomeMessage = "</br>This is greater than 4"
        }
        else{
            welcomeMessage = "</br>This is smaller than 4"
        }

        render(welcomeMessage)

    }

    def calculationsService = CalculationsService;
    def conditions() {
        def welcomeMessage = calculationsService.welcome(params)

        render(welcomeMessage)
    }

}
