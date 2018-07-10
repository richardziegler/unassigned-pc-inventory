package pcinventory

import javax.transaction.Status

class BootStrap {

    def init = { servletContext ->
//        def dell = new Manufacturer(name: 'Dell').save()
//        def microsoft = new Manufacturer(name: 'Microsoft').save()
//
//        def le6540 = new Model(name: 'LE6540', make: dell).save()
//        def surfacePro2017 = new Model(name: 'Surface Pro 2017', manufacturer: microsoft).save()
//        def surfaceBook1 = new Model(name: 'Surface Book', manufacturer: microsoft).save()
//        def surfaceBook2 = new Model(name: 'Surface Book 2', manufacturer: microsoft).save()
//
//        new Computer(manufacturer: dell, model: le6540, serial: 'D82GY3L', previousUser: 'Tom Reed',
//                previousMachineName: 'LE6540-D82GY3L', status: 'Pending Wipe').save()
//        new Computer(manufacturer: microsoft, model: surfaceBook1, serial: '230948230498', previousUser: 'Nick Hugeback',
//                previousMachineName: 'NHugeback-SB', status: 'Pending Wipe').save()
//        new Computer(manufacturer: microsoft, model: surfaceBook2, serial: '230993748221', previousUser: 'Ro Hamilton',
//                previousMachineName: 'RHamilton-SB2', status: 'Wiped').save()
//        new Computer(manufacturer: microsoft, model: surfacePro2017, serial: '394857102933', previousUser: 'Laura Hogan',
//                previousMachineName: 'LHogan-SP17', status: 'Prepped').save()
    }
    def destroy = {
    }
}

