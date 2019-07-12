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
    


