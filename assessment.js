<<<<<<< HEAD
class Trainer {
    
    setValue(name,email,skills) {
        this.name=name;
        this.email=email;
        this.skill=skills;
        this.slot=[0,0,0,0,0]
}
    addToLocalStorage()
    {
        localStorage.setItem(this.email,JSON.stringify({
            tName: this.name,
            tEmail:this.email,
            tSkills: this.skill,
            tSlots: this.slot
        }))
    }  
}

function saveTrainer() {
        trainer = new Trainer() 
        var skillset = []
        var checkedValue = null; 
        let inputElements= document.getElementsByName('inp');
        // console.log(inputElements)
        inputElements.forEach((ele) => {
         if(ele.checked) { 
        //    console.log(ele.value);
            checkedValue = ele.value;
           skillset.push(checkedValue);   
        }
       })   
    console.log(document.getElementById('tName').value)
        trainer.setValue(
            document.getElementById('tName').value,
            document.getElementById('tEmail').value,
            skillset
        )
        trainer.addToLocalStorage()
        alert("New Trainer Created")
        
}  

function showSlots() {
    var slotsDropDown = ''
    var availableSlots=[]
    var slotFlag = [0,0,0,0,0]
    dumClass = document.getElementById('class').value 
    if(localStorage.getItem(dumClass)==null || localStorage.getItem(dumClass)==undefined ) {
        // console.log('inside if')
        availableSlots=['1','2','3','4','5']
    }
    else 
       {
        //  console.log('inside else')
        JSON.parse(localStorage.getItem(dumClass)).forEach(localClassObject=>{ 
            // console.log(localClassObject)
            // console.log(localClassObject.slot)
        if(localClassObject.slot=='1') {
            slotFlag[0]=1
        }
        if(localClassObject.slot=='2') {
            slotFlag[1]=1
        }
        if(localClassObject.slot=='3') {
            slotFlag[2]=1
        }
        if(localClassObject.slot=='4') {
            slotFlag[3]=1
        }
        if(localClassObject.slot=='5') {
            slotFlag[4]=1
        }       
        })
        for(var i=0;i < slotFlag.length;i++) { 
            if(slotFlag[i]==0) {
                availableSlots.push(`${i+1}`)
            }

        }
         
    }
    availableSlots.forEach(slot=> {
        slotsDropDown +=`<option value="${slot}">${slot}</option>` 
     })
     document.getElementById('slot').innerHTML = slotsDropDown;

}
function showSubject() {
    var subjectDropDown = ''
    var subArray = ['English','Maths','Science','CS','Physics']
    var availableSubjects = []
    var subjectFlag = [0,0,0,0,0]
    dumClass = document.getElementById('class').value
    if(localStorage.getItem(dumClass)==null || localStorage.getItem(dumClass)==undefined ) {
        console.log('inside if')
        availableSubjects=['English','Maths','Science','CS','Physics']
    }
    else 
    {
        console.log('inside else')
        JSON.parse(localStorage.getItem(dumClass)).forEach(localClassObject=>{ 
            console.log(localClassObject)
            console.log(localClassObject.slot)
        if(localClassObject.subject=='English') {
            subjectFlag[0]=1
        }
        if(localClassObject.subject=='Maths') {
            subjectFlag[1]=1
        }
        if(localClassObject.subject=='Science') {
            subjectFlag[2]=1
        }
        if(localClassObject.subject=='CS') {
            subjectFlag[3]=1
        }
        if(localClassObject.subject=='Physics') {
            subjectFlag[4]=1
        }       
        })
        for(var i=0;i < subjectFlag.length;i++) { 
            if(subjectFlag[i]==0) {
                availableSubjects.push(subArray[i])
            }

        }
    }
    availableSubjects.forEach(subject=> {
        subjectDropDown +=`<option value="${subject}">${subject}</option>` 
     })
     document.getElementById('subject').innerHTML = subjectDropDown;
    
}


function showTrainer() {
    var trainerArray = []
    var availableTrainer = []
    var trainerDropDown = '' 
    var fSubject = 0
    var fSlot = 0

    Object.keys(localStorage).forEach(key=>
        {    console.log(key)
             if(key!='Class1' && key!='Class2') {
            trainerArray.push(JSON.parse(localStorage.getItem(key))) }
        }) 
    console.log(trainerArray)  
    dumClass = document.getElementById('class').value 
    dumSlot = document.getElementById('slot').value
    dumSubject = document.getElementById('subject').value 
    // console.log(dumClass)
    trainerArray.forEach(trainer=>{ 
            trainer.tSkills.forEach(skill=>{
                if(skill===dumSubject ) { 
                    fSubject=1;
                }
            } ) 
            if(trainer.tSlots[dumSlot-1]==0) { 
                fSlot=1;

            }
            if(fSubject==1 && fSlot==1) {
                availableTrainer.push(trainer.tEmail)
            }    
        })
    availableTrainer.forEach(email=> {
       trainerDropDown +=`<option value="${email}">${email}</option>` 
    })
    document.getElementById('trainer').innerHTML = trainerDropDown; 
    // localStorage.setItem(dumClass,JSON.stringify({
    //     slot: dumSlot,
    //     trainer: document.getElementById('trainer').value

    // }))
}  
function saveTrainerToClass() 
{   
    dumClass = document.getElementById('class').value 
    dumSlot = document.getElementById('slot').value
    dumSubject = document.getElementById('subject').value 
    console.log(localStorage.getItem(dumClass))
    let classArray = [];
    if(localStorage.getItem(dumClass) !=null || localStorage.getItem(dumClass) !=undefined ) {
        
        classArray=(JSON.parse(localStorage.getItem(dumClass)))   
    }
    classArray.push(
        {
            slot: dumSlot,
            subject: dumSubject,
            trainer: document.getElementById('trainer').value
    
        } ) 
    localStorage.setItem(dumClass,JSON.stringify(classArray)) 
    trainerEmail = document.getElementById('trainer').value
    var trainerObject = JSON.parse(localStorage.getItem(trainerEmail))
    trainerObject.tSlots[dumSlot-1]=1
    localStorage.setItem(trainerEmail,JSON.stringify(trainerObject))
}

function createTable()
{   let classDetail
    let row = ''
    dumClass = document.getElementById("classTime").value
    classDetail = JSON.parse(localStorage.getItem(dumClass))  
    console.log(classDetail) 
    classDetail.forEach(cla=>{ 
        if(cla) {
        row += `<tr>
        <td>
          ${cla.slot}
        </td>
        <td>
        ${cla.trainer}
        </td>
        <td>
        ${cla.subject}
        </td>
        </tr>` }
    })
    table = `<table>
    <tr> 
        <th>
             Session 
        </th>
        <th>
             Teacher 
        </th>
        <th>
             Subject 
        </th> 
    </tr> 
    ${row}
    </table>` 
  
document.getElementById('tbls').innerHTML=table;

}


=======
class Trainer {
    
    setValue(id,email,skills) {
        this.name=name;
        this.email=email;
        this.skill=skills;
}


    addToLocalStorage()
    {
        localStorage.setItem(this.email,JSON.stringify({
            tName: this.name,
            tEmail:this.email,
            tSkills: this.skill
        }))
    }  
}

function saveTrainer() {
        trainer = new Trainer() 
        var skillset = []
        var checkedValue = null; 
        let inputElements= document.getElementsByName('inp');
        console.log(inputElements)
        inputElements.forEach((ele) => {
         if(ele.checked) { 
           console.log(ele.value);
            checkedValue = ele.value;
           skillset.push(checkedValue);   
       }
    })
        trainer.setValue(
            document.getElementById('tName').value,
            document.getElementById('tEmail').value,
            skillset
        )
        trainer.addToLocalStorage()

        }

var class1 = []

var class2 = []


function showTrainer() {
    var trainerArray = []
    var availableTrainer = []
    var trainerDropDown = ''
    Object.keys(localStorage).forEach(key=>
        {    console.log(key)
             if(key!='Class1' && key!='Class2') {
            trainerArray.push(JSON.parse(localStorage.getItem(key))) }
        }) 
    console.log(trainerArray)  
    dumClass = document.getElementById('class').value 
    dumSlot = document.getElementById('slot').value
    dumSubject = document.getElementById('subject').value 
    // console.log(dumClass)
    trainerArray.forEach(trainer=>{ 
           
            trainer.tSkills.forEach(skill=>{
                if(skill==dumSubject) {
                    availableTrainer.push(trainer.tEmail)
                }
            } )
             
        }) 
        // console.log(availableTrainer)
        class1.push([dumSlot,dumSubject])
        // console.log(class1) 

    availableTrainer.forEach(email=> {
       trainerDropDown +=`<option value="">${email}</option>` 
    })
    document.getElementById('trainer').innerHTML = trainerDropDown; 
    // localStorage.setItem(dumClass,JSON.stringify({
    //     slot: dumSlot,
    //     trainer: document.getElementById('trainer').value

    // }))
}  

function saveTrainer() 
{   let classArray = []
    dumClass = document.getElementById('class').value 
    dumSlot = document.getElementById('slot').value
    dumSubject = document.getElementById('subject').value 
         console.log(JSON.parse(localStorage.getItem(dumClass)))
        classArray = JSON.parse(localStorage.getItem(dumClass))
        classArray.push( 
        {
            slot: dumSlot,
            trainer: document.getElementById('trainer').value
    
        } ) 
       localStorage.setItem(dumClass,JSON.stringify(classArray))

    


}
    


>>>>>>> 25d5a60fe6b9224e34ea61a175ff26e8efddf851
