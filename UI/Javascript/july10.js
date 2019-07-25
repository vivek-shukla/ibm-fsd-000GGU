// const emps = [

//     {

//         id : 1,

//         name : 'Ram',

//         email: 'ram@gg.com',

//         organization: 'IBM',
//         sal: 100

//     },

//     {

//         id : 2,

//         name : 'Shyam',

//         email: 'shyam@gg.com',

//         organization: 'IBM',
//         sal: 100

//     },

//     {

//         id : 3,

//         name : 'Gabbar',

//         email: 'gabbar@gg.com',

//         organization: 'CTS',
//         sal: 100

//     },

//     {

//         id : 4,

//         name : 'Adams',

//         email: 'adam@gg.com',

//         organization: 'LnT',
//         sal: 100

//     },

//     {

//         id : 5,

//         name : 'John',

//         email: 'john@gg.com',

//         organization: 'Target',
//         sal: 100

//     }

// ]; 
// let groupByOrg = emps.reduceRight((acc,emp1)=>{
//     let key = emp1['organization'];
//     if(!acc[key]) {
//         acc[key] =[];
//     }
//     acc[key].push(emp1)
//     return acc;
// },{})
// console.log(groupByOrg)

// let salTotal = emps.reduce((emp1,emp2)=>{
//         emp1= emp1+emp2.sal;
//         return emp1
// },0); 
// console.log(salTotal)

// classes 

// class sample { 
//     // constructor() {
//     //     console.log("object created")
//     // }
//     constructor(id,name) {
//         // use this keyword 
//         this.id = id;
//         this.name = name;

//     }
//     sayHello() {
//         console.log("Hello ",this.id)
//     }
    
// }

// const sampleObj = new sample(10,'vivek');
// sampleObj.sayHello()
// sampleObj.id= 90
// console.log(sampleObj.id)

// const Employee = class { 
//     constructor(id, name, organization) {
//         this.id= id;
//         this.name = name;
//         this.organization = organization;
//     }
//     getEmployee() {
//         return this.id + ' ' + this.name;     
//         }
//     }
// emp1 = new Employee(10,'name','gy')
// console.log(emp1.getEmployee())
// emp1.address = "bharaw"
// console.log(emp1.address)

class Employee { 
    // constructor(id,name,email) {
    //     this.id = id;
    //     this.name = name;
    //     this.email = email;
    // }
    getValue()
    {    
        alert("Enter new Details ") 
        this.id = document.getElementById("i").value;
       this.name = document.getElementById("name").value;
       this.email = document.getElementById("em").value;


    } 
    getDelKey()
    {
        this.del = document.getElementById('del').value;
    }
    saveEmployee() 
    {    
        alert("new deatails are submitting")
        // localStorage.setItem(this.id,`${this.id},${this.name},${this.email}`);
        localStorage.setItem(this.id,JSON.stringify({
            id: this.id,
            name: this.name,
            email: this.email
        }));
        // if (localStorage.getItem('Employee')) { 
        //     this.employeeStorage =JSON.parse(localStorage.getItem("Employee"));  
        // }
        // else { 
        //     this.employeeStorage = [];
        // } 
        // localStorage.setItem("Employee",JSON.stringify(this.employeeStorage));
    }
    
    deleteEmployee() 

    {   console.log("inside deleteEmployee")
        this.del = document.getElementById('del').value;
        // console.log(this.del)
        // console.log(Object.keys(localStorage))
        Object.keys(localStorage).forEach((key)=>{
            console.log(key)   
            if(this.del==key) { 
                console.log("howdy")
                localStorage.removeItem(key)
            }
        }) 

    
    }

    editEmployee() 
    {
        this.del = document.getElementById('edit').value;
        alert("Enter New Details and Submit")
        Object.keys(localStorage).forEach((key)=>{
            console.log(key) 
              
            if(this.edit==key) { 
                console.log("inside id match")
                // alert("Enter New Details and Submit")
                this.getValue()
                this.saveEmployee() 
            }
        })    

    }

    showTable() { 
        let row = ' ' 
        this.allEmps = [] 
        Object.keys(localStorage).forEach((key)=> {

            this.allEmps.push(JSON.parse(localStorage.getItem(key)))} 

        )
        console.log(this.allEmps);
    }
    
//     deleteEmployee()
    
// {
//     this.del_i = document.getElementById('del').value; 
//     key = Object.keys; 
//     // console.log(emps);
//       i=0;
//      for(item of emps) {  
//          console.log(item)
//          console.log(item.emp_id)
//          console.log("inside for loop ")

//          if(item.emp_id==del_i)
//             { 
//                 emps.splice(i,1);
       
//             } 
 
//          i++;
//      } 
//     }
}

  
function store()
{
     

    emps = new Employee()
    emps.getValue()
    emps.saveEmployee()
    
    // if (localStorage.getItem('Employee')) { 
    //     employeeStorage =JSON.parse(localStorage.getItem("Employee"));  
    // }
    // else {
    //     let employeeStorage = [];
    // }
    // employeeStorage.push(emps)
    // localStorage.setItem("Employee",JSON.stringify(employeeStorage));
    // showTable();
    // localStorage.setItem("name",`${emp_name.value}`);
    // localStorage.setItem("email",`${emp_email.value}`);  
    // table = "<"

  
}
function dele()
{
    emps = new Employee();
    emps.deleteEmployee();
    emps.showTable();
}
function edit()
{
    emps = new Employee();
    emps.editEmployee();
}