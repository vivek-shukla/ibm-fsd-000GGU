function clickMe()
{   var engMarks = document.getElementById("e")
var mathMarks= document.getElementById("m")
var csMarks= document.getElementById("c") 
engColor = "green"
mathColor= "green"
csColor = "green"

if(engMarks.value<60) 
{
   engColor='red'
} 
if(mathMarks.value<60) 
{
   mathColor='red'
}
if(csMarks.value<60) 
{
   csColor='red'
}

    var table = `<table> 
                <tr> <th> Subject  </th>  <th> Max Marks </th>  <th> Marks Obtained </th></tr>
                <tr style="color:${engColor}"> <td>English </td><td> 100 </td><td> ${engMarks.value} </td> </tr> 
                <tr style="color:${mathColor}"> <td>Math </td><td> 100 </td><td> ${mathMarks.value} </td> </tr> 
                <tr style="color:${csColor}"> <td>CS </td><td> 100 </td><td> ${csMarks.value} </td> </tr> </table>`
    document.getElementById("msg").innerHTML = table;  

}

