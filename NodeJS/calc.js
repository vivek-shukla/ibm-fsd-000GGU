class Calculator {
    operation(i,j,op) { 
        switch(op) {
            case '+':
                return i+j
                break;
            case '-':
                return i-j
                break;
            case '*':
                return i*j
                break;
            case '/':
                return i/j
            default:
                console.log("Invalid Operator")
            
        }
    }
}
class calculate {
    add(i,j) {
        return i+j
    }
    sub(i,j) {
        return i-j
    }
    mul(i,j) {
        return i*j
    }
    div(i,j) {
        return i/j
    } 
}

module.exports = {

    Calculator

}