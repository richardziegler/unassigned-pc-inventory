package pcinventory

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Computer {


    Manufacturer manufacturer
    Model model
    String serial
    String previousUser
    String previousMachineName
    String status


    static constraints = {
    }
}
