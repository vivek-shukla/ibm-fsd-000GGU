const posts = [
    { title: "Hello Bro",
      body: "body 1"

    },
    { title: "Hello Bro 2",
      body: "body 2"
    }
]

function getPosts() {
    setTimeout(()=>{
      let output = ''
      posts.forEach((post,index) => {

        output += `<li>${index}: ${post.title}<li>`
      });
      document.body.innerHTML=output
    },1000)  // callback function and time in second 
}

function createPost(post) { 
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            posts.push(post)
        const error = true;
        if(!error) {
            resolve();
        }
        else {
            reject("error: something went wrong ");
        }
       },2000)

    })
    
}



// createPost({title:"hello bro3",body:"body 3"},getPosts)
// .then(getPosts)
// .catch(err=>console.log(err))

// const promise1 = Promise.resolve("This is first example of creating promise")
// const promise2 = " this is second "
// const promise3 = new Promise((resolve,reject)=>{
//     setTimeout(resolve,2000,"This is created using new promise object having set Timeout method")
// })
// const promise4 = fetch('https://jsonplaceholder.typicode.com/photos')
//                  .then(res=>res.json())

// Promise.all([promise1,promise2,promise3,promise4])
// .then(values=>console.log(values))


// Asynch / Await ( await waits for an asynchronus process to complete )
async function init() {
    await createPost({title:"hello bro3",body:"body 3"});
    getPosts();
    // It'll await for createPost method to complete 
}

async function fetchUser() {
    const res = await fetch('https://jsonplaceholder.typicode.com/photos')
    const data = await res.json()
    console.log(data)
    document.body.innerHTML = data[10].title
}

fetchUser();
init();