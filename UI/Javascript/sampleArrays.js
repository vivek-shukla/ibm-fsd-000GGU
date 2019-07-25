const welcome= ()=>{
    alert('Welcome ');
    console.log('Hello');
}

const emps = [
    {
        id:1,
        name:"ram",
        email:"ram@email",
        organisation:'IBM'
    },
    {
        id:2,
        name:"murli",
        email:"shyam@ymail",
        organisation:'IBM'
    },
    {
        id:3,
        name:"dhanush",
        email:"dhanush@hotstarS",
        organisation:'CTS'
    }
]

// function loadEmployees()
const loadEmployees = () =>{  
    
    let rows=''; 
    // traverse the array 
    // pass function as parameter }
emps.forEach((employee)=>
{
     rows += `<tr> <td>${employee.id}</td> 
    <td> ${employee.name}</td> 
    <td> ${employee.email}</td>
    <td> ${employee.organisation} </td>
    </tr>` 
})
    

    let table=`<table>
    <tr>
        <th>id

        </th>
        <th>
            name
        </th>
        <th>
            email
        </th>
    </tr> 
     ${rows} 

</table>`; 
document.getElementById("div-emps").innerHTML  = table;
 
}

// const filterEmps = () => {
//     let rows= '';
//     searchCriteria = document.getElementById("search");
//     emps.filter((emp)=>{
//         return emp.name == searchCriteria;
//     }).forEach((e)=>{
//         console.log(e);
//     })
// } 

const filterOrg = () =>
{
      let rows = ' ';
      searchCriteria = document.getElementById("searchOrg").nodeValue;
      emps.filter((emp)=>{
        return emp.name == searchCriteria;
        }).forEach((e)=>{
        console.log(e);
      }) 
} 

const sortSample = () => {
    let sample  = [12,14,15,7]
    sample.sort((first,second)=>{
        if(first > second ) {
            return 1;
        }
        else if(first < second)
        {
            return -1;
        }
        else {
            return 0;
        }
    } )

} 
sortSample();

/// for local storage 
const saveLocalStorage =() => {
    localStorage.setItem("message","hello comrade")
}
saveLocalStorage();





