
function store()
{
    emp_id = document.getElementById("i").value;
    emp_name = document.getElementById("name").value;
    emp_email = document.getElementById("em").value; 
    
    if (localStorage.getItem('Employee')) { 
        emps =JSON.parse(localStorage.getItem("Employee"));  
    }
    else {
        let emps = [];
    }
    emps.push({emp_id,emp_name,emp_email})
    localStorage.setItem("Employee",JSON.stringify(emps));
    showTable();
    // localStorage.setItem("name",`${emp_name.value}`);
    // localStorage.setItem("email",`${emp_email.value}`);  
    // table = "<"

  
}
 
function showTable()
{   let rows;
    emps = JSON.parse(localStorage.getItem("Employee")); 

    for(item of emps ) 
    {   
    rows +=`<tr>
    <td>${item.emp_id}</td>
    <td>${item.emp_name}</td>
    <td>${item.emp_email}</td>
    </tr>`
    } 
    
    table = `<table>
    <tr> <th> ID </th> <th> Name </th> <th> Email </th> </tr>
    ${rows} ` 
    document.getElementById('msg').innerHTML=table;
} 

function dele()
{
    del_i = document.getElementById('del').value; 
    emps = JSON.parse(localStorage.getItem("Employee")); 
    // console.log(emps);
      i=0;
     for(item of emps) {  
         console.log(item)
         console.log(item.emp_id)
         console.log("inside for loop ")

         if(item.emp_id==del_i)
            { 
                emps.splice(i,1);
       
            } 
 
         i++;
     } 
     localStorage.setItem("Employee",JSON.stringify(emps));
     showTable();
    
}

