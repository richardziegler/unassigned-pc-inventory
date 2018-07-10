package pcinventory

import javax.transaction.Status

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Computer {


    Manufacturer manufacturer
    Model model
    String serial
    String previousUser
    String previousMachineName
    String status


    static constraints = {
        status inList: ['Pending Wipe', 'Wiped', 'Prepped']
    }
}
