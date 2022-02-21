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
    var cust_commercial = commercial("xx", currentCommercialRate, "", "cc", "555", "zz", 100.00)
    var cust_residential = residential(currentResidentialRate, senior = false, "rc", "666", "zz", 0.00)
//    var cust1 = customer("Jane", "555-Cust1", "1 Cust Street", 1000.00)
//    var cust2 = commercial("Menards", currentCommercialRate, "y", "Bill", "555-Cust2", "2 Cust St", 10000.00)
//    var cust3 = residential(currentResidentialRate, senior = true, "Fred", "555-Cust3", "3 Cust St", 3000.00)
//    var cust4 = residential(currentResidentialRate, senior = false, "Barney", "555-Cust4", "4 Cust St", 3000.00)

    // Other variables in main
    var quote: Double = 0.00
    var choice: Int = 0

//    cust2.calculate()
//    cust3.calculate()
//    quote = cust4.calculate()

//    println("Quote for ${cust4.customerName} is: " + Dollar.format(quote))

    while (choice != 3) {
        print("Quote for a Commerical customer (1), Residential customer (2), or quit (3) ... (enter 1, 2 or 3): ")
        choice = readLine()!!.toInt()

// Choice = 1 for Commercial Customers, get keyboard entry, get cost to maintain lawn, print quote
        if (choice == 1) {
            print("  Customer Name: ")
            cust_commercial.customerName = readLine()!!.toString()
            print("  Customer Phone: ")
            cust_commercial.customerPhone = readLine()!!.toString()
            print("  Customer Address: ")
            cust_commercial.customerAddress = readLine()!!.toString()
            print("  Square footage of the property: ")
            cust_commercial.squareFootage = readLine()!!.toDouble()
            print("  Property name: ")
            cust_commercial.propertyName = readLine()!!.toString()
            print("  Do we maintain multiple properties for this customer (enter y or n): ")
            cust_commercial.multipleProperty = readLine()!!.toString()

            quote = cust_commercial.calculate()

            println("*** Text below printed from Main - QUOTE ***")
            println("Business Customer Contact: ${cust_commercial.customerName}")
            println("  Business Name: ${cust_commercial.propertyName}")
            println("  Address: ${cust_commercial.customerAddress}    Phone: ${cust_commercial.customerPhone}")
            println("  Square Footage: ${cust_commercial.squareFootage},  Multi-property discount: ${cust_commercial.multipleProperty}")
            println("  Weekly Maintenance cost: " + Dollar.format(quote))
            println()

// Choice = 2 for Residential Customers, get keyboard entry, get cost to maintain lawn, print quote
        } else if (choice == 2) {
            print("  Customer Name: ")
            cust_residential.customerName = readLine()!!.toString()
            print("  Customer Phone: ")
            cust_residential.customerPhone = readLine()!!.toString()
            print("  Customer Address: ")
            cust_residential.customerAddress = readLine()!!.toString()
            print("  Square footage of the property: ")
            cust_residential.squareFootage = readLine()!!.toDouble()
            print("  Senior Discount (enter true or false): ")
            cust_residential.senior = readLine()!!.toBoolean()

            quote = cust_residential.calculate()

            println("*** Text below printed from Main - QUOTE***")
            println("Residential Customer: ${cust_residential.customerName}")
            println("  Address: ${cust_residential.customerAddress}    Phone: ${cust_residential.customerPhone}")
            println("  Square Footage: ${cust_residential.squareFootage},  Senior discount: ${cust_residential.senior}")
            println("  Weekly Maintenance cost: " + Dollar.format(quote))
            println()

        } else if(choice !=3) println("Invalid Choice")
    }
}