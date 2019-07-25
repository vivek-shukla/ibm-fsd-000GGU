var row = ''
var flag = 0 
var first = 0
var second 
var lastOp = -1
function showOnScreen (id)  { 
    row = row+id; 
    document.getElementById('input').value = row; 
    
}  
function clearScreen() 
{
    document.getElementById('input').value='' 
    row = ''
}
function getFromScreen()
{
    var temp = document.getElementById('input').value
    return temp;
}
function operation(op) 
{   if(flag==0) {
    first = parseInt(getFromScreen())
    clearScreen()
    if(op=='*') {
        lastOp = 0
    }
    else if ( op == '+') {
        lastOp = 1
    }
    else if (op == '-') {
        lastOp = 2
    }
    else {
        lastOp = 3
    }
    flag=1
  } else { 
      console.log("inside else")
    switch(op) {
        case '*': 
        {   second = parseInt(getFromScreen())
            first = first * second
            clearScreen()
            console.log(first)
            lastOp=0;
            break;
        }
        case '+':
            {  
            second = parseInt(getFromScreen())
            first = first + second
            clearScreen() 
            console.log(first)
            lastOp=1; 
            break; 
            } 
        case '-':
            {   
                second = parseInt(getFromScreen())
                first = first - second;
                clearScreen()
                console.log(first)
                lastOp=2;
                break;
            }
        case '/':
                {  
                second = parseInt(getFromScreen())
                 first = first / second;
                 clearScreen()
                 console.log(first)
                 lastOp=3;
                 break;
                }

    }
}
}
function showResult() { 
           
    second = parseInt(getFromScreen())
    if(lastOp==0) 
    {
        first=first*second;
    } 
    else if(lastOp==1)
    {
        first=first+second;
    }
    else if(lastOp==2) {
        first=first-second
    }
    else {
        first=first/second
    }
    console.log(first) 
    document.getElementById('input').value = JSON.stringify(first)

}
    
    

