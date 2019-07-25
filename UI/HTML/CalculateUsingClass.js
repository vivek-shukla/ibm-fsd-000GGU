class calculate {
     
     first 
     second 
     op
     row = ''
     
     showOnScreen (id)  { 
        this.row = this.row+id; 
        document.getElementById('input').value = row;    
    }   
    clearScreen() 
{   
    document.getElementById('input').value='' 
    this.row = ''
}   
     getFromScreen()
   {
    var temp = document.getElementById('input').value
    return temp;
   } 
 
  operation(op)
{
    switch(op) {
        case '*': 
        {   console.log(getFromScreen())
            first = 1 
            let var1 = parseInt(getFromScreen())
            console.log(var1)
            first = first * var1
            clearScreen() 
            console.log("M "+first) 
            flag = 1;
            row=''
            break;
        }
        case '+':
            {  
            first = first+parseInt(getFromScreen()) 
            clearScreen() 
            console.log("A "+first) 
            flag = 1;
            row=''   
            } 
    }

}