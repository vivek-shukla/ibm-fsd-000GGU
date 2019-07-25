class employee {
     
    setValue(id,name,email,designation) {
        this.id= id;
        this.name=name;
        this.email=email;
        this.designation=designation;
    } 
    addToLocalStorage()
    {
        localStorage.setItem(this.email,JSON.stringify({
            eId: this.id,
            eName: this.name,
            eEmail:this.email,
            eDesignation: this.designation
        }))
    } 
    buildTable() 
    {   let rows = ''
        let empArray = []
        Object.keys(localStorage).forEach((empKey)=>{ 
            console.log(empKey)
            empArray.push(JSON.parse(localStorage.getItem(empKey)) )
        })
        console.log(empArray) 
        empArray.forEach((emp)=>{
            rows +=`<tr>
            <td>${emp.eId}</td>
            <td>${emp.eName}</td>
            <td>${emp.eEmail}</td>
            <td>${emp.eDesignation}</td>
            <td><a href="#" onclick="deleteEmployee('${emp.eEmail}')"> delete </a></td>
            <td><a href="#" onclick="editEmployee('${emp.eEmail}')"> Edit </a></td>
        </tr>`
        }) 
        document.getElementById('emp-details').innerHTML=rows;

    } 

    deleteFromLocalStorage(eEmail) 

    {   
        localStorage.removeItem(eEmail);
        // let rows = ''
        // let empArray = [] 
        // let delKey = document.getElementById('delEmail').value;
        // Object.keys(localStorage).forEach((empKey)=>{ 
        //     if(empKey==delEmp.eEmail) {
        //         localStorage.removeItem(empKey)
        //     } 
        // } ) 
        // // console.log(empArray) 
        // this.buildTable()
        // empArray.forEach((emp)=>{
        //     rows +=`<tr>
        //     <td>${emp.eId}</td>
        //     <td>${emp.eName}</td>
        //     <td>${emp.eMail}</td>
        //     <td>${emp.eDesignation}</td>
        // </tr>`
        // }) 
        // document.getElementById('emp-details').innerHTML=rows;
    }  
     editEmployeeInLocalStorage(eEmail)
     {
          Object.keys(localStorage).forEach((key)=>{ 
              if(eEmail==key) { 
                  let empFound = JSON.parse(localStorage.getItem(eEmail))
                  document.getElementById('eId').value = empFound.eId;
                  document.getElementById('eName').value = empFound.eName;
                  document.getElementById('eEmail').value = empFound.eEmail;
                  document.getElementById('eDesignation').value = empFound.eDesignation; 
                  document.getElementById('eEmail').readOnly = true;
              }

          })
     }

     sortingEmployee(sortIn) { 
        let empArray = []
        Object.keys(localStorage).forEach((empKey)=>{ 
            // console.log(empKey)
            empArray.push(JSON.parse(localStorage.getItem(empKey)) )
        })
        console.log(empArray)
        empArray = empArray.sort((emp1,emp2)=>{
            if(sortIn=='Asc') { 
                console.log("Inside Asc")
                if((emp1.eId)<(emp2.eId)) {
                    return -1
                }
                else if((emp1.eId)>(emp2.eId)) {
                    return 1
                }
                else {
                    return 0
                }
            } 
            if(sortIn=='Dsc') {
                if(emp1.eId<emp2.eId) {
                    return 1
                }
                else if(emp1.eId>emp2.eId) {
                    return -1
                }
                else {
                    return 0
                }
            }
        }) 

        console.log(empArray) 
        let sortedRow = ' ' 
        empArray.forEach((emp)=>{
        
             sortedRow +=`<tr>
            <td>${emp.eId}</td>
            <td>${emp.eName}</td>
            <td>${emp.eEmail}</td>
            <td>${emp.eDesignation}</td>
            <td><a href="#" onclick="deleteEmployee('${emp.eEmail}')"> delete </a></td>
            <td><a href="#" onclick="editEmployee('${emp.eEmail}')"> Edit </a></td>
        </tr>`
        }) 
        document.getElementById('emp-details').innerHTML= sortedRow;


     }

}

function saveEmployee() {
    emp = new employee()
    emp.setValue(
        parseInt(document.getElementById('eId').value),
        document.getElementById('eName').value,
        document.getElementById('eEmail').value,
        document.getElementById('eDesignation').value
    )
    emp.addToLocalStorage()
    emp.buildTable()

}

function deleteEmployee(eEmail) { 
    emp = new employee()
    emp.deleteFromLocalStorage(eEmail)
    emp.buildTable() 

} 

function editEmployee(eEmail)  {
    emp = new employee() 
    emp.editEmployeeInLocalStorage(eEmail)
    emp.buildTable()


}

function loadEmployeeTable () {
    emp = new employee()
    emp.buildTable()
} 

function sortEmployees(sortIn) {
    emp = new employee()
    emp.sortingEmployee(sortIn)
    // emp.buildTable() 
}