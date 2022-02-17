import java.text.DecimalFormat

/**************************************************************
 *  Main program for MAD-105 Inheritance Assignment due 28-Feb-2022
 *  Calculates the cost of Lawn Maintenance for either Commercial or
 *  Residential customers.
 *
 *  @author:  Al Jette
 *  Date:  17-Feb-2022
 *
 *  @param
 *  Mods:
 **************************************************************/

fun main() {
    // Define current rates (fixed values) and customer(s)
    val currentCommercialRate: Double = 5.00
    val currentResidentialRate:Double = 6.00
    val Dollar = DecimalFormat("$###,###.00")
    var cust1 = customer("Jane", "555-Cust1", "1 Cust Street", 1000.00)
    var cust2 = commercial("Menards", currentCommercialRate, 1, "Bill", "555-Cust2", "2 Cust St", 10000.00)
    var cust3 = residential(currentResidentialRate, senior = true, "Fred", "555-Cust3", "3 Cust St", 3000.00)
    var cust4 = residential(currentResidentialRate, senior = false, "Barney", "555-Cust4", "4 Cust St", 3000.00)

    // Other variables in main
    var quote: Double = 0.00

    cust2.calculate()
    cust3.calculate()
    quote = cust4.calculate()

    println("Quote for ${cust4.customerName} is: " + Dollar.format(quote))
}