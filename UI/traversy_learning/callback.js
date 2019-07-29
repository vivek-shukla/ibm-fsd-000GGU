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

function createPost(post,callback) {
    setTimeout(()=>{
         posts.push(post)
         callback();
    },2000)
}

createPost({title:"hello bro3",body:"body 3"},getPosts);

getPosts();