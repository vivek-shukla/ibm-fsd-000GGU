const calculate = (first,second) => {
    try {  

        if(second==0) {
            throw new Error('Division by zero')
        }else {
            sum = first/second 
        }

    }
    catch(error) {
        console.log(error);
        sum = first/1
    }
    return sum;
        
}

console.log("sum is ",calculate(10,0));
