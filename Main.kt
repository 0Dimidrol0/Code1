fun main() {
    val banksOperatorName: String = "Susan"
    val customerName: String = "Karen"
    val customerSurname: String = "Melkonyan"
    var customerAge: Byte = 33
    var customerMonthIncome: Int = 600000
    var bankProgramLimit: Int = 50000000
    val moneyType: String = "amd"
    val country: String = "Dilijan"
    var monthpayment: Double = 151000.98
    var remainMoney: Int = customerMonthIncome - monthpayment.toInt()

    var customerWorckingtype: String = "software engineer"
    var banksOPeratorText: String = ": Hi, sir. My name is Susan, how can i help you.\n"
    var customerText: String = ": Hi, mam. I want to buy house and i want to get acquainted with bank`s conditions.\n"

    print("Conversation between customer and bank`s call center operator.\n\n"+banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": No problem, sir, but first of all you need to meet our bank`s requirements. Please answer to my questions. Firstly say your name and surname?\n"
    customerText = ": My name is $customerName $customerSurname.\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": How old are you?\n"
    customerText = ": I`m $customerAge.\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": Are you married?\n"
    customerText = ": Yes.\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": Sir if you are $customerWorckingtype and your income is about $customerMonthIncome $moneyType you can use the \"For newlyweds\" program.\n"
    customerText = ": I have the exact salary.you should introduce program`s condition.\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": Good. First of all the program`s limit is $bankProgramLimit $moneyType and you must pay deposit about 10%. The annual percentage is 15%.\n"
    customerText = ": How many years i have to pay?\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": You have three choices 15,20 and 25 years.\n"
    customerText = ": What if i choose 20 years how much will be my monthly pay?\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": Nearly $monthpayment(հարյուր հիսուն մեկ հազար դրամ իննսունութ լումա)$moneyType.\n"
    customerText = ": I need to think, if i pay monthly how much will remain for the rest of month.\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": It`s about $remainMoney $moneyType sir.\n"
    customerText = ": Yes, but i have two babies and i pay the exact amount for both of them for their college.\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": Sir, where you want to buy house?\n"
    customerText = ": Near my parent`s house, they live in $country.\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": Sir, i`m sorry, but this program gives loans only for capital.\n"
    customerText = ": That`s bad. thanks anyway.\n"

    print(banksOperatorName+banksOPeratorText+customerName+customerText)

    banksOPeratorText = ": Thank you to sir.\n"

    print(banksOperatorName+banksOPeratorText)




}
