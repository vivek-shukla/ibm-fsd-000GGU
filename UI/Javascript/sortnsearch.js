const emps = [

    {

        id : 1,

        name : 'Ram',

        email: 'ram@gg.com',

        organization: 'IBM'

    },

    {

        id : 2,

        name : 'Shyam',

        email: 'shyam@gg.com',

        organization: 'IBM'

    },

    {

        id : 3,

        name : 'Gabbar',

        email: 'gabbar@gg.com',

        organization: 'CTS'

    },

    {

        id : 4,

        name : 'Adams',

        email: 'adam@gg.com',

        organization: 'LnT'

    },

    {

        id : 5,

        name : 'John',

        email: 'john@gg.com',

        organization: 'Target'

    }

]; 

function addRow(emp) {
    return `<tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.email}</td>
    <td>${emp.organization}</td>
</tr> `
}

function addTable(row) {
    table = `<table>
    <tr>
    <th><a href="#" onclick="sortEmployee('ID')">Id</a></th>

    <th><a href="#" onclick="sortEmployee('NAME')">Name</a></th>

    <th>Email</th>

    <th><a href="#" onclick="sortEmployee('ORG')">Organization</a></th>
    </tr> 
    ${row}
</table>
`
document.getElementById('msg').innerHTML=table;
} 
function load() {  
    let row=' ';
    emps.forEach((emp)=>{
        row += addRow(emp);
    })
    addTable(row);


}
load(); 

function search() { 
    let empSet = [];
    enter_id = document.getElementById('searchById').value 
    emps.forEach((emp)=>{
        if(enter_id==emp.id) {
            empSet.push(emp);
        }
    })
    let row='';
    empSet.forEach((e)=>{
        row += addRow(e);
    })
    addTable(row);
    
}

function sortEmployee(sortBy) {
    let bum = emps;
    let rows='';

    if (sortBy=='ID') {
        bum.sort((emp1,emp2)=>{
            if(emp1.id<emp2.id) {
                return 1;
            }
            else if(emp1.id>emp2.id) {
                return -1;
            }
            else
            {
                return 0;
            }
        }).forEach((e)=>{
            rows +=addRow(e)
            addTable(rows);
        }) 
    }
    else if(sortBy == 'NAME') { 
        bum.sort((emp1,emp2)=>{
            if(emp1.name<emp2.name) {
                return 1;
            }
            else if(emp1.name>emp2.name) {
                return -1;
            }
            else
            {
                return 0;
            }
        }).forEach((e)=>{
            rows +=addRow(e)
            addTable(rows);
        }) 
      }
      else {
        bum.sort((emp1,emp2)=>{
            if(emp1.organization<emp2.organization) {
                return 1;
            }
            else if(emp1.organization>emp2.organization) {
                return -1;
            }
            else
            {
                return 0;
            }
        }).forEach((e)=>{
            rows +=addRow(e)
            addTable(rows);
        }) 
      }
        
    }


// // date 10/07/19

// const nums = [1,2,3,4]
// const res = nums.reduce((pre,cur)=>{
//     return pre+cur
// })
// console.log(res)

// var employee = [
//     {
//         id: 1,
//         name: "vivek",
//         salary: 100
//     }
//     ,
//     {
//         id:2,
//         salary:200
//     },
//     {
//         id:3,
//         salary:400
//     }

// ];
// var total = employee.reduce((emp1,emp2)=>{ 
//     if(emp1.salary == undefined || emp1.salary== NaN) {
//         emp1.salary=0;
//     }
//     return emp1.salary + emp2.salary
// })
// console.log(total)  

let groupByOrg = emps.reduceRight((acc,emp1)=>{
    let key = emp1['organization'];
    if(!acc[key]) {
        acc[key] =[];
    }
    acc[key].push(emp1)
    return acc;
},{})
console.log(groupByOrg)
