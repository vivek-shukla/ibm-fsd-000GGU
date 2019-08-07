// posiible function or possible class 
var Taycan = {
    id: 1,
    fuelType: 'diesel',
    formula1: false,
    airbags: true
};
var KTM = {
    id: 2,
    fuelType: 'patrol',
    ignitionType: 'Fully Electronic Ignition'
};
var auto = /** @class */ (function () {
    function auto(automobileType) {
        this.automobileType = automobileType;
    }
    auto.prototype.getSpecification = function () {
        return this.automobileType;
    };
    return auto;
}());
var newCarObj = new auto(Taycan);
console.log(newCarObj.getSpecification());
var newBikeObj = new auto(KTM);
console.log(newBikeObj.getSpecification());
