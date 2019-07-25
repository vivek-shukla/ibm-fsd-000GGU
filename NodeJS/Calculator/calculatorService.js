class Calculator {
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
    sqr(i) {
        return i*i
    } 
    sqrt (j) {
        return Math.round(Math.sqrt(j))
    }
}

module.exports.calculatorClass = Calculator