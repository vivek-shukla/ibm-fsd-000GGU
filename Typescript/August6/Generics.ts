// posiible function or possible class 

interface automobile {
    id: number,
    fuelType: string
}

interface car extends automobile {
    formula1:boolean,
    airbags: boolean
}

interface bike extends automobile {
    ignitionType: string
}

const Taycan:car = {
    id: 1,
    fuelType:'diesel',
    formula1: false,
    airbags: true
}

const KTM: bike = {
    id:2,
    fuelType: 'patrol',
    ignitionType: 'Fully Electronic Ignition'
}

class auto <T extends automobile> {
    automobileType: T
    constructor(automobileType:T)
    {
        this.automobileType = automobileType
    }

    getSpecification():T { 

        return this.automobileType
        
    }
}

const newCarObj =  new auto<car>(Taycan)
console.log(newCarObj.getSpecification())
const newBikeObj =  new auto<bike>(KTM)
console.log(newBikeObj.getSpecification())

