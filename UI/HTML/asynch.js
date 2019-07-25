const  getUser = () =>{
const url ="https://reqres.in/api/users?page=3"
// const response = fetch(url,{
//     method: 'GET'
// }).then(()=>{

// }).catch()
fetch(url).then(res=>res.json()).then((result)=>{ 
    let rows=''
     result.data.forEach( u => { 
        rows += `<tr>

        <th>${u.first_name}</th>

        <th>${u.email}</th>

        <th><img src="${u.avatar}" /></th>

    </tr>`

});
document.getElementById('tbl').innerHTML = `<table>

<tr>

<th>NAME</th>

<th>EMAIL</th>

<th></th>

</tr>

${rows}

</table>`;         

})
}

        
    // });
    console.log(result.data)


getUser(); 

const postUser = () =>{
    const url ="https://reqres.in/api/users"
    // const response = fetch(url,{
    //     method: 'GET'
    // }).then(()=>{
    
    // }).catch()
    fetch(_url,{

        method: 'POST',

        body: JSON.stringify( {

            first_name: "Vikram",

            salary: 26000,

        })

    }).catch(e=>{

        console.log(e);
    });

} 
postUser();

    

